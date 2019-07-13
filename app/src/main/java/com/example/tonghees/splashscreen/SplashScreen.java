package com.example.tonghees.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.tonghees.MainActivity;
import com.example.tonghees.R;

public class SplashScreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_splash);
        Thread thread = new Thread() {
            public void run() {
                try {
                    sleep(4000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    startActivity(new Intent(SplashScreen.this, MainActivity.class));
                    finish();
                }
            }

        };
        thread.start();
    }
}
