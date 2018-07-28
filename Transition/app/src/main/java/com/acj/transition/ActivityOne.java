package com.acj.transition;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v4.util.SimpleArrayMap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.format.DateUtils;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.util.ArrayMap;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityOne extends Activity {


    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        intent = new Intent(ActivityOne.this, ActivityTwo.class);

    }

    public void explode(View view) {

        intent.putExtra("transition", "explode");
//        Explode explode = new Explode();
//        explode.setDuration(2000);
//        getWindow().setExitTransition(explode);
        //将原先的跳转改成如下方式
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(ActivityOne.this).toBundle());

    }

    public void slide(View view) {

        intent.putExtra("transition", "slide");
//        Slide slide = new Slide();
//        slide.setDuration(2000);
//        getWindow().setExitTransition(slide);
        //将原先的跳转改成如下方式
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(ActivityOne.this).toBundle());

    }

    public void fade(View view) {

        intent.putExtra("transition", "fade");

//        Fade fade = new Fade();
//        fade.setDuration(2000);
//        getWindow().setExitTransition(fade);
        //将原先的跳转改成如下方式
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(ActivityOne.this).toBundle());

    }

    public void share(View view) {

        //共享元素
        Button share = (Button) findViewById(R.id.share);
        intent.putExtra("transition", "share");

        //将原先的跳转改成如下方式
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(ActivityOne.this, share, "shareTransition").toBundle());

    }


}
