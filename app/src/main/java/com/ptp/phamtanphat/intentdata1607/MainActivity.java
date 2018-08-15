package com.ptp.phamtanphat.intentdata1607;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnString;
    Button btnNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnString = findViewById(R.id.buttonIntentString);
        btnNumber = findViewById(R.id.buttonIntentNumber);

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


    }
    public <T> void SendData(String chuoi,T value){
        Intent intent = new Intent(MainActivity.this,Manhinh2Activity.class);
        if (value instanceof String){
            intent.putExtra(chuoi,(String) value);
        }
        if (value instanceof Integer){
            intent.putExtra(chuoi,(Integer) value);
        }
        startActivity(intent);
    }
}
