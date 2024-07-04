package com.example.elites;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class flash_screen extends AppCompatActivity {
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash_screen);

        // Initialize the timer
        timer = new Timer();

        // Schedule a task to run after 5 seconds
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // Create an intent to launch the Login activity
                Intent intent = new Intent(flash_screen.this, Login.class);
                startActivity(intent);
                finish(); // Close the current activity
            }
        }, 5000); // Delay in milliseconds (5 seconds)
    }
}
