package com.acj.navigationviewdemo;

import android.content.res.Configuration;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    private Toolbar mToolbar;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mActionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initToolBar();
        initViews();
    }

    private void initViews() {

        mDrawerLayout = (DrawerLayout) findViewById(R.id.id_drawer_layout);

        /**
         * 参数1 host Activity
         * 参数4 "open drawer" description for accessibility
         * 参数5 "close drawer" description for accessibility
         */
        mActionBarDrawerToggle = new ActionBarDrawerToggle(this,
                mDrawerLayout, mToolbar, R.string.drawer_open, R.string.drawer_close);
        mActionBarDrawerToggle.syncState();//ActionBarDrawerToggle与DrawerLayout的状态同步
        mDrawerLayout.setDrawerListener(mActionBarDrawerToggle);


    }

    private void initToolBar() {

        mToolbar = (Toolbar) findViewById(R.id.id_toolbar);
        setSupportActionBar(mToolbar);

    }


}
