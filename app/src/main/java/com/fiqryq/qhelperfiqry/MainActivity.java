package com.fiqryq.qhelperfiqry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.fiqryq.helperlibrary.DateFormat.HelpDateFormat;
import com.fiqryq.helperlibrary.Utils.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, HelpDateFormat.getTimeNow("in","ID"), Toast.LENGTH_SHORT).show();
    }
}