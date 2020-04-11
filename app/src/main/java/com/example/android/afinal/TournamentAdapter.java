package com.example.android.afinal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TournamentAdapter extends RecyclerView.Adapter<TournamentViewHolder> {
    private List<Tournament> tournaments;
    private Context context;

    public TournamentAdapter(List<Tournament> tournaments, Context context){
        this.tournaments = tournaments;
        this.context = context;
    }

    @Override
    public TournamentViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_tournament,parent,false);
        return new TournamentViewHolder(view,context);
    }

    @Override
    public void onBindViewHolder(TournamentViewHolder holder,int position){
        Tournament tournament = tournaments.get(position);
        holder.country.setImageResource(tournament.country);
        holder.tournament.setText(tournament.tournament);
        holder.date.setText(tournament.date);
        holder.location.setText(tournament.location);
    }

    @Override
    public int getItemCount(){
        return tournaments.size();
    }
}

