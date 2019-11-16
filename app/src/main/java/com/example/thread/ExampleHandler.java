package com.example.thread;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;

import androidx.annotation.NonNull;

public class ExampleHandler extends Handler {
    public static final String TAG = "ExampleHandler";
    public static final int TA=1;
    public static final int TB=2;


    @Override
    public void handleMessage(@NonNull Message msg) {

        switch (msg.what){
            case TA:
                Log.d(TAG, "TA");

                break;
            case TB:
                Log.d(TAG, "TB");
                break;
        }
    }
}
