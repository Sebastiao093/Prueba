package co.com.ceiba.mobile.pruebadeingreso.view;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import co.com.ceiba.mobile.pruebadeingreso.R;
import co.com.ceiba.mobile.pruebadeingreso.adapter.PublicacionAdapter;
import co.com.ceiba.mobile.pruebadeingreso.model.Publicacion;


public class PostActivity extends AppCompatActivity {

    private List<Publicacion> publicaciones;
    private PublicacionAdapter publicacionAdapter;
    private RecyclerView publicacionesRecycler;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        publicacionesRecycler = findViewById(R.id.recyclerViewSearchResults);
        publicaciones = getPublicaciones();
        layoutManager = new LinearLayoutManager(this);
        publicacionesRecycler.setItemAnimator(new DefaultItemAnimator());

    }

    private List<Publicacion> getPublicaciones() {
        final ArrayList<Publicacion> publicaciones = new ArrayList<>();


        return publicaciones;
    }

    @Override
    protected void onStart() {
        super.onStart();
    }


}
