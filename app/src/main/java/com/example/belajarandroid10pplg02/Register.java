package com.example.belajarandroid10pplg02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Register extends AppCompatActivity {

    Button regisbutton;
    EditText regisnama;
    EditText regispassword;
    EditText regisemail;
    EditText regisalamat;
    EditText regisnowa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);

        regisbutton = (Button) findViewById(R.id.regisbutton);
        regisnama = (EditText) findViewById(R.id.regisnama);
        regispassword = (EditText) findViewById(R.id.regispassword);
        regisemail = (EditText) findViewById(R.id.regisemail);
        regisalamat = (EditText) findViewById(R.id.regisalamat);
        regisnowa = (EditText) findViewById(R.id.regisnowa);

        regisbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = regisnama.getText().toString();
                String password = regispassword.getText().toString();
                String email = regisemail.getText().toString();
                String alamat = regisalamat.getText().toString();
                String wa = regisnowa.getText().toString();

                Intent intent = new Intent(Register.this, ConfirmRegister.class);
                intent.putExtra("KEY_1", nama);
                intent.putExtra("KEY_2", password);
                intent.putExtra("KEY_3", email);
                intent.putExtra("KEY_4", alamat);
                intent.putExtra("KEY_5", wa);

                startActivity(intent);
            }
        });

        }
    }