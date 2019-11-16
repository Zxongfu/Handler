package com.example.thread;

import android.os.Handler;
import android.os.Looper;

public class ExampleLooperThread extends Thread {
    public static final String TAG = "ExampleLooperThread";
    public Handler handler;
    Looper looper;

    @Override
    public void run() {

        Looper.prepare();

        looper=Looper.myLooper();//current Thread

        handler = new ExampleHandler();

        Looper.loop();

    }
}
