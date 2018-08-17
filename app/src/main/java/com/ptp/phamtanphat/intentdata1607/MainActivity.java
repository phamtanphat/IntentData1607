package com.ptp.phamtanphat.intentdata1607;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Button btnString,btnNumber,btnArraylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnString = findViewById(R.id.buttonIntentString);
        btnNumber = findViewById(R.id.buttonIntentNumber);
        btnArraylist = findViewById(R.id.buttonIntentArraylist);

        btnNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SendData("number",30);

            }
        });
        btnString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SendData("chuoi","Chao man hinh 2");
            }
        });
        btnArraylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<String> mangten = new ArrayList<>(Arrays.asList("Nguyen Van A","Nguyen Van B","Nguyen Van C"));
                Intent intent = new Intent(MainActivity.this,Manhinh2Activity.class);
                intent.putStringArrayListExtra("mang",mangten);
                startActivity(intent);
            }
        });

    }
    public <T> void SendData(String chuoi,T value){
        Intent intent = new Intent(MainActivity.this,Manhinh2Activity.class);
        if (value instanceof String){
            intent.putExtra(chuoi,(String) value);
        }
        if (value instanceof Integer){
            intent.putExtra(chuoi,(Integer) value);
        }
        if (value instanceof ArrayList<?>){
            if (value instanceof String){
                intent.putStringArrayListExtra(chuoi,(ArrayList<String>) value);
            }
        }
        startActivity(intent);
    }
}
