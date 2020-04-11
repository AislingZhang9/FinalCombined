package com.example.android.afinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class CoachActivity extends AppCompatActivity {
    private CoachAdapter coachesAdapter;
    private RecyclerView recyclerView;
    private List<Coach> coaches;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coach);
        setTitle("Coaches");

        initialData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        coachesAdapter = new CoachAdapter(coaches,this);
        recyclerView.setAdapter(coachesAdapter);
    }

    private void initialData(){
        coaches = new ArrayList<>();
        coaches.add(new Coach(R.drawable.coach1,getString(R.string.jie_xiao),getString(R.string.email_xiao),getString(R.string.jieinfo)));
        coaches.add(new Coach(R.drawable.coach2,getString(R.string.chibing),getString(R.string.email_chi),getString(R.string.chiinfo)));
        coaches.add(new Coach(R.drawable.coach3,getString(R.string.singhua),getString(R.string.email_sing),getString(R.string.singinfo)));

    }

}
