package com.ptp.phamtanphat.intentdata1607;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class Manhinh2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh2);


        //Kieu 1 : Nhan String
//        Intent intent = getIntent();
//        if (intent.hasExtra("chuoi")){
//            String chuoi = intent.getStringExtra("chuoi");
//            Log.d("BBB",chuoi);
//        }
        //Kieu 2 : Nhan Integer
//        Intent intent = getIntent();
//        if (intent.hasExtra("number")){
//            Integer number = intent.getIntExtra("number",0);
//            Log.d("BBB",number  + "");
//        }
        //Kieu 3 : Nhan Arraylist
//        Intent intent = getIntent();
//        if (intent.hasExtra("mang")){
//            ArrayList<String> mangten = intent.getStringArrayListExtra("mang");
//            Log.d("BBB",mangten.size()  + "");
//        }
        //Kieu 4 : Object
        Intent intent = getIntent();
        if (intent.hasExtra("object")){
            Nhanvien nhanvien = (Nhanvien) intent.getSerializableExtra("object");
            Log.d("BBB",nhanvien.ten );
        }
    }
}
