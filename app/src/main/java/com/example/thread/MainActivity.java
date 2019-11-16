package com.example.thread;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.thread.ExampleHandler.TA;
import static com.example.thread.ExampleHandler.TB;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    private ExampleLooperThread looperThread = new ExampleLooperThread();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startthread(View view) {
        looperThread.start();
    }

    public void stophread(View view) {
        looperThread.looper.quit();
       // looperThread.handler.getLooper().quit();
    }

    public void atask(View view) {
        Message message = new Message();
        message.what=TA;

        looperThread.handler.sendMessage(message);

//        Handler threadhandle = new Handler(looperThread.looper);
//        threadhandle.post(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i <= 4; i++) {
//                    Log.d(TAG, "run: " + i);
//                    SystemClock.sleep(1000);
//                }
//            }
//        });
    }

    public void btask(View view) {
        Message message =Message.obtain();
        message.what=TB;
        looperThread.handler.sendMessage(message);
    }
}
