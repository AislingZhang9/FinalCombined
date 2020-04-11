package com.example.android.afinal;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class TutorialViewHolder extends RecyclerView.ViewHolder {
    public CardView cardView;
    public TextView tutorialTitle;
    public TextView tutorialDuration;
    public ImageView tutorialPhoto;

    public TutorialViewHolder(View itemView, final Context context){
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view_video);
        tutorialTitle = (TextView) itemView.findViewById(R.id.tutorial_title);
        tutorialDuration = (TextView) itemView.findViewById(R.id.tutorial_duration);
        tutorialPhoto = (ImageView) itemView.findViewById(R.id.tutorial_photo);

    }
}
