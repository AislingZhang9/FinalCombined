package com.example.android.afinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class TournamentActivity extends AppCompatActivity {
    private List<Tournament> tournament;
    private TournamentAdapter tournamentAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tournament);
        setTitle("Tournament");

        initialData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        tournamentAdapter = new TournamentAdapter(tournament,this);
        recyclerView.setAdapter(tournamentAdapter);

    }

    private void initialData(){
        tournament = new ArrayList<>();
        tournament.add(new Tournament(R.drawable.france,getString(R.string.tour1),getString(R.string.date1),getString(R.string.location1)));
        tournament.add(new Tournament(R.drawable.india,getString(R.string.tour2),getString(R.string.date2),getString(R.string.location2)));
        tournament.add(new Tournament(R.drawable.brazil,getString(R.string.tour3),getString(R.string.date3),getString(R.string.location3)));
    }
}
