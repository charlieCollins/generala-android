package com.totsp.generala_android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.ToggleButton;
import generala.totsp.com.generala.R;

public class MainActivity extends AppCompatActivity {

    private ImageButton dice1Button;
    private ImageButton dice2Button;
    private ImageButton dice3Button;
    private ImageButton dice4Button;
    private ImageButton dice5Button;
    private ToggleButton dice6Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dice1Button = (ImageButton) findViewById(R.id.diceButton1);
        dice2Button = (ImageButton) findViewById(R.id.diceButton2);
        dice3Button = (ImageButton) findViewById(R.id.diceButton3);
        dice4Button = (ImageButton) findViewById(R.id.diceButton4);
        dice5Button = (ImageButton) findViewById(R.id.diceButton5);
        dice6Button = (ToggleButton) findViewById(R.id.diceButton6);

        dice6Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "click", Toast.LENGTH_SHORT).show();
                Log.d("GENERALA", "dice6 selected:" + dice6Button.isSelected());
            }
        });

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
