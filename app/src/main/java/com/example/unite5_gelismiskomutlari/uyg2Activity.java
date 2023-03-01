package com.example.unite5_gelismiskomutlari;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class uyg2Activity extends AppCompatActivity {

    Button btn1;
    EditText txtsayi1, txtsayi2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg2_activity);
        btn1 = findViewById(R.id.btnsayi1);
        txtsayi1 = findViewById(R.id.txtsayi1);
        txtsayi2 = findViewById(R.id.txtsayi2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sonuc = topla();
                Toast.makeText(getApplicationContext(),
                        Integer.toString(sonuc),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
    private int topla() {
        return 5 + 10;
    }
}