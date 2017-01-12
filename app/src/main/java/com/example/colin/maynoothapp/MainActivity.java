package com.example.colin.maynoothapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton peoplefinder;
    ImageButton dining;
    ImageButton library;
    ImageButton calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peoplefinder = (ImageButton) findViewById(R.id.peoplefinder);

        peoplefinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadPeopleFinder = new Intent(MainActivity.this, PeopleFinder.class);
                startActivity(intentLoadPeopleFinder);

            }
        });
    }
}
