package com.example.dennis.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }


    public void addThreePointsA(View view) {
        teamAScore += 3;
        displayForTeamA(teamAScore);
    }

    public void addTwoPointsA(View view) {
        teamAScore += 2;
        displayForTeamA(teamAScore);
    }

    public void addOnePointA(View view) {
        teamAScore += 1;
        displayForTeamA(teamAScore);
    }

    public void addThreePointsB(View view) {
        teamBScore += 3;
        displayForTeamB(teamBScore);
    }

    public void addTwoPointsB(View view) {
        teamBScore += 2;
        displayForTeamB(teamBScore);
    }

    public void addOnePointB(View view) {
        teamBScore += 1;
        displayForTeamB(teamBScore);
    }

    public void resetScores(View view) {
        teamAScore *= 0;
        teamBScore *= 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamAScore);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamBScore);
        scoreView.setText(String.valueOf(score));
    }
}
