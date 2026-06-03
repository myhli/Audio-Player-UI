package com.example.belajarandroid10pplg02;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvListAudio;

    Button logoutbutton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rvListAudio = findViewById(R.id.rvListAudio);
        logoutbutton = findViewById(R.id.logoutbutton);

        ArrayList<AudioModel> ListDataAudio = new ArrayList<>();
        ListDataAudio.add(new AudioModel("Alone Again", "The Weeknd", "R&B", 12000000, "https://i.pinimg.com/1200x/4f/86/c3/4f86c3073efb1e6aeda192d70d40b7d2.jpg"));
        ListDataAudio.add(new AudioModel("Too Late", "The Weeknd", "R&B", 11000000, "https://i.pinimg.com/1200x/4f/86/c3/4f86c3073efb1e6aeda192d70d40b7d2.jpg"));
        ListDataAudio.add(new AudioModel("Hardest To Love", "The Weeknd", "Drum and Bass", 10500000, "https://i.pinimg.com/1200x/4f/86/c3/4f86c3073efb1e6aeda192d70d40b7d2.jpg"));
        ListDataAudio.add(new AudioModel("Scared To Live", "The Weeknd", "Soft Rock", 10000000, "https://i.pinimg.com/1200x/4f/86/c3/4f86c3073efb1e6aeda192d70d40b7d2.jpg"));
        ListDataAudio.add(new AudioModel("Snowchild", "The Weeknd", "R&B", 9500000, "https://i.pinimg.com/1200x/4f/86/c3/4f86c3073efb1e6aeda192d70d40b7d2.jpg"));
        ListDataAudio.add(new AudioModel("Escape from LA", "The Weeknd", "R&B", 9800000, "https://i.pinimg.com/1200x/4f/86/c3/4f86c3073efb1e6aeda192d70d40b7d2.jpg"));
        ListDataAudio.add(new AudioModel("Heartless", "The Weeknd", "R&B", 16000000, "https://i.pinimg.com/1200x/4f/86/c3/4f86c3073efb1e6aeda192d70d40b7d2.jpg"));
        ListDataAudio.add(new AudioModel("Faith", "The Weeknd", "R&B", 11500000, "https://i.pinimg.com/1200x/4f/86/c3/4f86c3073efb1e6aeda192d70d40b7d2.jpg"));
        ListDataAudio.add(new AudioModel("Blinding Lights", "The Weeknd", "Synth-pop", 27000000, "https://i.pinimg.com/1200x/4f/86/c3/4f86c3073efb1e6aeda192d70d40b7d2.jpg"));
        ListDataAudio.add(new AudioModel("In Your Eyes", "The Weeknd", "Synth-pop", 14000000, "https://i.pinimg.com/1200x/4f/86/c3/4f86c3073efb1e6aeda192d70d40b7d2.jpg"));
        ListDataAudio.add(new AudioModel("Save Your Tears", "The Weeknd", "Synth-pop", 23000000, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ9CYbMeu7gJiPzDokIEoqobccYF7SNXSKgwQ&s"));
        ListDataAudio.add(new AudioModel("Repeat After Me (Interlude)", "The Weeknd", "Dream Pop", 8000000, "https://i.pinimg.com/1200x/4f/86/c3/4f86c3073efb1e6aeda192d70d40b7d2.jpg"));
        ListDataAudio.add(new AudioModel("After Hours", "The Weeknd", "R&B", 19000000, "https://i.pinimg.com/1200x/4f/86/c3/4f86c3073efb1e6aeda192d70d40b7d2.jpg"));
        ListDataAudio.add(new AudioModel("Until I Bleed Out", "The Weeknd", "R&B", 9000000, "https://i.pinimg.com/1200x/4f/86/c3/4f86c3073efb1e6aeda192d70d40b7d2.jpg"));

        AudioPlayer adapter = new AudioPlayer(ListDataAudio, audioItem -> {
            Intent intent = new Intent(MainActivity.this, DetailListAudio.class);
            intent.putExtra("LAGU", audioItem.getLagu());
            intent.putExtra("PEMBUAT", audioItem.getPembuat());
            intent.putExtra("GENRE", audioItem.getGenre());
            intent.putExtra("JUMLAH", audioItem.getJumlahpendengar());
            intent.putExtra("IMG", audioItem.getImgUrl());
            startActivity(intent);
        });

        rvListAudio.setLayoutManager(new LinearLayoutManager(this));
        rvListAudio.setAdapter(adapter);
    }
}
