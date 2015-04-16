package com.davezor.android.activity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import com.davezor.android.R;
import com.davezor.android.model.Player;

public class AddActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        Object name = findViewById(R.id.enter_player_name);
        Object position = findViewById(R.id.enter_player_position);
        Object number = findViewById(R.id.enter_player_number);
        int number1 = (Integer) number;
        Object age = findViewById(R.id.enter_player_age);
        int age1 = (Integer) age;
        Object tds = findViewById(R.id.enter_player_tds);
        int tds1 = (Integer) tds;
        Object yards = findViewById(R.id.enter_player_yards);
        int yards1 = (Integer) yards;
        Object seasons = findViewById(R.id.enter_player_seasons);
        int seasons1 = (Integer) seasons;


        Player newPlayer = new Player(name.toString(), number1, position.toString(), age1, tds1, yards1, seasons1, R.drawable.default_player);
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
