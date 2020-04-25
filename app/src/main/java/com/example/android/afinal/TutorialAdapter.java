package com.example.android.afinal;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TutorialAdapter extends RecyclerView.Adapter<TutorialViewHolder> {
    private List<Tutorial> tutorials;
    private Context context;
    private List<String> link;

    public TutorialAdapter(List<Tutorial> tutorials, Context context,List<String> link){
        this.tutorials = tutorials;
        this.context = context;
        this.link = link;
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
                Toast.makeText(context,tutorials.get(position).title,Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, DisplayerActivity.class);
                intent.putExtra("LINK",link.get(position));
                context.startActivity(intent);
            }

        });
    }

    @Override
    public int getItemCount(){
        return tutorials.size();
    }
}



