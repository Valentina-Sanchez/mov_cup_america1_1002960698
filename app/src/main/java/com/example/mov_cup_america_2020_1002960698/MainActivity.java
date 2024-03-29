package com.example.mov_cup_america_2020_1002960698;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtNombre, edtContr;
    Button btnAcceder, btnRegistro;

    String nombre,contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNombre = findViewById(R.id.mainEdtNombre);
        edtContr = findViewById(R.id.mainEdtContr);
        btnAcceder = findViewById(R.id.mainBtnAcceder);
        btnRegistro = findViewById(R.id.mainBtnRegistro);

        nombre = "Admin";
        contraseña = "admin";

        btnAcceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edtNombre.getText().toString().equals(nombre) && edtContr.getText().toString().equals(contraseña)) {
                    Toast.makeText(MainActivity.this, "Bienvenido " + nombre, Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, Opciones.class);
                    startActivity(i);

                } else {
                    Toast.makeText(MainActivity.this, "Verificar Datos", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Registro.class);
                startActivity(intent);
            }
        });
    }

}