package com.appyware.projectzero_uand;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button1:
                Snackbar.make(v, "" + getResources().getString(R.string.launch) + " " + getResources().getString(R.string.spotify), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                break;
            case R.id.button2:
                Snackbar.make(v, "" + getResources().getString(R.string.launch) + " " + getResources().getString(R.string.scores), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                break;
            case R.id.button3:
                Snackbar.make(v, "" + getResources().getString(R.string.launch) + " " + getResources().getString(R.string.library), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                break;
            case R.id.button4:
                Snackbar.make(v, "" + getResources().getString(R.string.launch) + " " + getResources().getString(R.string.big), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                break;
            case R.id.button5:
                Snackbar.make(v, "" + getResources().getString(R.string.launch) + " " + getResources().getString(R.string.xyz), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                break;
            case R.id.button6:
                Snackbar.make(v, "" + getResources().getString(R.string.launch) + " " + getResources().getString(R.string.myap), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                break;
        }
    }
}
