package com.mayank.sportspeakergame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton imgBoxing, imgKickBoxing, imgJudo, imgKarate,
            imgAikido, imgTaekwondo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgBoxing = findViewById(R.id.imgBoxing);
        imgKickBoxing = findViewById(R.id.imgKickBoxing);
        imgJudo = findViewById(R.id.imgJudo);
        imgKarate = findViewById(R.id.imgKarate);
        imgAikido = findViewById(R.id.imgAikido);
        imgTaekwondo = findViewById(R.id.imgTaekwondo);

        imgBoxing.setOnClickListener(MainActivity.this);
        imgKickBoxing.setOnClickListener(this);
        imgJudo.setOnClickListener(this);
        imgKarate.setOnClickListener(this);
        imgAikido.setOnClickListener(this);
        imgTaekwondo.setOnClickListener(this);

    }

    @Override
    public void onClick(View imageButtonVIew) {

        switch (imageButtonVIew.getId()) {

            case R.id.imgBoxing:
                playSportName(imgBoxing.getTag().toString());
                break;

            case R.id.imgKickBoxing:
                playSportName(imgKickBoxing.getTag().toString());
                break;
            case R.id.imgJudo:
                playSportName(imgJudo.getTag().toString());
                break;
            case R.id.imgKarate:
                playSportName(imgKarate.getTag().toString());
                break;
            case R.id.imgAikido:
                playSportName(imgAikido.getTag().toString());
                break;
            case R.id.imgTaekwondo:
                playSportName(imgTaekwondo.getTag().toString());
                break;
        }

    }

    private void playSportName(String sportName){

        Context context;
        MediaPlayer sportPlayer = MediaPlayer.create(this,
                getResources().getIdentifier(sportName,
                        "raw",getPackageName()));

        sportPlayer.start();

    }
}
