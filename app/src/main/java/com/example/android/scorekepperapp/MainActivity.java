package com.example.android.scorekepperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static final String STATE_SCOREGOALSTEAMA = "scoreGoalsTeamA";
    static final String STATE_SCOREGOALSTEAMB = "scoreGoalsTeamB";
    static final String STATE_SCOREFOULSTEAMA = "scoreFoulsTeamA";
    static final String STATE_SCOREFOULSTEAMB = "scoreFoulsTeamB";
    static final String STATE_SCORESHOTSTEAMA = "scoreShotsTeamA";
    static final String STATE_SCORESHOTSSTEAMB = "scoreShotsTeamB";
    int scoreGoalsTeamA = 0;
    int scoreShotsTeamA = 0;
    int scoreFoulsTeamA = 0;
    int scoreGoalsTeamB = 0;
    int scoreShotsTeamB = 0;
    int scoreFoulsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current  state
        savedInstanceState.putInt(STATE_SCOREGOALSTEAMA, scoreGoalsTeamA);
        savedInstanceState.putInt(STATE_SCOREGOALSTEAMB, scoreGoalsTeamB);

        savedInstanceState.putInt(STATE_SCORESHOTSTEAMA, scoreShotsTeamA);
        savedInstanceState.putInt(STATE_SCORESHOTSSTEAMB, scoreShotsTeamB);

        savedInstanceState.putInt(STATE_SCOREFOULSTEAMA, scoreFoulsTeamA);
        savedInstanceState.putInt(STATE_SCOREFOULSTEAMB, scoreFoulsTeamB);


        //  calling the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        // calling the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);

        // Restore state members from saved instance

        scoreGoalsTeamA = savedInstanceState.getInt(STATE_SCOREGOALSTEAMA);
        scoreGoalsTeamB = savedInstanceState.getInt(STATE_SCOREGOALSTEAMB);

        scoreShotsTeamA = savedInstanceState.getInt(STATE_SCORESHOTSTEAMA);
        scoreShotsTeamB = savedInstanceState.getInt(STATE_SCORESHOTSSTEAMB);

        scoreFoulsTeamA = savedInstanceState.getInt(STATE_SCOREFOULSTEAMA);
        scoreFoulsTeamB = savedInstanceState.getInt(STATE_SCOREFOULSTEAMB);


        //    display saved data

        displayGoalsTeamA(scoreGoalsTeamA);
        displayGoalsTeamB(scoreGoalsTeamB);
        displayFoulsTeamA(scoreFoulsTeamA);
        displayFoulsTeamB(scoreFoulsTeamB);
        displayShotsTeamA(scoreShotsTeamA);
        displayShotsTeamB(scoreShotsTeamB);


    }


    // method to update goals  to score view

    public void viewGoalsA(View v) {

        scoreGoalsTeamA = scoreGoalsTeamA + 1;
        displayGoalsTeamA(scoreGoalsTeamA);
    }

    // method to update shots on the score view
    public void viewShotsA(View v) {

        scoreShotsTeamA = scoreShotsTeamA + 1;
        displayShotsTeamA(scoreShotsTeamA);
    }

    //method to update fouls on the score view
    public void viewFoulsA(View v) {

        scoreFoulsTeamA = scoreFoulsTeamA + 1;
        displayFoulsTeamA(scoreFoulsTeamA);

    }

    // function that display goals that scored for team a
    public void displayGoalsTeamA(int goalScore) {

        TextView scoreGoalsTeamA = (TextView) findViewById(R.id.ScoreViewA);

        scoreGoalsTeamA.setText(String.valueOf(goalScore));

    }

    // function that display shots that scored for team a
    public void displayShotsTeamA(int shotsScoreA) {

        TextView scoreGoalsTeamA = (TextView) findViewById(R.id.ShotsViewA);

        scoreGoalsTeamA.setText(String.valueOf(shotsScoreA));

    }

    // function that display fouls that scored for team a
    public void displayFoulsTeamA(int foulsScoreA) {

        TextView scoreGoalsTeamA = (TextView) findViewById(R.id.FoulsViewA);

        scoreGoalsTeamA.setText(String.valueOf(foulsScoreA));


    }


    // method to update goals  to score view

    public void viewGoalsB(View v) {

        scoreGoalsTeamB = scoreGoalsTeamB + 1;
        displayGoalsTeamB(scoreGoalsTeamB);
    }

    // method to update shots on the score view
    public void viewShotsB(View v) {

        scoreShotsTeamB = scoreShotsTeamB + 1;
        displayShotsTeamB(scoreShotsTeamB);
    }

    //method to update fouls on the score view
    public void viewFoulsB(View v) {

        scoreFoulsTeamB = scoreFoulsTeamB + 1;
        displayFoulsTeamB(scoreFoulsTeamB);

    }


    // function that display goals that scored for team b
    public void displayGoalsTeamB(int goalScoreB) {

        TextView scoreGoalsTeamB = (TextView) findViewById(R.id.ScoreViewB);

        scoreGoalsTeamB.setText(String.valueOf(goalScoreB));

    }

    // function that display shots that scored for team b
    public void displayShotsTeamB(int shotsScoreB) {

        TextView scoreGoalsTeamB = (TextView) findViewById(R.id.ShotsViewB);

        scoreGoalsTeamB.setText(String.valueOf(shotsScoreB));

    }

    // function that display fouls that scored for team b
    public void displayFoulsTeamB(int foulsScoreB) {

        TextView scoreGoalsTeamB = (TextView) findViewById(R.id.FoulsViewB);

        scoreGoalsTeamB.setText(String.valueOf(foulsScoreB));


    }


    public void resetButton(View v) {
        scoreGoalsTeamA = 0;
        scoreShotsTeamA = 0;
        scoreFoulsTeamA = 0;

        scoreGoalsTeamB = 0;
        scoreShotsTeamB = 0;
        scoreFoulsTeamB = 0;

        displayFoulsTeamA(scoreGoalsTeamA);
        displayShotsTeamA(scoreShotsTeamA);
        displayGoalsTeamA(scoreGoalsTeamA);

        displayFoulsTeamB(scoreGoalsTeamB);
        displayShotsTeamB(scoreShotsTeamB);
        displayGoalsTeamB(scoreGoalsTeamB);

    }


}
