package com.example.mathematicscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnLuasSegitiga;
    private Button btnLuasJajarGenjang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLuasSegitiga = findViewById(R.id.btn_triangle);
        btnLuasJajarGenjang = findViewById(R.id.btn_jajargenjang);

        btnLuasSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(MainActivity.this , LuasSegitiga.class);
                startActivity(moveIntent);
            }
        });

        btnLuasJajarGenjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(MainActivity.this , LuasJajargenjang.class);
                startActivity(moveIntent);
            }
        });
    }
}
