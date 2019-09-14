package co.com.ceiba.mobile.pruebadeingreso.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import co.com.ceiba.mobile.pruebadeingreso.R;
import co.com.ceiba.mobile.pruebadeingreso.model.Usuario;

public class UsuarioAdapter extends RecyclerView.Adapter<UsuarioAdapter.UsuarioViewHolder> {

    private List<Usuario> usuarios;
    private int layout;
    private Activity activity;
    private OnItemClickListener itemClickListener;

    public UsuarioAdapter(List<Usuario> usuarios, int layout, Activity activity, OnItemClickListener itemClickListener) {
        this.usuarios = usuarios;
        this.layout = layout;
        this.activity = activity;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public UsuarioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(layout, parent, false);
        return new UsuarioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UsuarioViewHolder holder, int position) {
        Usuario usuario = usuarios.get(position);
        holder.name.setText(usuario.getName());
        holder.phone.setText(usuario.getPhone());
        holder.email.setText(usuario.getEmail());
        holder.bind(usuarios.get(position), itemClickListener);

    }

    @Override
    public int getItemCount() {
        return usuarios.size();
    }



    public class UsuarioViewHolder extends RecyclerView.ViewHolder{

        private TextView name;
        private TextView phone;
        private TextView email;

        public UsuarioViewHolder (@NonNull View view) {
            super(view);
            name = view.findViewById(R.id.name);
            phone = view.findViewById(R.id.phone);
            email = view.findViewById(R.id.email);
        }

        public void bind(final Usuario usuario, final OnItemClickListener listener){

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.OnItemClick(usuario, getAdapterPosition());
                }
            });
        }


    }




    public interface OnItemClickListener{
        void OnItemClick(Usuario usuario, int posicion);

    }

}
