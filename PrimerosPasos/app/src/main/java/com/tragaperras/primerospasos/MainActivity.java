package com.tragaperras.primerospasos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mensajeTextView;

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
    }
}
