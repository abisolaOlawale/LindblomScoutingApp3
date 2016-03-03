package com.electriceagles.team1781.scoutingapp30;

import android.app.AlertDialog;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.database.sqlite.SQLiteDatabase;
import android.database.Cursor;

public class AddTeamActivity extends AppCompatActivity {
    SQLiteDatabase myDB = null;
    Button submitButton;
    TextView teamIDEditText;
    TextView teamNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_team);

        try{
            myDB = this.openOrCreateDatabase("ScoutingDatabase", MODE_PRIVATE, null);
        }
        catch(Exception e){

        }

        submitButton = (Button)findViewById(R.id.submitButton);
        teamIDEditText = (TextView)findViewById(R.id.teamIDEditText);
        teamNameEditText = (TextView)findViewById(R.id.teamNameEditText);

        submitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //new AlertDialog.Builder(AddTeamActivity.this).setTitle("Hello").setMessage("INSERT INTO TEAM(TEAM_ID, TEAM_NAME) VALUES ("+teamIDEditText.getText().toString() +","+teamNameEditText.getText().toString()+")").show();
                myDB.execSQL("INSERT INTO TEAM(TEAM_ID, TEAM_NAME) VALUES ("+teamIDEditText.getText().toString() +","+teamNameEditText.getText().toString()+");");
            }
        });

    }
}
