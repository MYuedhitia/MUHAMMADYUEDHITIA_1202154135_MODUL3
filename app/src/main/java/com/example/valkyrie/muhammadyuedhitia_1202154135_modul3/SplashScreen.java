package com.example.valkyrie.muhammadyuedhitia_1202154135_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import com.example.valkyrie.muhammadyuedhitia_1202154135_modul3.R;

public class SplashScreen extends AppCompatActivity {
    //Set waktu lama splashscreen
    private static int splashInterval = 2000;

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);

            //menghilangkan ActionBar
            this.requestWindowFeature(Window.FEATURE_NO_TITLE);
            setContentView(R.layout.activity_splash_screen);

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(getApplicationContext(), Login.class));
                    finish();
                }
            }, 5000L); //5000 L = 5 detik
        }
    }
