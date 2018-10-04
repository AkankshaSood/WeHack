package com.developer.harshi.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Quiz2Activity extends AppCompatActivity {

    private QuestionLibrary2 mQuestionLibrary2 = new QuestionLibrary2();

    private TextView mQuestionView;
    private TextView mScoreView;
    private Button mchoice1;
    private Button mchoice2;
    private Button mchoice3;

    private String mAnswer;
    private int score=0;
    private int mQuestionNumber=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mScoreView = (TextView) findViewById(R.id.score);
        mQuestionView = (TextView) findViewById(R.id.q1);
        mchoice1 = findViewById(R.id.b1q1);
        mchoice2 = findViewById(R.id.b1q2);
        mchoice3 = findViewById(R.id.b1q3);

        if(mQuestionNumber==10){
            Intent i = new Intent (Quiz2Activity.this,Extra.class);
            i.putExtra("score",score);
            startActivity(i);
        }
        else
        updateQuestion();

        mchoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mchoice1.getText()==mAnswer);
                score = score+1;
                updatescore(score);
                updateQuestion();
            }
        });
        mchoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mchoice2.getText()==mAnswer);
                score = score+1;
                updatescore(score);
                updateQuestion();
            }
        });
        mchoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mchoice3.getText()==mAnswer);
                score = score+1;
                updatescore(score);
                updateQuestion();
            }
        });
    }

    private void updateQuestion(){
        mQuestionView.setText(mQuestionLibrary2.getQuestions(mQuestionNumber));
        mchoice1.setText(mQuestionLibrary2.getchoice1(mQuestionNumber));
        mchoice2.setText(mQuestionLibrary2.getchoice2(mQuestionNumber));
        mchoice3.setText(mQuestionLibrary2.getchoice3(mQuestionNumber));

        mAnswer = mQuestionLibrary2.getCorrectAnswers();
        mQuestionNumber++;
    }

    private void updatescore(int score) {
        mScoreView.setText(""+score);
    }
}