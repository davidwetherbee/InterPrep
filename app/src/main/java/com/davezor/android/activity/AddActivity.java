package com.davezor.android.activity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.davezor.android.R;
import com.davezor.android.model.Player;

public class AddActivity extends ActionBarActivity {
    private EditText mName;
    private EditText mPosition;
    private EditText mNumber;
    private EditText mAge;
    private EditText mTds;
    private EditText mYards;
    private EditText mSeasons;

    private static final String TAG = "AddActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        mName = (EditText) findViewById(R.id.enter_player_name);
        mPosition = (EditText) findViewById(R.id.enter_player_position);
        mNumber = (EditText) findViewById(R.id.enter_player_number);
        mAge = (EditText) findViewById(R.id.enter_player_age);
        mTds = (EditText) findViewById(R.id.enter_player_tds);
        mYards = (EditText) findViewById(R.id.enter_player_yards);
        mSeasons = (EditText) findViewById(R.id.enter_player_seasons);


        Button addPlayer = (Button) findViewById(R.id.add_player_final);
        addPlayer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addPlayer();

            }
        });



    }

    public void addPlayer(){
        Player newPlayer = new Player(mName.getText().toString(), Integer.parseInt(mNumber.getText().toString()), mPosition.getText().toString(), Integer.parseInt(mAge.getText().toString()), Integer.parseInt(mTds.getText().toString()), Integer.parseInt(mYards.getText().toString()), Integer.parseInt(mSeasons.getText().toString()), R.drawable.default_player);
        MainActivity.newPlayer(newPlayer);
        Log.i(TAG, newPlayer.toString());
        finish();
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
