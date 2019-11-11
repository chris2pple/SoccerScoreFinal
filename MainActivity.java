package com.soccerscore.chris2pple.soccerscorefinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int scoreTeamUTA = 0;
    int scoreTeamPOLITM = 0;
    int foulTeamUTA = 0;
    int foulTeamPOLITM = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Displays the given score for Team UTA.
     */
    public void displayForTeamUTA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_uta_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team POLI TM.
     */
    public void displayForTeamPOLITM(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_politm_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the foulScores for Team UTA.
     */
    public void foulForTeamUTA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_uta_foul);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the foulScores for Team POLI TM.
     */
    public void foulForTeamPOLITM(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_politm_foul);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets the scores
     */
    public void resetScore(View v) {
        scoreTeamUTA = 0;
        scoreTeamPOLITM = 0;
        foulTeamUTA = 0;
        foulTeamPOLITM = 0;
        displayForTeamUTA(scoreTeamUTA);
        displayForTeamPOLITM(scoreTeamPOLITM);
        foulForTeamUTA(foulTeamUTA);
        foulForTeamPOLITM(foulTeamPOLITM);

    }

    /**
     * Displays the WinUTA +3Points.
     */
    public void displayWinUTA(View v) {
        scoreTeamUTA = scoreTeamUTA + 3;
        displayForTeamUTA(scoreTeamUTA);
    }

    /**
     * Displays the Draw UTA +1Point.
     */
    public void displayDrawUTA(View v) {
        scoreTeamUTA = scoreTeamUTA + 1;
        displayForTeamUTA(scoreTeamUTA);
    }

    /**
     * Displays the Foul_Points for Team UTA.
     */
    public void foulteamUTA(View v) {
        foulTeamUTA = foulTeamUTA + 1;
        foulForTeamUTA(foulTeamUTA);
    }

    /**
     * Displays the Win POLI TM +3Points.
     */
    public void displayWinPoliTM(View v) {
        scoreTeamPOLITM = scoreTeamPOLITM + 3;
        displayForTeamPOLITM(scoreTeamPOLITM);
    }

    /**
     * Displays the Draw POLI TM +1Point.
     */
    public void displayDrawPoliTM(View v) {
        scoreTeamPOLITM = scoreTeamPOLITM + 1;
        displayForTeamPOLITM(scoreTeamPOLITM);
    }

    /**
     * Displays the Foul_points for team POLI_TM.
     */
    public void foulteamPOLITM(View v) {
        foulTeamPOLITM = foulTeamPOLITM + 1;
        foulForTeamPOLITM(foulTeamPOLITM);
    }
}
