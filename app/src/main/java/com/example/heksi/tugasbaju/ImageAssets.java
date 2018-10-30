package com.example.heksi.tugasbaju;

import java.util.ArrayList;
import java.util.List;

public class ImageAssets {

    //variable yang mengkelompokkan atas
    //public digunakan agar bisa diakses disemua class
    //static sifat yg sudah menempel di class itu, tanpa memanggil objectnya
    public static List<Integer> atas = new ArrayList<Integer>(){{
        add(R.drawable.atas2);
        add(R.drawable.atas3);
        add(R.drawable.atas4);
        add(R.drawable.atas6);
        add(R.drawable.atas7);
    }};


    //variable yang mengkelompokkan atas
    //public digunakan agar bisa diakses disemua class
    //static sifat yg sudah menempel di class itu, tanpa memanggil objectnya
    public static List<Integer> bawah = new ArrayList<Integer>(){{
        add(R.drawable.bawah1);
        add(R.drawable.bawah2);
        add(R.drawable.bawah3);
        add(R.drawable.bawah4);
        add(R.drawable.bawah5);
    }};

    public static List<Integer> getAtas() {
        return atas;
    }

    public static List<Integer> getBawah() {
        return bawah;
    }
}
