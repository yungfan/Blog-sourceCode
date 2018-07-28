package abc.com.retrofitdemo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by yangfan on 2017/1/7.
 */

public interface NewsInterface {


    //获取服务器的新闻列表，需要传递三个参数：新闻类型、第几页、几条数据
    @GET("news/list")
    Call<NewsInfo> newsList(@Query("type") String type, @Query("pn") String pn, @Query("ps") String ps);

}
