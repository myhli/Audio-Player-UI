package com.example.belajarandroid10pplg02;

import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class homepage extends AppCompatActivity {

    TextView tvWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        tvWelcome = findViewById(R.id.tvWelcome);

        String usernamejipok = getIntent().getStringExtra("KEY_USERNAME");

        if (usernamejipok != null) {
            tvWelcome.setText("What do you think?, " + usernamejipok);
        } else {
            tvWelcome.setText("What do you think?, Nameless");
        }
    }
}