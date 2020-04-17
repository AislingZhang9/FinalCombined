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
    private List<String> link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tournament);
        setTitle("Tournament");

        initialData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        tournamentAdapter = new TournamentAdapter(tournament,this,link);
        recyclerView.setAdapter(tournamentAdapter);

    }

    private void initialData() {
        tournament = new ArrayList<>();
        tournament.add(new Tournament(R.drawable.vietnam, getString(R.string.tour1), getString(R.string.date1), getString(R.string.location1)));
        tournament.add(new Tournament(R.drawable.spain, getString(R.string.tour2), getString(R.string.date2), getString(R.string.location2)));
        tournament.add(new Tournament(R.drawable.german, getString(R.string.tour3), getString(R.string.date3), getString(R.string.location3)));
        tournament.add(new Tournament(R.drawable.malaysia, getString(R.string.tour4), getString(R.string.date4), getString(R.string.location4)));
        tournament.add(new Tournament(R.drawable.austra, getString(R.string.tour5), getString(R.string.date5), getString(R.string.location5)));
        tournament.add(new Tournament(R.drawable.usa, getString(R.string.tour6), getString(R.string.date6), getString(R.string.location6)));
        link = new ArrayList<>();
        link.add("https://bwfbadminton.com/results/3644/ciputra-hanoi-yonex-sunrise-vietnam-international-challenge-2020-postponed/2020-03-24");
        link.add("https://bwfbadminton.com/results/3826/iberdrola-spanish-international-2020/draw/");
        link.add("https://bwfbadminton.com/results/3851/b-a-b-b-german-international-2020/draw/");
        link.add("https://bwfbadminton.com/results/3852/victor-malaysia-international-series-2020/2020-06-16");
        link.add("https://bwfbadminton.com/results/3853/styrian-international-2020/draw/");
        link.add("https://bwfworldtour.bwfbadminton.com/tournament/3735/yonex-us-open-2020/results/draw/");
    }
}
