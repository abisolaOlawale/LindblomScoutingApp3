package com.electriceagles.team1781.scoutingapp30;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//importing library for intent, which allows for something ot happen when button is pressed
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.database.sqlite.SQLiteDatabase;
import android.database.Cursor;


public class MainActivity extends AppCompatActivity {
    SQLiteDatabase myDB = null;

    Intent addTeamIntent;
    Intent autonomousIntent;
    Intent defenseIntent;
    Intent driveSystemIntent;
    Intent problemIntent;
    Intent scoringIntent;
    Intent teleOpIntent;


    Button addTeamButton;
    Button autonomousButton;
    Button defenseButton;
    Button driveSystemButton;
    Button problemButton;
    Button scoringButton;
    Button teleOpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{
            myDB = this.openOrCreateDatabase("ScoutingDatabase", MODE_PRIVATE, null);

            myDB.execSQL("CREATE TABLE IF NOT EXISTS TEAM(TEAM_ID INTEGER PRIMARY KEY ASC, TEAM_NAME TEXT)");
        }
        catch(Exception e){

        }


        //ADD TEAM
        addTeamIntent = new Intent(this,AddTeamActivity.class);
        //finding the button by its id, which is addTeamButton
        addTeamButton = (Button)findViewById(R.id.addTeamButton);
        //saying when button is clicked start the activity addTeamIntent, which is code for addTeamButton
        addTeamButton.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v) {
                startActivity(addTeamIntent);
            }
        });

        //AUTONOMOUS
        autonomousIntent = new Intent(this, AutonomousActivity.class);
        autonomousButton = (Button)findViewById(R.id.autonomousButton);
        autonomousButton.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v) {
                startActivity(autonomousIntent);
            }
        });

        //DEFENSE
        defenseIntent = new Intent(this,DefenseActivity.class);
        defenseButton = (Button)findViewById(R.id.defenseButton);
        defenseButton.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v) {
                startActivity(defenseIntent);
                }
            });

        //DRIVE SYSTEM
        driveSystemIntent = new Intent(this,DriveSystemActivity.class);
        driveSystemButton = (Button)findViewById(R.id.driveSystemButton);
        driveSystemButton.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v) {
                startActivity(driveSystemIntent);
            }
        });

        //PROBLEMS
        problemIntent = new Intent(this,ProblemActivity.class);
        problemButton = (Button)findViewById(R.id.problemButton);
        problemButton.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v) {
                startActivity(problemIntent);
            }
        });

        //SCORING
        scoringIntent = new Intent(this,ScoringActivity.class);
        scoringButton = (Button)findViewById(R.id.scoringButton);
        scoringButton.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v) {
                startActivity(scoringIntent);
            }
        });

        //TELEOP
        teleOpIntent = new Intent(this,TeleOpActivity.class);
        teleOpButton = (Button)findViewById(R.id.teleOpButton);
        teleOpButton.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                startActivity(teleOpIntent);
            }
        });

    }
}
