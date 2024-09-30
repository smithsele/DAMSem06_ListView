package com.example.damsem06_listview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lista;
    List<String> estudiantes;
    private int position;
    private android.util.Log Log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Lista de Estudiantes");
        lista = findViewById(R.id.listView);

        estudiantes = new ArrayList<>();
        estudiantes.add("Tenorio");
        estudiantes.add("Navarro");
        estudiantes.add("Vegas");
        estudiantes.add("Urbisagastegui");
        estudiantes.add("Moreno");
        estudiantes.add("...");

        ArrayAdapter adaptadorEstudiantes = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                estudiantes
        );

        lista.setAdapter(adaptadorEstudiantes);
        lista.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        String nombreEstudiante = estudiantes.get(position);
        Log.i("DAM","Estudiante Seleccionado:" + nombreEstudiante);
    }
}