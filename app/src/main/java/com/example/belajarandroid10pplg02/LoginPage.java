package com.example.belajarandroid10pplg02;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginPage extends AppCompatActivity {

    EditText edUsername;
    EditText edPassword;
    Button btnLogin;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login_page);

        sharedPreferences = getSharedPreferences("LOGIN_PREF", MODE_PRIVATE);
        edUsername = (EditText) findViewById(R.id.loginnama);
        edPassword = (EditText) findViewById(R.id.loginpassword);
        btnLogin = (Button) findViewById(R.id.loginbtn);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // cek apakah username dan passwordnya admin
                String username = edUsername.getText().toString();
                String password = edPassword.getText().toString();
                if(username.equals("admin") && password.equals("admin")){
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("username", username);
                    editor.apply();
                    //sukses
                    Toast.makeText(LoginPage.this, "sukses login", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(LoginPage.this, MainActivity.class));
                }else{
                    //gagal
                    Toast.makeText(LoginPage.this, "gagal login", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}