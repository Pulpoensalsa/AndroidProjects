package com.tragaperras.primerospasos;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }


    @Override
    protected void onResume() {
        super.onResume();

        //will care for all posts
        Handler mHandler = new Handler();
        mHandler.postDelayed(tareaDespuesDelay, 3000);

    }


    //will launch the activity
    private Runnable tareaDespuesDelay =
            new Runnable() {
        public void run() {


            //Abrir una ventana
            Intent abrirActivity = new Intent(getApplicationContext(), ActivityLogin.class);
            startActivity(abrirActivity);
            finish();
        }
    };



}
