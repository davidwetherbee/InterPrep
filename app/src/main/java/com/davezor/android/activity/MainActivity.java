package com.davezor.android.activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.davezor.android.R;
import com.davezor.android.adapter.Adapter;
import com.davezor.android.model.Player;



public class MainActivity extends ActionBarActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView playerList = (ListView) findViewById(R.id.player_list);

        // Creating 5 players for the array
        Player player1 = new Player("John Elway", 7, "Quarterback", 50, 300, 51475, 16, R.drawable.john_el);
        Player player2 = new Player("Peyton Manning", 18, "Quarterback", 39, 530, 69691, 18, R. drawable.pey_man);
        Player player3 = new Player("C.J. Anderson", 22, "Running Back", 24, 8, 887, 3, R.drawable.cj_and);
        Player player4 = new Player("Demaryius Thomas", 88, "Wide Receiver", 27, 41, 5317, 6, R.drawable.dem_thom);
        Player player5 = new Player("Emmanuel Sanders", 10, "Wide Reciever", 28, 20, 3434, 6, R.drawable.emman_sand);

        // Creating array and populating it with created players
        Player[] playerArray =  new Player[] {player1, player2, player3, player4, player5};


        for (int i = 0; i < playerArray.length; i++ ) {
            Log.i(TAG, "Player: " + playerArray[i].getName());
        }

        Adapter list = new Adapter(this);
        list.setData(playerArray);
        playerList.setAdapter(list);

        Button addPlayer = (Button) findViewById(R.id.add_player);
        addPlayer.setOnClickListener(new View.OnClickListener()) {
            public void addPlayers(View view) {

                Intent addActivity = new Intent(this, AddActivity.class);
                Activity.startActivity(addActivity);

            }
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
