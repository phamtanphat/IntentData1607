package com.ptp.phamtanphat.intentdata1607;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

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
        //Kieu 1 : Nhan Integer
        Intent intent = getIntent();
        if (intent.hasExtra("number")){
            Integer number = intent.getIntExtra("number",0);
            Log.d("BBB",number  + "");
        }
    }
}
