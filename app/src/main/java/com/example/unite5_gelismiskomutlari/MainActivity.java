package com.example.unite5_gelismiskomutlari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void uyg1(View view) {
        Intent i = new Intent(MainActivity.this,Uyg1Activity.class);
        startActivity(i);
    }
    public void uyg2(View view) {
        Intent i = new Intent(MainActivity.this,uyg2Activity.class);
        startActivity(i);
    }
    public void uyg3(View view) {
        Intent i = new Intent(MainActivity.this,uyg3Activity.class);
        startActivity(i);
    }
    public void uyg4(View view) {
        Intent i = new Intent(MainActivity.this,uyg4Activity.class);
        startActivity(i);
    }
}