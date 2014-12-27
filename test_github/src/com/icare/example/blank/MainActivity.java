package com.icare.example.blank;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        // book is good
        
        // test 1
        AudioManager audioManager = (AudioManager) this.getSystemService(Context.AUDIO_SERVICE);
        audioManager.setMicrophoneMute(false);        
        audioManager.setSpeakerphoneOn(true);//ʹ����������ţ���ʹ�Ѿ��������
        setVolumeControlStream(AudioManager.STREAM_MUSIC);//���������Ĵ�С
        audioManager.setMode(AudioManager.STREAM_MUSIC); 

        //����һ���������鿴Ч��        
        MediaPlayer playerSound = MediaPlayer.create(this, Uri.parse("file:///system/media/audio/ui/camera_click.ogg"));
        playerSound.start();	
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
