package com.example.android.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class DisplayerActivity extends YouTubeBaseActivity{

        String displayTutorial="";
        YouTubePlayerView mYouTubePlayerView;
        Button btnPlay;
        YouTubePlayer.OnInitializedListener mOnInitializedListener;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displayer);

        Intent receiveIntent = getIntent();
        displayTutorial = receiveIntent.getStringExtra("LINK");
        setTitle("Tutorial Player");
        btnPlay = (Button)findViewById(R.id.button);
        mYouTubePlayerView = (YouTubePlayerView) findViewById(R.id.view);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener(){
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo(displayTutorial);
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


    }

