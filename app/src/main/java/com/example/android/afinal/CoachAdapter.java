package com.example.android.afinal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import static androidx.core.content.ContextCompat.startActivity;

public class CoachAdapter extends RecyclerView.Adapter<CoachAdapter.CoachViewHolder>{

    private List<Coach> coaches;
    private Context context;

    public CoachAdapter(List<Coach> coaches, Context context){
        this.coaches = coaches;
        this.context = context;
    }

    @Override
    public CoachViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_coach,parent,false);
        CoachViewHolder holder = new CoachViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(CoachViewHolder holder, final int position) {

        final Coach coach = coaches.get(position);
        holder.name.setText(coach.coachName);
        holder.email.setText(coach.email);
        holder.info.setText(coach.info);
        holder.photoId.setImageResource(coach.photoId);

       holder.coachLayout.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view){
               Toast.makeText(context,coaches.get(position).coachName,Toast.LENGTH_SHORT).show();
               Intent intent = new Intent(Intent.ACTION_SENDTO);
               intent.setData(Uri.parse("mailto: "+ coaches.get(position).email));
               context.startActivity(intent);
           }

       });

    }

    @Override
    public int getItemCount() {
        return coaches.size();
    }


    public class CoachViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView email;
        TextView info;
        ImageView photoId;
        RelativeLayout coachLayout;

        public CoachViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.coach_name);
            email = (TextView) itemView.findViewById(R.id.email);
            info = (TextView) itemView.findViewById(R.id.info);
            photoId = (ImageView) itemView.findViewById(R.id.coach_photo);
            coachLayout = itemView.findViewById(R.id.coach_layout);

        }


    }

}




