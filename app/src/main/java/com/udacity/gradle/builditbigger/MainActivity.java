package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.efhemo.jokesandroidlibrary.JokesActivity;
import com.efhemo.jokeslibrary.MyJokes;


public class MainActivity extends AppCompatActivity {


    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().
                add(R.id.fragment,new MainActivityFragment()).commit();
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

    public void tellJoke(View view) {
        progressBar = (ProgressBar) findViewById(R.id.progressbar);
        //Toast.makeText(this, myJokes.getMyJoke(), Toast.LENGTH_SHORT).show();

        new EndpointsAsyncTask(new InterfEndpointsAsyncTask() {
            @Override
            public void onRetrieveJokeStart() {
                // Show loading while operation runs
                progressBar.setVisibility(View.VISIBLE);
            }

            @Override
            public void onRetrieveJokeFinish(@Nullable String result) {
                // Remove progress bar when navigating to new activity
                progressBar.setVisibility(View.GONE);
                // If there's no result, show toast with error message
                if (TextUtils.isEmpty(result)) {
                    Toast.makeText(MainActivity.this, "error", Toast.LENGTH_LONG).show();
                return;
                }
                startJokeDisplayActivity(result);
            }
        }).execute();

    }

    private void startJokeDisplayActivity(String mResult) {
        Intent intent = new Intent(this, JokesActivity.class);
        intent.putExtra(JokesActivity.INTENT_JOKE, mResult);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }


}
