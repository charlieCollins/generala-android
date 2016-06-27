package com.totsp.generala_android;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ToggleButton;
import android.widget.Toast;
import android.widget.ToggleButton;
import com.totsp.generala.Die;
import com.totsp.generala.GeneralaEngine;
import com.totsp.generala.IGeneralaEngine;
import generala.totsp.com.generala.R;

public class MainActivity extends AppCompatActivity {

    private ToggleButton dice1Button;
    private ToggleButton dice2Button;
    private ToggleButton dice3Button;
    private ToggleButton dice4Button;
    private ToggleButton dice5Button;

    private Button rollDiceButton;

    // TODO move to right pattern, out of UI?
    private IGeneralaEngine generalaEngine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dice1Button = (ToggleButton) findViewById(R.id.diceButton1);
        dice2Button = (ToggleButton) findViewById(R.id.diceButton2);
        dice3Button = (ToggleButton) findViewById(R.id.diceButton3);
        dice4Button = (ToggleButton) findViewById(R.id.diceButton4);
        dice5Button = (ToggleButton) findViewById(R.id.diceButton5);

        rollDiceButton = (Button) findViewById(R.id.rollDiceButton);

        dice1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "click", Toast.LENGTH_SHORT).show();
                Log.d("GENERALA", "dice1 checked:" + dice1Button.isChecked());
            }
        });
        dice2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "click", Toast.LENGTH_SHORT).show();
                Log.d("GENERALA", "dice2 checked:" + dice2Button.isChecked());
            }
        });
        dice3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "click", Toast.LENGTH_SHORT).show();
                Log.d("GENERALA", "dice3 checked:" + dice3Button.isChecked());
            }
        });
        dice4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "click", Toast.LENGTH_SHORT).show();
                Log.d("GENERALA", "dice4 checked:" + dice4Button.isChecked());
            }
        });
        dice5Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "click", Toast.LENGTH_SHORT).show();
                Log.d("GENERALA", "dice5 checked:" + dice5Button.isChecked());
            }
        });

        // gen
        generalaEngine = new GeneralaEngine();
        rollDiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generalaEngine.rollDice();
                if (!dice1Button.isChecked()) {
                    setDiceBackground(generalaEngine.getData().dieList.get(0).value, dice1Button);
                }
                if (!dice2Button.isChecked()) {
                    setDiceBackground(generalaEngine.getData().dieList.get(1).value, dice2Button);
                }
                if (!dice3Button.isChecked()) {
                    setDiceBackground(generalaEngine.getData().dieList.get(2).value, dice3Button);
                }
                if (!dice4Button.isChecked()) {
                    setDiceBackground(generalaEngine.getData().dieList.get(3).value, dice4Button);
                }
                if (!dice5Button.isChecked()) {
                    setDiceBackground(generalaEngine.getData().dieList.get(4).value, dice5Button);
                }
            }
        });

    }

    private void setDiceBackground(int value, View view) {

        // TODO check range

        Drawable background = null;
        switch(value) {
            case 1:
                view.setBackground(getResources().getDrawable(R.drawable.dice1));
                break;
            case 2:
                view.setBackground(getResources().getDrawable(R.drawable.dice2));
                break;
            case 3:
                view.setBackground(getResources().getDrawable(R.drawable.dice3));
                break;
            case 4:
                view.setBackground(getResources().getDrawable(R.drawable.dice4));
                break;
            case 5:
                view.setBackground(getResources().getDrawable(R.drawable.dice5));
                break;
            case 6:
                view.setBackground(getResources().getDrawable(R.drawable.dice6));
                break;
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
