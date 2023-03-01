package com.example.unite5_gelismiskomutlari;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class uyg4Activity extends AppCompatActivity {
    EditText nbr1,nbr2,nbr3;
    Button btnnbr1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg4_activity);
        btnnbr1 = findViewById(R.id.btnnbr1);
        nbr1 = findViewById(R.id.nbr1);
        nbr2 = findViewById(R.id.nbr2);
        nbr3 = findViewById(R.id.nbr3);
        TextView textView = findViewById(R.id.textView);
        btnnbr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1;
                sayi1 = Integer.parseInt(nbr1.getText().toString());
                int sayi2;
                sayi2 = Integer.parseInt(nbr2.getText().toString());
                int sonuc = topla(sayi1,sayi2);
                textView.setText(Integer.toString(sonuc));
            }
        });
        Button btn2 = findViewById(R.id.btnnbr2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1;
                sayi1 = Integer.parseInt(nbr1.getText().toString());
                int sayi2;
                sayi2 = Integer.parseInt(nbr2.getText().toString());
                int sayi3;
                sayi3 = Integer.parseInt(nbr3.getText().toString());
                int sonuc = topla(sayi1,sayi2,sayi3);
                textView.setText(Integer.toString(sonuc));
            }
        });
    }
    private int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }
    private int topla(int sayi1, int sayi2,int sayi3) {
        return sayi1 + sayi2 + sayi3;
    }

}
