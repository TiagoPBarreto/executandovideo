package com.cursoandroid.execultandovideos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class PlayerActivity extends AppCompatActivity {

    private VideoView videoview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player2);

        videoview = findViewById(R.id.videoView);
        //Esconder a statusBar barra de navegação
        View decorView = getWindow().getDecorView();
        int uiOpcoes = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility( uiOpcoes );




        //Esconde a ActionBar
        getSupportActionBar().hide();


        //Executar o video
        videoview.setMediaController(new MediaController(this));
        videoview.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video);
        videoview.start();

    }
}