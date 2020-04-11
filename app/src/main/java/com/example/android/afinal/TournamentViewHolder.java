package com.example.android.afinal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class TournamentViewHolder extends RecyclerView.ViewHolder {
    public CardView cardView;
    public ImageView country;
    public TextView tournament;
    public TextView date;
    public TextView location;
    public Button buyTicket;
    public Toast toast;


    public TournamentViewHolder(View itemView, final Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view_tournament);
        country = (ImageView) itemView.findViewById(R.id.country);
        tournament = (TextView) itemView.findViewById(R.id.tournament);
        date = (TextView) itemView.findViewById(R.id.date);
        location = (TextView) itemView.findViewById(R.id.location);
        buyTicket = (Button) itemView.findViewById(R.id.button);
    }



}