package abc.com.retrofitdemo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by yangfan on 2017/1/7.
 */

//与服务器端数据进行字段映射
public class NewsInfo {

    //@SerializedName：后面是服务器端返回的数据字段名 可以与本地不一样 该关键字就是用来映射的
    @SerializedName("_current")
    private String current;
    private String message;
    private List<News> list;

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<News> getList() {
        return list;
    }

    public void setList(List<News> list) {
        this.list = list;
    }


    public static class News {

        private String cover;
        private String isatlas;
        private String id;
        @SerializedName("abstract")
        private String _abstract;
        private String title;
        private String url;

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getIsatlas() {
            return isatlas;
        }

        public void setIsatlas(String isatlas) {
            this.isatlas = isatlas;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String get_abstract() {
            return _abstract;
        }

        public void set_abstract(String _abstract) {
            this._abstract = _abstract;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }


    }
}
