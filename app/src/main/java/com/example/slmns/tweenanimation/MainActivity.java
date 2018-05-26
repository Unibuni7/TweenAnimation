package com.example.slmns.tweenanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         imageView = (ImageView) findViewById(R.id.image);
    }

    public void Zoom(View view) {

        Animation zoom = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.zoom);
        imageView.startAnimation(zoom);
    }

    public void Clockwise(View view) {
        Animation clockwise = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.clockwise);
        imageView.startAnimation(clockwise);
    }

    public void Fade(View view) {
        Animation fade =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.fade);
        imageView.startAnimation(fade);
    }

    public void Blink(View view) {
        Animation blink =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.blink);
        imageView.startAnimation(blink);
    }

    public void Move(View view) {
        Animation move =
                AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        imageView.startAnimation(move);
    }

    public void Slide(View view) {
        Animation slide =
                AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);
        imageView.startAnimation(slide);
    }
}
