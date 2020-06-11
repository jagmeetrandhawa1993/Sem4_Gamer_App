package com.example.sem4_gamer_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class GameDetails extends AppCompatActivity {

    Button btnWrite = findViewById(R.id.btnWrite);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_details);

    }
}
