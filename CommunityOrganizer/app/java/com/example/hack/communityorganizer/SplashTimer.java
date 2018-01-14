package com.example.hack.communityorganizer;

import android.app.Application;
import android.os.SystemClock;

/**
 * Created by hack on 12/10/2017.
 */

public class SplashTimer extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SystemClock.sleep(3000);
    }
}
