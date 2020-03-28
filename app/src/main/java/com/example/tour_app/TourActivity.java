package com.example.tour_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class TourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour);

        TextView residentHalls = (TextView) findViewById(R.id.resident_halls);
        residentHalls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ResidentHallsIntent = new Intent(TourActivity.this, ResidentHallsActivity.class);
                startActivity(ResidentHallsIntent);
            }
        });

        TextView lectureHalls = (TextView) findViewById(R.id.lecture_halls);
        lectureHalls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LectureHallsIntent = new Intent(TourActivity.this, LectureHallsActivity.class);
                startActivity(LectureHallsIntent);
            }
        });

        TextView eatries = (TextView) findViewById(R.id.eatries);
        eatries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eatriesIntent = new Intent(TourActivity.this, Eatries.class);
                startActivity(eatriesIntent);
            }
        });

        TextView others = (TextView) findViewById(R.id.others);
        others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent OthersIntent = new Intent(TourActivity.this, Others.class);
                startActivity(OthersIntent);
            }
        });

    }
}
