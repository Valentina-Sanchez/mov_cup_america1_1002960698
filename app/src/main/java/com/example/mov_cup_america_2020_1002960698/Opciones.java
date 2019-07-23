package com.example.mov_cup_america_2020_1002960698;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mov_cup_america_2020_1002960698.adaptador.AdapterOpciones;
import com.example.mov_cup_america_2020_1002960698.modelo.ItemModel;

import java.util.ArrayList;
import java.util.List;

public class Opciones  extends AppCompatActivity {

    List<ItemModel> listaDatos;
    AdapterOpciones adapterOpciones;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);

        listaDatos = new ArrayList<>();
        llenarListaDatos();
        recyclerView = findViewById(R.id.opcRecicler);
        adapterOpciones = new AdapterOpciones((ArrayList<ItemModel>) listaDatos,R.layout.item_opc,this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapterOpciones);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapterOpciones.notifyDataSetChanged();

    }

    private void llenarListaDatos() {
        listaDatos.add(new ItemModel("Colombia vs Brasil","Estadio Maracana","Hora 2:00 pm","http://178.79.168.182/assets/uploads/blogs/blog_thumbnails/brazil_vs_colombia.jpg"));
        listaDatos.add(new ItemModel("Argentina vs Perú","Estadio Beira-Rio","Hora 9:30am","https://media.diariolasamericas.com/adjuntos/216/imagenes/001/174/0001174107.jpg"));
        listaDatos.add(new ItemModel("Chile vs Paraguay","Estadio Mireinao","Hora 5:40pm","https://www.pasionfutbol.com/__export/1562009379322/sites/pasionlibertadores/img/2019/07/01/chile_peru_1_crop1562009321063.jpg_715985292.jpg"));
        listaDatos.add(new ItemModel("Colombia vs Argentina","Estadio Maracana","Hora  1:50pm","http://178.79.168.182/assets/uploads/blogs/blog_thumbnails/brazil_vs_colombia.jpg"));
        listaDatos.add(new ItemModel("Argentina vs Brasil","Estadio Mato-Grosso","Hora 10:30am","https://media.diariolasamericas.com/adjuntos/216/imagenes/001/174/0001174107.jpg"));
        listaDatos.add(new ItemModel("Chile vs Brasil","Estadio Sao Paulo","Hora 4:40pm","https://www.pasionfutbol.com/__export/1562009379322/sites/pasionlibertadores/img/2019/07/01/chile_peru_1_crop1562009321063.jpg_715985292.jpg"));

    }

    public void onlista (View view){
        Intent intent = new Intent(this,informacion.class);
        startActivity(intent);
    }

}

