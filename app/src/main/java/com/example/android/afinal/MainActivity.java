package com.example.android.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startActivity1(View view){
        Intent intent = new Intent(this,TutorialActivity.class);
        startActivity(intent);
    }

    public void startActivity2(View view){
        Intent intent = new Intent(this,CoachActivity.class);
        startActivity(intent);
    }

    public void startActivity3(View view){
        Intent intent = new Intent(this,TournamentActivity.class);
        startActivity(intent);
    }
}
