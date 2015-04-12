package interprep.android.bignerdranch.com.interprep;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import POJOs.Player;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        // Creating 5 players for the array
        Player player1 = new Player("John Elway", 7, "Quarterback", 50, 300, 51475, 16);
        Player player2 = new Player("Peyton Manning", 18, "Quarterback", 39, 530, 69691, 18);
        Player player3 = new Player("C.J. Anderson", 22, "Running Back", 24, 8, 887, 3);
        Player player4 = new Player("Demaryius Thomas", 88, "Wide Receiver", 27, 41, 5317, 6);
        Player player5 = new Player("Emmanuel Sanders", 10, "Wide Reciever", 28, 20, 3434, 6);

        // Creating array and populating it with created players
        Player[] playerArray =  new Player[]{player1,player2,player3, player4, player5};
        for (int i = 0; i < playerArray.length; i++ ){
            Log.i(TAG, "Player: " + playerArray[i].getName());

            //Do you feel lucky, punk?


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
