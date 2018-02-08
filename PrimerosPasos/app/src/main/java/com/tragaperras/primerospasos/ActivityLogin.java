package com.tragaperras.primerospasos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityLogin extends AppCompatActivity {

    private EditText _nickEditTxt;
    private EditText _passEditTxt;
    private Button _loginBtn;

    private String USUARIO1="juan";
    private String PASSWORD1="1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        _nickEditTxt = (EditText) findViewById(R.id.nickEditTxt);
        _passEditTxt = (EditText) findViewById(R.id.passEditTxt);
        _loginBtn = (Button) findViewById(R.id.loginBtn);

        _loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Aqui vamos a etar cuando se haga click:
                String nick = _nickEditTxt.getText().toString();
                String pass = _passEditTxt.getText().toString();

                if (nick.equals(USUARIO1) && pass.equals(PASSWORD1))
                {
                    //Usuario correcto
                    //Abrir una ventana
                    Intent perritoPiloto = new Intent(getApplicationContext(), MainActivity.class);
                    perritoPiloto.putExtra("USUARIO", nick);
                    perritoPiloto.putExtra("PASSWORD", pass);
                    startActivity(perritoPiloto);
                }
                else
                {
                    //Usuario incorrecto
                    Toast.makeText(getApplicationContext(),"Usuario incorrecto", Toast.LENGTH_SHORT).show();
                }

            }
        });



    }
}
