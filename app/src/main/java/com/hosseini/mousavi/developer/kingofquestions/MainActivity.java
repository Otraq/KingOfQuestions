package com.hosseini.mousavi.developer.kingofquestions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("Tag","1");
        Log.e("Tag1","2");
        Log.e("Tag2","3");
    }
}
