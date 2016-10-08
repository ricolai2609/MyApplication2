package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int TeamScoreA = 0;
    int TeamScoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreeToTeamA(View view) {
        TeamScoreA = TeamScoreA+3;
       displayForTeamA(TeamScoreA);
    }
    public void addTwoToTeamA(View view) {
        TeamScoreA = TeamScoreA+2;
        displayForTeamA(TeamScoreA);
    }
    public void addOneToTeamA(View view) {
        TeamScoreA = TeamScoreA+1;
        displayForTeamA(TeamScoreA);
    }
    public void addThreeToTeamB(View view) {
        TeamScoreB = TeamScoreB+3;
        displayForTeamB(TeamScoreB);
    }
    public void addTwoToTeamB(View view) {
        TeamScoreB = TeamScoreB+2;
        displayForTeamB(TeamScoreB);
    }
    public void addOneToTeamB(View view) {
        TeamScoreB = TeamScoreB+1;
        displayForTeamB(TeamScoreB);
    }
        /**
         * Displays the given score for Team A.
         */
        public void displayForTeamA(int score) {
            TextView scoreView = (TextView) findViewById(R.id.team_a_score);
            scoreView.setText(String.valueOf(score));


    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));


    }
}
