package com.example.belajarandroid10pplg02;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

public class DetailListAudio extends AppCompatActivity {

    ImageView img;
    TextView tvLagu, tvPembuat, tvGenre, tvJumlah;
    Button btnPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_list_audio);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        img = findViewById(R.id.detail_img);
        tvLagu = findViewById(R.id.detail_lagu);
        tvPembuat = findViewById(R.id.detail_pembuat);
        tvGenre = findViewById(R.id.detail_genre);
        tvJumlah = findViewById(R.id.detail_jumlahpendengar);
        btnPlay = findViewById(R.id.buttonplay);

        String lagu = getIntent().getStringExtra("LAGU");
        String pembuat = getIntent().getStringExtra("PEMBUAT");
        String genre = getIntent().getStringExtra("GENRE");
        int jumlah = getIntent().getIntExtra("JUMLAH", 0);
        String imageUrl = getIntent().getStringExtra("IMG");

        tvLagu.setText(lagu);
        tvPembuat.setText(pembuat);
        tvGenre.setText(genre);
        tvJumlah.setText(String.valueOf(jumlah) + " Listener");

        // Load gambar menggunakan Glide
        Glide.with(this)
                .load(imageUrl)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)
                .into(img);

        btnPlay.setOnClickListener(v -> {
            Toast.makeText(DetailListAudio.this, "Judul Lagu: " + lagu, Toast.LENGTH_SHORT).show();
        });
    }
}
