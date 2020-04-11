package com.example.android.afinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class TutorialActivity extends AppCompatActivity {
    private List<Tutorial> tutorials;
    private TutorialAdapter tutorialsAdapter;
    private RecyclerView recyclerView;
    private List<String> link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        setTitle("Tutorials List");

        initialData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        tutorialsAdapter = new TutorialAdapter(tutorials,this,link);
        recyclerView.setAdapter(tutorialsAdapter);

    }

    private void initialData(){
        tutorials = new ArrayList<>();
        tutorials.add(new Tutorial(R.drawable.e1,getString(R.string.ep1),getString(R.string.dur1)));
        tutorials.add(new Tutorial(R.drawable.e2,getString(R.string.ep2),getString(R.string.dur2)));
        tutorials.add(new Tutorial(R.drawable.e3,getString(R.string.ep3),getString(R.string.dur3)));

        link = new ArrayList<>();
        link.add("");
        link.add("https://bwfworldtour.bwfbadminton.com/tournament/3730/yonex-sunrise-india-open-2020-suspended/overview/");
        link.add("https://bwfbadminton.com/results/3888/2nd-brazil-international-junior-2020-suspended/2020-03-25");
    }

}
