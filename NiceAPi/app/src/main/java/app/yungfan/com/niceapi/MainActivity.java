package app.yungfan.com.niceapi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private RelativeLayout rl;
    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        RelativeLayout rl = (RelativeLayout) findViewById(R.id.content);
//
//        rl.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });


//        et = (EditText) findViewById(R.id.et);

//        et.setKeyListener(new NumberKeyListener() {
//
//            //限制弹出的键盘类型
//            public int getInputType() {
//
//                return InputType.TYPE_CLASS_NUMBER;
//
//            }
//
//            //限定输入的字符
//            protected char[] getAcceptedChars() {
//
//                char[] numbers = new char[]{'.', '1', '3', '5', '7', '9'};
//
//                return numbers;
//
//            }
//
//        });
    }

}
