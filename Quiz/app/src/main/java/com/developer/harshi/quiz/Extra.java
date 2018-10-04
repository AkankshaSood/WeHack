package com.developer.harshi.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Extra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra);

        TextView tv = findViewById(R.id.textView);
        String sessionId= getIntent().getStringExtra("score");

        if(Integer.valueOf(sessionId) ==0){
            tv.setText("Not Qualified");
        }
        else
        tv.setText("Score is"+sessionId);
    }
}
