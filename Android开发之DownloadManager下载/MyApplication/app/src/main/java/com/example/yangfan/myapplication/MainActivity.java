package com.example.yangfan.myapplication;

import android.app.DownloadManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.MimeTypeMap;

public class MainActivity extends AppCompatActivity {

    private DownloadUtils downloadUtils;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        downloadUtils =   new DownloadUtils(MainActivity.this);
        downloadUtils.downloadAPK("http://192.168.1.104:8080/abc.apk", "abc.apk");

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//
//
//
//
//            }
//        }).start();
    }
}
