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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        setTitle("Tutorials");

        initialData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        tutorialsAdapter = new TutorialAdapter(tutorials,this);
        recyclerView.setAdapter(tutorialsAdapter);

    }

    private void initialData(){
        tutorials = new ArrayList<>();
        tutorials.add(new Tutorial(R.drawable.e1,getString(R.string.ep1),getString(R.string.dur1)));
        tutorials.add(new Tutorial(R.drawable.e2,getString(R.string.ep2),getString(R.string.dur2)));
        tutorials.add(new Tutorial(R.drawable.e3,getString(R.string.ep3),getString(R.string.dur3)));
    }

}
