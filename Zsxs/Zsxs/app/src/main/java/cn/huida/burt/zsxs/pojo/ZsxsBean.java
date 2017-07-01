

package cn.huida.burt.zsxs.pojo;

import java.util.List;

/**
 * Created by Q on 2017/6/24.
 */

public class ZsxsBean {

    public Qlogin qlogin;
    public QReset qReset;
    public QRendSms qRendSms;
    public QCategoryList qCategoryList;
    public QCategoryListInfo qCategoryListInfo;
    public QCategoryClassInfo qCategoryClassInfo;
    public QGuidePic qGuidePic;
    public QClass100Info qClass100Info;
    public QZhuanTiList qZhuanTiList;
    public QZhuanTiListInfo qZhuanTiListInfo;
    public QZhuanTiClassInfo qZhuanTiClassInfo;
    public QRecommendClassInfo qRecommendClassInfo;

    public static class  Qlogin{


        public String acode;
        public String Mycode;
        public String username;
        public String Nickname;
        public String Jifen;
        public String Money;
        public int xueshi;
        public String Img;
        public String Vip;
        public String Ktime;
        public String Jtime;
        public int zcode;
        public String Pic;
        public String pwd;
    }
    public static class QReset{
        /**
         * result : 成功
         * Mycode : 1164842
         */

        public String result;
        public String Mycode;
    }

    public static class QRendSms{
        /**
         * codes :
         */

        public String codes;
    }

    public static class QCategoryList{


        public String kc_types;
        public List<TListBean> t_list;

        public  static class TListBean {


            public String id;
            public String name;
        }

    }

    public static  class QCategoryListInfo{


        public String page_all;
        public String page_now;
        public List<CourseBean> Course;

        public static class CourseBean {


            public String kc_id;
            public String title;
            public String img;
            public String info;
            public String money;
            public int keshi;
            public int hot;
            public String teacher;
        }

    }

    public static class  QCategoryClassInfo{



        public String shoucang;
        public String kc_img;
        public String teacher;
        public int hot;
        public int teacher_id;
        public int keshi;
        public List<FilesBean> files;

        public static class FilesBean {


            public String files_id;
            public String files_title;
            public String orderid;
            public String shiting;
            public String files_url;
            public String size;
        }
    }

    public static  class QGuidePic{

        public List<SlidesBean> Slides;

        public static class SlidesBean {

            public String pic;
            public String title;
            public String picURL;
            public String pictype;
        }
    }


    public  static class QClass100Info{

        public List<CourseBean> Course;

        public static class CourseBean {

            public String kc_id;
            public String title;
            public String img;
            public String info;
            public int kc_money;
        }
    }


    public static  class QZhuanTiList{

        public int page_all;
        public int page_now;
        public int types;
        public List<ListBean> list;

        public static class ListBean {


            public String imgURL;
            public int ztid;
        }
    }

    public  static  class QZhuanTiListInfo{



        public int page_all;
        public int page_now;
        public int types;
        public List<ListBean> list;

        public static  class ListBean {


            public String imgURL;
            public int ztid;
        }
    }

    public static  class QZhuanTiClassInfo{



        public String content;
        public String imgURL;
        public int page_all;
        public int page_now;
        public String ZTtitle;
        public List<CourseBean> Course;

        public static class CourseBean {

            public String kc_id;
            public String title;
            public String img;
            public String info;
            public int money;
            public int keshi;
            public int hot;
        }
    }

    public static class QRecommendClassInfo{

        public String page_all;
        public String page_now;
        public List<CourseBean> Course;

        public static class CourseBean {


            public String kc_id;
            public String title;
            public String img;
            public String info;
            public String money;
            public int keshi;
            public int hot;
        }
    }
}
