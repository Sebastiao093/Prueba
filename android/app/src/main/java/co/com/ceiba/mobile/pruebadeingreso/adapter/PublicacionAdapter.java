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
import co.com.ceiba.mobile.pruebadeingreso.model.Publicacion;

public class PublicacionAdapter extends RecyclerView.Adapter<PublicacionAdapter.PublicacionViewHolder> {

    private List<Publicacion> publicaciones;
    private int layout;
    private Activity activity;

    public PublicacionAdapter(List<Publicacion> publicaciones, int layout, Activity activity) {
        this.publicaciones = publicaciones;
        this.layout = layout;
        this.activity = activity;
    }

    @NonNull
    @Override
    public PublicacionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(layout, parent, false);
        return new PublicacionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PublicacionViewHolder holder, int position) {
        Publicacion publicacion = publicaciones.get(position);
        holder.title.setText(publicacion.getTitle());
        holder.body.setText(publicacion.getText());
        holder.bind(publicaciones.get(position));

    }

    @Override
    public int getItemCount() {
        return publicaciones.size();
    }



    public class PublicacionViewHolder extends RecyclerView.ViewHolder{

        private TextView title;
        private TextView body;

        public PublicacionViewHolder (@NonNull View view) {
            super(view);
            title = view.findViewById(R.id.title);
            body = view.findViewById(R.id.body);
        }

        public void bind(final Publicacion publicacion){

        }


    }



}
