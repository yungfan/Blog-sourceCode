package com.acj.animationdemo;

import android.graphics.drawable.Animatable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = (ImageView) findViewById(R.id.football);

      //  alphaAnim();

     //    translateAnim();

       // scaleAnim();
        roteteAnim();

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    private void alphaAnim() {
        Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.alphaanim);

        img.startAnimation(animation);
    }

    private void translateAnim() {
        Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translateanim);

        img.startAnimation(animation);
    }

    private void scaleAnim() {
        Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scaleanim);

        img.startAnimation(animation);
    }

    private void roteteAnim() {
        Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotateanim);

        img.startAnimation(animation);
    }

}
