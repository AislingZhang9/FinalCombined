package com.example.android.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class CoachActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coach);
        setTitle("Coaches");

    }
    public void startActivity1(View view){
        Intent intent = new Intent(this,JieXiaoActivity.class);
        startActivity(intent);
    }

    public void startActivity2(View view){
        Intent intent = new Intent(this,ChibingActivity.class);
        startActivity(intent);
    }

    public void startActivity3(View view){
        Intent intent = new Intent(this,SonghuaActivity.class);
        startActivity(intent);
    }


}
