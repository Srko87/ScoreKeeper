package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int fighterAScore = 0;
    int fighterBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Fighter A.
     */
    public void displayForFighterA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.fighter_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score with punch for Fighter A by 1 point.
     */
    public void addPunchFighterA(View v) {
        fighterAScore = fighterAScore + 1;
        displayForFighterA(fighterAScore);
    }

    /**
     * Increase the score with kick for Fighter A by 1 point.
     */
    public void addKickFighterA(View v) {
        fighterAScore = fighterAScore + 1;
        displayForFighterA(fighterAScore);
    }

    /**
     * Increase the score with takedown for Fighter A by 1 point.
     */
    public void addTakedownFighterA(View v) {
        fighterAScore = fighterAScore + 1;
        displayForFighterA(fighterAScore);
    }

    /**
     * Displays the given score for Fighter B.
     */
    public void displayForFighterB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.fighter_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score with punch for Fighter B by 1 point.
     */
    public void addPunchFighterB(View v) {
        fighterBScore = fighterBScore + 1;
        displayForFighterB(fighterBScore);
    }

    /**
     * Increase the score with kick for Fighter B by 1 point.
     */
    public void addKickFighterB(View v) {
        fighterBScore = fighterBScore + 1;
        displayForFighterB(fighterBScore);
    }

    /**
     * Increase the score with takedown for Fighter B by 1 point.
     */
    public void addTakedownFighterB(View v) {
        fighterBScore = fighterBScore + 1;
        displayForFighterB(fighterBScore);
    }

    /**
     * Reset score for both fighters
     */
    public void reset(View v) {
        fighterAScore = 0;
        fighterBScore = 0;
        displayForFighterA(fighterAScore);
        displayForFighterB(fighterBScore);

    }
}