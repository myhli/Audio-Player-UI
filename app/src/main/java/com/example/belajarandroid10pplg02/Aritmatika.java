package com.example.belajarandroid10pplg02;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Aritmatika extends AppCompatActivity {

    EditText angka1;
    EditText angka2;
    Button btnTambah;
    Button btnKurang;
    Button btnBagi;
    Button btnKali;
    Button btnReset;
    TextView textHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_aritmatika);
        angka1 = (EditText)  findViewById(R.id.angka1);
        angka2 = (EditText)  findViewById(R.id.angka2);
        btnTambah = (Button) findViewById(R.id.btnTambah);
        btnKurang = (Button) findViewById(R.id.btnKurang);
        btnKali = (Button) findViewById(R.id.btnKali);
        btnBagi = (Button) findViewById(R.id.btnBagi);
        btnReset = (Button) findViewById(R.id.btnReset);
        textHasil = (TextView) findViewById(R.id.textHasil);

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                    int angka01 = Integer.parseInt(angka1.getText().toString());
                    int angka02 = Integer.parseInt(angka2.getText().toString());
                    int hasil = angka01 - angka02;
                    textHasil.setText("Hasil : " + hasil);
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                    int angka01 = Integer.parseInt(angka1.getText().toString());
                    int angka02 = Integer.parseInt(angka2.getText().toString());
                    int hasil = angka01 * angka02;
                    textHasil.setText("Hasil : " + hasil);
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                    double angka01 = Double.parseDouble(angka1.getText().toString());
                    double angka02 = Double.parseDouble(angka2.getText().toString());
                    double hasil = angka01 / angka02;
                    textHasil.setText("Hasil : " + hasil);
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textHasil.setText("hasil : ");
                angka1.setText("");
                angka2.setText("");
            }

        });
        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int angka01 = Integer.parseInt(angka1.getText().toString());
                int angka02 = Integer.parseInt(angka2.getText().toString());
                int hasil = angka01 + angka02;
                textHasil.setText("Hasil : " + hasil);


            }
        });

    }
}