package com.example.android.afinal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TournamentAdapter extends RecyclerView.Adapter<TournamentViewHolder> {
    private List<Tournament> tournaments;
    private Context context;
    private List<String> link;

    public TournamentAdapter(List<Tournament> tournaments, Context context,List<String> link){
        this.tournaments = tournaments;
        this.context = context;
        this.link = link;
    }

    @Override
    public TournamentViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_tournament,parent,false);
        return new TournamentViewHolder(view,context);
    }

    @Override
    public void onBindViewHolder(TournamentViewHolder holder, final int position){
        Tournament tournament = tournaments.get(position);
        holder.country.setImageResource(tournament.country);
        holder.tournament.setText(tournament.tournament);
        holder.date.setText(tournament.date);
        holder.location.setText(tournament.location);
        holder.buyTicket.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(context,tournaments.get(position).tournament,Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, WebActivity.class);
                intent.putExtra("LINK",link.get(position));
                context.startActivity(intent);
            }

        });
    }

    @Override
    public int getItemCount(){
        return tournaments.size();
    }
}

