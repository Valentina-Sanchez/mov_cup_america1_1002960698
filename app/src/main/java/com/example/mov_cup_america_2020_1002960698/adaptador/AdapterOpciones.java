package com.example.mov_cup_america_2020_1002960698.adaptador;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mov_cup_america_2020_1002960698.R;
import com.example.mov_cup_america_2020_1002960698.modelo.ItemModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;


public class AdapterOpciones extends RecyclerView.Adapter<AdapterOpciones.AdapterViewHolder>{


    private List<ItemModel> listaDatos;
    private int resource;
    private Activity context;

    public AdapterOpciones(ArrayList<ItemModel> listaDatos, int resource, Activity context) {
        this.listaDatos = listaDatos;
        this.resource = resource;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(resource,viewGroup,false);
        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterViewHolder adapterViewHolder, int i) {
        ItemModel itemModel = listaDatos.get(i);
        Picasso.get().load(itemModel.getImg()).into(adapterViewHolder.imagen);
        adapterViewHolder.nombre.setText(itemModel.getNombre());
        adapterViewHolder.descrip.setText(itemModel.getDescripcion());
        adapterViewHolder.edad.setText(""+itemModel.getHora());
    }

    @Override
    public int getItemCount() {
        return listaDatos.size();
    }

    public class AdapterViewHolder extends RecyclerView.ViewHolder{

        ImageView imagen;
        TextView nombre;
        TextView descrip;
        TextView edad;

        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);

            imagen = itemView.findViewById(R.id.itemImg);
            nombre = itemView.findViewById(R.id.itemTitulo);
            descrip = itemView.findViewById(R.id.itemDescrip);
            edad = itemView.findViewById(R.id.itemEdad);
        }
    }


}

