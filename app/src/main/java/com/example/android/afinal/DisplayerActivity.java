package com.example.android.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class DisplayerActivity extends YouTubeBaseActivity{

        String displayTutorial="";
        String tutorial ="";
        String intro ="";

        YouTubePlayerView mYouTubePlayerView;
        Button btnPlay;
        YouTubePlayer.OnInitializedListener mOnInitializedListener;
        TextView introduction;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displayer);

        setTitle("Tutorial Player");

        btnPlay = (Button)findViewById(R.id.button);
        mYouTubePlayerView = (YouTubePlayerView) findViewById(R.id.view);
        introduction = (TextView) findViewById(R.id.video_info);

        Intent receiveIntent = getIntent();
        displayTutorial = receiveIntent.getStringExtra("LINK");
        int length = displayTutorial.length();
        for(int i = 0; i < length;i++){
            String str = displayTutorial.charAt(i)+"";
            if(str.equals("!")){
               tutorial = displayTutorial.substring(0,i);
               intro = displayTutorial.substring(i+1,length);
               break;
            }
            }

        introduction.setText(intro);


        mOnInitializedListener = new YouTubePlayer.OnInitializedListener(){
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo(tutorial);
                mYouTubePlayerView.initialize(YouTubeConfig.getApiKey(),mOnInitializedListener);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

       btnPlay.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mYouTubePlayerView.initialize(YouTubeConfig.getApiKey(),mOnInitializedListener);
            }
        });

    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
    }

    public void startActivity1(View view){
        Intent intent = new Intent(this,TutorialActivity.class);
        startActivity(intent);
    }

    }

