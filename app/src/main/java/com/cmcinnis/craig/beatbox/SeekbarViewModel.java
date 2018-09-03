package com.cmcinnis.craig.beatbox;

import android.databinding.BaseObservable;
import android.nfc.Tag;
import android.util.Log;
import android.widget.SeekBar;

import static android.content.ContentValues.TAG;


public class SeekbarViewModel extends BaseObservable {
    private BeatBox mBeatBox;

    public SeekbarViewModel(BeatBox beatBox){
        mBeatBox = beatBox;
    }

    public void onPlaybackSpeedRateChanged(SeekBar seekBar, int progress, boolean fromUser){
        mBeatBox.setPlayBackRate(progress);
    }
}