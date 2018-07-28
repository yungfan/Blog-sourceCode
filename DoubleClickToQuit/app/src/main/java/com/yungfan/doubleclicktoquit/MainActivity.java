package com.yungfan.doubleclicktoquit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    // 弹出提示框
    private Toast toast;
    // 记录第一次按下的时间
    private long firstPressTime = -1;
    // 记录第二次按下的时间
    private long lastPressTime;
    // 两次按下的时间间隔
    private final long INTERVAL = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toast = Toast.makeText(getApplicationContext(), "再按一次退出程序", Toast.LENGTH_SHORT);

    }

    /**
     * 按下返回键的时候调用
     */
    public void onBackPressed() {

        showQuitTips();
    }


    /**
     * 显示提示框
     */
    private void showQuitTips() {


        // 如果是第一次按下 直接提示
        if (firstPressTime == -1) {

            firstPressTime = System.currentTimeMillis();

            toast.show();

        }

        // 如果是第二次按下，需要判断与上一次按下的时间间隔，这里设置2秒
        else {

            lastPressTime = System.currentTimeMillis();

            if (lastPressTime - firstPressTime <= INTERVAL) {

                System.exit(0);

            } else {

                firstPressTime = lastPressTime;

                toast.show();
            }
        }
    }
}


