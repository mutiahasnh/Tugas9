package com.example.luasbangunaplikasi;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.ViewAnimator;
import android.content.DialogInterface;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnPersegi, btn_Persegipanjang, btn_Segitiga, btnLingkaran, btnKeluar;

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);
        btnPersegi = findViewById(R.id.btnPersegi);
        btn_Persegipanjang = findViewById(R.id.btn_Persegipanjang);
        btn_Segitiga = findViewById(R.id.btn_Segitiga);
        btnLingkaran = findViewById(R.id.btnLingkaran);
        btnKeluar =  findViewById(R.id.btnKeluar);

        btnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,persegi.class));
            }
        });

        btn_Persegipanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, persegipanjang.class));
            }
        });

        btn_Segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, segitiga.class));
            }
        });

        btnLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, lingkaran.class));
            }
        });



        }
    }
