package com.example.music;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mySong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySong = MediaPlayer.create(MainActivity.this, R.raw.macho);
    }
    public void playIT(View v){
       mySong.start();
}
    public void pauseIT(View v){
        mySong.pause();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mySong.release();
    }
}
