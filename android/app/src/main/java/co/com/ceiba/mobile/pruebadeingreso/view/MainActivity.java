package co.com.ceiba.mobile.pruebadeingreso.view;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import co.com.ceiba.mobile.pruebadeingreso.R;
import co.com.ceiba.mobile.pruebadeingreso.adapter.UsuarioAdapter;
import co.com.ceiba.mobile.pruebadeingreso.model.Note;
import co.com.ceiba.mobile.pruebadeingreso.model.User;
import co.com.ceiba.mobile.pruebadeingreso.model.Usuario;
import co.com.ceiba.mobile.pruebadeingreso.viewmodel.NoteViewModel;
import co.com.ceiba.mobile.pruebadeingreso.viewmodel.UserViewModel;

import static com.google.gson.reflect.TypeToken.get;

public class MainActivity extends AppCompatActivity {

    //private List<Usuario> usuarios;
    //private UsuarioAdapter usuarioAdapter;
    //private RecyclerView usuariosRecycler;
    //private RecyclerView.LayoutManager layoutManager;
    private NoteViewModel noteViewModel;
    private UserViewModel userViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        noteViewModel = ViewModelProviders.of(this).get(NoteViewModel.class);
        noteViewModel.getAllNotes().observe((LifecycleOwner) this, new Observer<List<Note>>() {
            @Override
            public void onChanged(List<Note> notes) {
                Toast.makeText(MainActivity.this, "onChanged", Toast.LENGTH_SHORT).show();
            }
        });

        userViewModel = ViewModelProviders.of(this).get(UserViewModel.class);
        userViewModel.getAllUsers().observe((LifecycleOwner) this, new Observer<List<User>>() {
            @Override
            public void onChanged(List<User> users) {
                Toast.makeText(MainActivity.this, "onChanged", Toast.LENGTH_SHORT).show();
            }
        });
        //usuariosRecycler = findViewById(R.id.recyclerViewSearchResults);
        //usuarios = getUsuarios();
        //layoutManager = new LinearLayoutManager(this);
        //usuariosRecycler.setItemAnimator(new DefaultItemAnimator());

    }

    /*private List<Usuario> getUsuarios() {
        final ArrayList<Usuario> usuarios = new ArrayList<>();


        return usuarios;
    }*/

    /*@Override
    protected void onStart() {
        super.onStart();
    }*/


}