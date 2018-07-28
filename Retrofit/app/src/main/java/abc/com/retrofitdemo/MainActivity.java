package abc.com.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;

    //服务器的基地址 与  @GET("news/list")拼接
    private static final String baseUrl = "http://121.201.14.52:9001/server/e/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = (TextView) findViewById(R.id.tvResult);

        initRetrofit();
    }

    private void initRetrofit() {

        Retrofit retrofit = new Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create())
                .build();


        NewsInterface newsInterface = retrofit.create(NewsInterface.class);


        Call<NewsInfo> callNewsInfo = newsInterface.newsList("1", "1", "10");


        callNewsInfo.enqueue(new Callback<NewsInfo>() {
            @Override
            public void onResponse(Call<NewsInfo> call, Response<NewsInfo> response) {
                //成功
                if (response.code() == 200) {
                    //直接拿到JavaBean
                    NewsInfo newsInfo = response.body();
                    if (newsInfo.getMessage().equals("ok")) {
                        //最爽的地方---直接可以进行UI操作
                        tvResult.setText(newsInfo.getList().get(1).get_abstract());
                    }
                } else {
                    //请求失败
                    tvResult.setText("查询失败！响应码为：" + response.code());
                }
            }

            @Override
            public void onFailure(Call<NewsInfo> call, Throwable t) {
                //请求失败
                t.printStackTrace();
                tvResult.setText("查询失败！错误原因：" + t.getCause());
            }
        });

    }
}
