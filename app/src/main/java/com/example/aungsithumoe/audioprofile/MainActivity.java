package com.example.aungsithumoe.audioprofile;

import android.content.Context;
import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button Vibrate, Ring, Silent, Mode;
    private TextView Status;
    private AudioManager myAudioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    Vibrate =(Button)

    findViewById(R.id.button2);

    Ring =(Button)findViewById(R.id.button4);

    Silent =(Button)findViewById(R.id.button3);

    Mode =(Button)findViewById(R.id.button1);

    Status =(TextView)findViewById(R.id.textView2);

    myAudioManager =(AudioManager)getSystemService(Context.AUDIO_SERVICE);
}

    public void vibrate(View view) {
        myAudioManager.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
    }

    public void ring(View view) {
        myAudioManager.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
    }

    public void silent(View view) {
        myAudioManager.setRingerMode(AudioManager.RINGER_MODE_SILENT);
    }

    public void mode(View view) {
        int mod = myAudioManager.getRingerMode();
        if (mod == AudioManager.RINGER_MODE_NORMAL) {
            Status.setText("Current Status: Ring");
        } else if (mod == AudioManager.RINGER_MODE_SILENT) {
            Status.setText("Current Status: Silent");
        } else if (mod == AudioManager.RINGER_MODE_VIBRATE) {
            Status.setText("Current Status: Vibrate");
        } else {
        }
    }
}