package com.example.hp.wehack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
<<<<<<< HEAD
import android.view.View;
import android.widget.TextView;
=======
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
>>>>>>> 8968e99804be78c49491b14d6b4b52f2319a13fb

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class YouTubeActivity extends YouTubeBaseActivity {

    private YouTubePlayerView youTubePlayer;
    private YouTubePlayer.OnInitializedListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_you_tube);
        CardView cdTakeTest = findViewById(R.id.cardView2);

        cdTakeTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(YouTubeActivity.this,QuizActivity.class);
                startActivity(i);
            }
        });

        TextView mentor = findViewById(R.id.mentor);
        mentor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(YouTubeActivity.this,ChatActivity.class);
                startActivity(i);
            }
        });

        final String id = getIntent().getStringExtra("id");
        youTubePlayer = (YouTubePlayerView)findViewById(R.id.youtubeplayer);

        listener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

                youTubePlayer.loadVideo(id);
            }
            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        youTubePlayer.initialize("AIzaSyCjcIu3lFJR7_lvdTAB553_ZXFcLg3NmcY",listener);}


    }

