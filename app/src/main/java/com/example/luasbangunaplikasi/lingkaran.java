package com.example.luasbangunaplikasi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class lingkaran extends Activity {

    private EditText txtJari;
    private EditText txtLuas;
    private Button btnHitung,btnRumus;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        txtJari = (EditText) findViewById(R.id.txtJari);
        txtLuas = (EditText) findViewById(R.id.txtLuas);
        btnHitung = (Button) findViewById(R.id.btnHitung);
        btnRumus = (Button) findViewById(R.id.btnRumus);

    }
            public void Rumus(View v) {
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kelaspintar.id"));
                startActivity(implicit);
            }
            public void hitungLuas(View view) {
                try {
                    int jari = Integer.parseInt(txtJari.getText().toString());
                    double phi = 3.14;
                    double luas = phi * jari * jari;
                    txtLuas.setText(String.valueOf(luas));

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            public void backtoMenu(View view) {
                finish();
            }
        }