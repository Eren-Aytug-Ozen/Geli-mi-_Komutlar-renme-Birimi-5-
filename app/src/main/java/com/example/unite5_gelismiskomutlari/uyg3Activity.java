package com.example.unite5_gelismiskomutlari;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class uyg3Activity extends AppCompatActivity{
    Button btntopla;
    EditText toplasayi1,toplasayi2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg3_avtivity);
        btntopla = findViewById(R.id.toplama1);
        toplasayi1 = findViewById(R.id.toplasayi1);
        toplasayi2 = findViewById(R.id.toplasayi2);
        btntopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1;
                sayi1 = Integer.parseInt(toplasayi1.getText().toString());
                int sayi2;
                sayi2 = Integer.parseInt(toplasayi2.getText().toString());
                int sonuc = topla(sayi1,sayi2);
                Toast.makeText(getApplicationContext(),
                        Integer.toString(sonuc),Toast.LENGTH_LONG).show();
            }
        });
    }
    private int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }
    }
