package com.tragaperras.primerospasos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.tragaperras.primerospasos.Adaptadores.MyAdapter;
import com.tragaperras.primerospasos.Adaptadores.UserModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView mensajeTextView;
    private RecyclerView listaElementos;
    private MyAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mensajeTextView = (TextView) findViewById(R.id.mensajeTextView);

        Intent perritoPiloto = getIntent();
        String nombreUsuario = perritoPiloto.getStringExtra("USUARIO");
        String pass = perritoPiloto.getStringExtra("PASSWORD");

        mensajeTextView.setText("Acaba de hacer log in el usuario " + nombreUsuario
                + " con password " + pass);





        listaElementos = (RecyclerView) findViewById(R.id.my_recycler_view);
        // Usar esta línea para mejorar el rendimiento
        // si sabemos que el contenido no va a afectar
        // el tamaño del RecyclerView
        listaElementos.setHasFixedSize(true);

        // Nuestro RecyclerView usará un linear layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        listaElementos.setLayoutManager(layoutManager);

        // Asociamos un adapter (ver más adelante cómo definirlo)
        mAdapter = new MyAdapter(getData());
        listaElementos.setAdapter(mAdapter);
    }


    // create fake data for this example
    public List<UserModel> getData() {

        List<UserModel> userModels = new ArrayList<>();

        userModels.add(new UserModel("Gustavo", "Martinez"));
        userModels.add(new UserModel("Daniel","Martinez"));
        userModels.add(new UserModel("Cecilia", "Martinez"));
        userModels.add(new UserModel("Diego", "Martinez"));
        userModels.add(new UserModel("Carlos", "Martinez"));
        userModels.add(new UserModel("Juan", "Martinez"));

        for(int i = 1; i < 100; i++) {
            userModels.add(new UserModel("Name " + i, ""+ i+i+i+i+i ));
        }

        return userModels;
    }


}
