package com.example.belajarandroid10pplg02;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class ConfirmRegister extends AppCompatActivity {

    TextView Nama;
    TextView Password;
    TextView Email;
    TextView Alamat;
    TextView Whatsapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_confirm_register);
        Nama = (TextView) findViewById(R.id.nama);
        Password = (TextView) findViewById(R.id.password);
        Email = (TextView) findViewById(R.id.email);
        Alamat = (TextView) findViewById(R.id.alamat);
        Whatsapp = (TextView) findViewById(R.id.whatsapp);

        String a = getIntent().getStringExtra("KEY_1");
        String b = getIntent().getStringExtra("KEY_2");
        String c = getIntent().getStringExtra("KEY_3");
        String d = getIntent().getStringExtra("KEY_4");
        String e = getIntent().getStringExtra("KEY_5");

        Nama.setText("Nama : " + a);
        Password.setText("Password : " + b);
        Email.setText("Email : " + c);
        Alamat.setText("Alamat : " + d);
        Whatsapp.setText("Whatsapp : " + e);

    }
}