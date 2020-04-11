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

public class TutorialAdapter extends RecyclerView.Adapter<TutorialViewHolder> {
    private List<Tutorial> tutorials;
    private Context context;

    public TutorialAdapter(List<Tutorial> tutorials, Context context){
        this.tutorials = tutorials;
        this.context = context;
    }

    @Override
    public TutorialViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card_view_video,parent,false);
        return new TutorialViewHolder(view,context);
    }

    @Override
    public void onBindViewHolder(TutorialViewHolder holder, final int position){
        final Tutorial tutorial = tutorials.get(position);
        holder.tutorialTitle.setText(tutorial.title);
        holder.tutorialDuration.setText(tutorial.duration);
        holder.tutorialPhoto.setImageResource(tutorial.videoId);

        holder.cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"+tutorials.get(position).duration));
                context.startActivity(intent);
            }

        });
    }

    @Override
    public int getItemCount(){
        return tutorials.size();
    }
}



