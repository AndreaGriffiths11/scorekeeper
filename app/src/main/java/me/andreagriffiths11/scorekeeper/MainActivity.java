package me.andreagriffiths11.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * tracks the score for Wales
     */
    int scoreWales = 0;
    /**
     * tracks the score for England
     */
    int scoreEngland = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main)
        ;
    }

    /**
     * adds 5 points for Wales when a try is completed
     */
    public void addFiveForWales(View v) {
        scoreWales = scoreWales + 5;
        displayForWales(scoreWales);
    }

    /**
     * adds 2 points for Wales when a Goal is completed
     */
    public void addTwoForWales(View v) {
        scoreWales = scoreWales + 2;
        displayForWales(scoreWales);
    }

    /**
     * adds 3 points for Wales when a Penalty is completed
     */
    public void addThreeForWales(View v) {
        scoreWales = scoreWales + 3;
        displayForWales(scoreWales);
    }

    /**
     * adds 1 points for Wales when a Drop Goal is completed
     */
    public void addOneForWales(View v) {
        scoreWales = scoreWales + 1;
        displayForWales(scoreWales);
    }

    /**
     * adds 5 points for England when a Try is completed
     */
    public void addFiveForEngland(View v) {
        scoreEngland = scoreEngland + 5;
        displayForEngland(scoreEngland);
    }

    /**
     * adds 2 points for England when a Goal is completed
     */
    public void addTwoForEngland(View v) {
        scoreEngland = scoreEngland + 2;
        displayForEngland(scoreEngland);
    }

    /**
     * adds 3 points for England when a Penalty is completed
     */
    public void addThreeForEngland(View v) {
        scoreEngland = scoreEngland + 3;
        displayForEngland(scoreEngland);
    }

    /**
     * adds 1 point for England when a Drop Goal is completed
     */
    public void addOneForEngland(View v) {
        scoreEngland = scoreEngland + 1;
        displayForEngland(scoreEngland);
    }

    /**
     * Resets the scores for both teams to 0.
     */
    public void resetScore(View V) {
        scoreWales = 0;
        scoreEngland = 0;
        displayForWales(scoreWales);
        displayForEngland(scoreEngland);
    }

    /**
     * Displays the given score for Wales.
     */
    public void displayForWales(int score) {
        TextView scoreView = (TextView) findViewById(R.id.wales_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team England.
     */
    public void displayForEngland(int score) {
        TextView scoreView = (TextView) findViewById(R.id.england_score);
        scoreView.setText(String.valueOf(score));
    }

}
