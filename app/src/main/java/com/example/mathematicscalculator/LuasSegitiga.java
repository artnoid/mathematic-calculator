package com.example.mathematicscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class LuasSegitiga extends AppCompatActivity {

    private Button btnHasil;
    private TextView tvHasil;
    private EditText etAlas,etTinggi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_segitiga);

        btnHasil = findViewById(R.id.btn_hasil);
        tvHasil = findViewById(R.id.tv_hasil);
        etAlas = findViewById(R.id.et_alas);
        etTinggi = findViewById(R.id.et_tinggi);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                try {
                    String sAlas = etAlas.getText().toString();
                    String sTinggi = etTinggi.getText().toString();

                    double alas = Double.parseDouble(sAlas);
                    double tinggi = Double.parseDouble(sTinggi);

                    double hasil = 0.5 * alas * tinggi;

                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                }catch(Exception e){
                    Toast.makeText(getApplicationContext(), "Filel Tidak Boleh Kosong",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}