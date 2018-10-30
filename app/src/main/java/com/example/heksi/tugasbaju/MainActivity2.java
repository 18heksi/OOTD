package com.example.heksi.tugasbaju;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override//memanggil class parentnya
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //digunakan untuk mengecek agar fragment yang dibuat hanya satu kali
        if (savedInstanceState == null){

            //inisasi adapter untuk mengaktifkan fragment
            FragmentManager fragmentManager = getSupportFragmentManager();

            Parts bodyPart;

            //HEADS
            // membuat object atas
            bodyPart = new Parts();
            //mengisi mimageids dengan image dari imageasset untuk heads
            bodyPart.setmImageIds(ImageAssets.getAtas());
            //mengisi mlistindex dengan array ke 0
            bodyPart.setmListIndex(0);

            //transaksi fragment heads
            fragmentManager.beginTransaction().add(R.id.atas_container, bodyPart).commit();

            //BODYS
            // membuat object bodys
            bodyPart = new Parts();
            //mengisi imageids dengan image dari imageasset untuk bodys
            bodyPart.setmImageIds(ImageAssets.getBawah());
            //mengisi mlistindex dengan array ke 0
            bodyPart.setmListIndex(0);

            //transaksi fragment bodys
            fragmentManager.beginTransaction().add(R.id.bawah_container, bodyPart).commit();


        }

    }
}
