package com.example.counter.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA();
    }
    public void displayForTeamA(){
        TextView Score = (TextView) findViewById(R.id.scoreA);
        Score.setText(String.valueOf(scoreA));



    }
    public void increment3PointsA(View view){
        scoreA +=3;
        displayA(scoreA);
    }

    public void increment2PointsA(View view){
        scoreA +=2;
        displayA(scoreA);
    }

    public void freeThrowA(View view){
        scoreA +=1;
        displayA(scoreA);
    }

    public void displayA(int score){
        TextView newScore = (TextView) findViewById(R.id.scoreA);
        newScore.setText(String.valueOf(score));
    }

    public void increment3PointsB(View view){
        scoreB +=3;
        displayB(scoreB);
    }

    public void increment2PointsB(View view){
        scoreB +=2;
        displayB(scoreB);
    }

    public void freeThrowB(View view){
        scoreB +=1;
       displayB(scoreB);
    }

    public void displayB(int score){
        TextView newScore = (TextView) findViewById(R.id.scoreB);
        newScore.setText(String.valueOf(score));
    }
    public void reset(View view){
        scoreA = 0;
        scoreB = 0;
        displayA(scoreA);
        displayB(scoreB);

    }

}
