package com.fiqryq.helperlibrary.Utils;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

public class Utils extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        Utils.context = getApplicationContext();
    }


    public static String showToastShort(String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        return message;
    }

}
