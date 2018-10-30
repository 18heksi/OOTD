package com.example.heksi.tugasbaju;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        img = (ImageView)findViewById(R.id.splash);
        txt = (TextView)findViewById(R.id.textSplash);

        //digunakan untuk membuka activity selanjutnya
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //membuka MainActivity2
                startActivity(new Intent(getApplicationContext(), MainActivity2.class));
                finish();
            }
        }, 3000L); //3000 L = 3 detik
    }
}
