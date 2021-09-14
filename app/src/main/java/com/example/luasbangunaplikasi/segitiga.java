package com.example.luasbangunaplikasi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class segitiga extends Activity {

    private EditText txtAlas;
    private EditText txtTinggi;
    private EditText txtLuas;
    private Button btnHitung,btnRumus;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        txtAlas = (EditText) findViewById(R.id.txtAlas);
        txtTinggi = (EditText) findViewById(R.id.txtTinggi);
        txtLuas = (EditText) findViewById(R.id.txtLuas);
        btnHitung = (Button) findViewById(R.id.btnHitung);
        btnRumus =  (Button) findViewById(R.id.btnRumus);
    }
    public void Rumus (View view) {
        Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kelaspintar.id"));
        startActivity(implicit);
    }
    public void hitungLuas(View view) {
        try {
            int alas = Integer.parseInt(txtAlas.getText().toString());
            int tinggi = Integer.parseInt(txtTinggi.getText().toString());
            int luas = (alas * tinggi) / 2;
            txtLuas.setText(String.valueOf(luas));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void backtoMenu(View view) {
        finish();
    }


}