获取首页推荐课程列表
http://api.chinaplat.com/getval_2017?Action=GetTJCourseList
*{Types:}*{Page:}

{
    "Course": [
        {
            "hot": 660,
            "img": "http://www.chinaplat.com/CourseImg/IMG-20170509/20170509142596339633.png",
            "info": "2017年导游考试【大纲分析】讲庿",
            "kc_id": "140725",
            "keshi": 4,
            "money": "2900",
            "title": "2017年导游考试【大纲分析】讲庿"
        },
        {
            "hot": 603,
            "img": "http://www.chinaplat.com/CourseImg/IMG-20170517/20170517095147194719.jpg",
            "info": "TTT-培训师的修炼",
            "kc_id": "140729",
            "keshi": 20,
            "money": "9900",
            "title": "TTT-培训师的修炼"
        },
        {
            "hot": 5518,
            "img": "http://www.chinaplat.com/CourseImg/IMG-20170218/20170218110555975597.jpg",
            "info": "2017导游从业资格--全国导游基础知识（考点精讲＿",
            "kc_id": "140657",
            "keshi": 63,
            "money": "10900",
            "title": "2017导游从业资格--全国导游基础知识（考点精讲＿"
        },
        {
            "hot": 4469,
            "img": "http://www.chinaplat.com/CourseImg/IMG-20170218/20170218091855445544.jpg",
            "info": "2017导游从业资格--政策与法律法规（考点精讲＿",
            "kc_id": "140655",
            "keshi": 61,
            "money": "11900",
            "title": "2017导游从业资格--政策与法律法规（考点精讲＿"
        },
        {
            "hot": 322,
            "img": "http://www.chinaplat.com/CourseImg/IMG-20170526/20170526161678437843.jpg",
            "info": "2017地方导游基础知识（习题提升）",
            "kc_id": "141139",
            "keshi": 1,
            "money": "13900",
            "title": "2017地方导游基础知识（习题提升）"
        },
        {
            "hot": 272,
            "img": "http://www.chinaplat.com/CourseImg/IMG-20170526/20170526161650955095.jpg",
            "info": "2017地方导游基础知识（考点精讲＿",
            "kc_id": "141138",
            "keshi": 1,
            "money": "12900",
            "title": "2017地方导游基础知识（考点精讲＿"
        },
        {
            "hot": 121,
            "img": "http://www.chinaplat.com/CourseImg/IMG-20170515/20170515145758375837.png",
            "info": "国家普通话水平测试过关速成训练",
            "kc_id": "140767",
            "keshi": 12,
            "money": "5900",
            "title": "国家普通话水平测试过关速成训练"
        },
        {
            "hot": 330,
            "img": "http://www.chinaplat.com/CourseImg/IMG-20170509/20170509142735923592.png",
            "info": "2017年导游考试【报名指导】讲庿",
            "kc_id": "140726",
            "keshi": 3,
            "money": "2900",
            "title": "2017年导游考试【报名指导】讲庿"
        },
        {
            "hot": 1475,
            "img": "http://www.chinaplat.com/CourseImg/IMG-20170218/20170218113481938193.jpg",
            "info": "2017导游从业资格--导游业务（习题提升）",
            "kc_id": "140660",
            "keshi": 1,
            "money": "11900",
            "title": "2017导游从业资格--导游业务（习题提升）"
        },
        {
            "hot": 2390,
            "img": "http://www.chinaplat.com/CourseImg/IMG-20170218/20170218113419301930.jpg",
            "info": "2017导游从业资格--导游业务（考点精讲＿",
            "kc_id": "140659",
            "keshi": 40,
            "money": "10900",
            "title": "2017导游从业资格--导游业务（考点精讲＿"
        }
    ],
    "page_all": "17",
    "page_now": "1"
}
{"hot":"热度","img":"课程缩略图","info":"课程简介","kc_id":"课程id号","keshi":"总课时","money":
"课程积分价格","title":"课程标题","page_all":"总页数","page_now":"当前页码"}


获取收藏课程列表
http://api.chinaplat.com/getval_2017?

Action=getFavorite&acode=cb81088dd9932f987ba488a16a737cb9&Uid=13323038757

{
    "Course": [],
    "page_all": 0,
    "page_now": 1
}
{"title":"课程标题","info":"课程简介","teacher":"上传者"}

获取用户信息
http://api.chinaplat.com/getval_2017?

Action=getUserInfo&acode=cb81088dd9932f987ba488a16a737cb9&Uid=13323038757
{
    "Address": "",
    "Email": "email",
    "Jifen": "588",
    "Mobile": "",
    "Money": "0",
    "Nicename": "qin",
    "Pic": "http://www.chinaplat.com/User/UserHeadImg/164835.jpg",
    "Sex": "",
    "xueshi": 0
}
{"Address":"地址","Email":"邮箱","Jifen":"积分","Mobile":"电话","Nicename":"昵称","Pic":"头

像","Sex":"性别"}

更新用户密码
http://api.chinaplat.com/getval_2017?

Action=ModPwd&acode=cb81088dd9932f987ba488a16a737cb9&Uid=13323038757&Oldpwd=e807f1fcf82d132f9bb0

18ca6738a19f&Newpwd=123456789
{
    "success":"成功"
}

*更新用户头像




更新用户基本信息
http://api.chinaplat.com/getval_2017?

Action=saveUserInfo&acode=cb81088dd9932f987ba488a16a737cb9&Uid=13323038757
{
    "success":"成功"
}

*找回密码功能（可以不做）

购买课程
(注意：购买课程两分两步 第一步调用该接口不填写BUY参数，返回用户的一些月信息和需要支付的价格，第二步再

次调用该参数buy=yes 执行购买)

http://api.chinaplat.com/getval_2017?

Action=BuyCourse&acode=cb81088dd9932f987ba488a16a737cb9&Uid=13323038757&cid=118812
第一步（buy参数省略时）：
{
    "jifen": 588,
    "money_1": 2900,
    "xuebi": 0
}
{"jifen":"用户的积分余额","money_1":"当前课程需要支付的积分价格","xuebi":"用户的学币余额"}

http://api.chinaplat.com/getval_2017?

Action=BuyCourse&acode=cb81088dd9932f987ba488a16a737cb9&Uid=13323038757&cid=118812&Buy=yes
第二步（buy参数为yes时）：
{
    "success":"成功"
}




获取课程评论
http://api.chinaplat.com/getval_2017?Action=GetCoursePL&cid=118812
{
    "page_all": 0,
    "page_now": 1,
    "pllist": []
}


评论课程	
http://api.chinaplat.com/getval_2017?Action=SaveCoursePL&cid=118812&plcontent=%22%E8%AE

%B2%E7%9A%84%E4%B8%8D%E9%94%99%EF%BC%8C%E9%9D%9E%E5%B8%B8%E5%A5%BD!

%22&acode=cb81088dd9932f987ba488a16a737cb9&Uid=13323038757
{"plcontent":"评论内容"}
{
    "result": "success"
}







