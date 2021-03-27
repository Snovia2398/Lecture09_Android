package com.snovia.android_animation;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Animation(View view) {
        ImageView imageView= findViewById(R.id.imageView);
       // imageView.animate().alpha(0).setDuration(2000);
       imageView.animate().translationYBy(250).setDuration(2000);
    }
}