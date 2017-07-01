* XR
* 
* 
* url解析 每一个功能的url
 
22.获取同类推荐GetSameCourse	

	

{Action：GetSameCourse}
{cid：118812}
{kc_types：0}

	{
    "kc_types": "0",
    "sameCourse": [
        {
            "kc_id": "108725",
            "title": "一建考试-建设工程经济",
            "img": "http://****/CourseImg/IMG-20150317/20150317223842834283.jpg",
            "info": "一级建造师执业资格考试《建筑专业》全科视频教程，课程主要由资深教师剖析教程，总结考试考点，结合考试真...",
            "money": "1000",
            "hot": 173,
            "keshi": 40,
            "teacher": "思"
        },
        {
            "kc_id": "109387",
            "title": "二级建造师--专业工程管理与实务(公路工程)考点预测",
            "img": "http://****/CourseImg/IMG-20151129/20151129145665576557.jpg",
            "info": "本课程对专业工程管理与实务(公路工程)考点进行了预测，有助于考生好好备考。李昌春：阅卷专家、教辅编委...",
            "money": "600",
            "hot": 218,
            "keshi": 6,
            "teacher": "檀老师"
        },
        {
            "kc_id": "109389",
            "title": "二级建造师-专业工程管理与实务(市政公用工程)考点预测",
            "img": "http://****/CourseImg/IMG-20151127/20151127232492599259.jpg",
            "info": "本课程对专业工程管理与实务(市政公用工程)考点进行了预测，有助于考生进行备考。讲师凌平平：国家注册一...",
            "money": "600",
            "hot": 280,
            "keshi": 6,
            "teacher": "盼"
        },
        {
            "kc_id": "118855",
            "title": "一级建造师-《矿业工程》 管理与实务精讲",
            "img": "http://****/CourseImg/IMG-20151006/20151006135366586658.png",
            "info": "一级建造师-《矿业工程》 管理与实务精讲视频教程名师授课，对知识点全面精讲，图文结合讲解，内容涵盖9...",
            "money": "2900",
            "hot": 770,
            "keshi": 58,
            "teacher": "."
        },
        {
            "kc_id": "109304",
            "title": "二级建造师--市政工程管理与实务",
            "img": "http://****/CourseImg/IMG-20151127/20151127230542964296.jpg",
            "info": "本课程知识点全面精讲，内容涵盖90%以上考点，总体把握考试讲师授课特色：全面细致，授课针对性强。是建...",
            "money": "2000",
            "hot": 214,
            "keshi": 58,
            "teacher": "盼"
        },
        {
            "kc_id": "108708",
            "title": "《二建考试之--机电》",
            "img": "http://****/CourseImg/IMG-20150316/20150316223633873387.jpg",
            "info": "2015年二级建造师《机电》考试之建设工程法规相关知识+建设工程施工管理+公路工程管理实务之教材变更...",
            "money": "675",
            "hot": 220,
            "keshi": 27,
            "teacher": "盼"
        }
    ]
}	
	


	
http://****?Action=GetSameCourse&cid=118812&kc_types=0







23.添加收藏课程SaveFavorite	
	
	
{Action：GetSameCourse}
{cid：118812}
{acode:cb81088dd9932f987ba488a16a737cb9cb81088dd9932f987ba488a16a737cb9}
{Uid:13323038757}

	{"result":"success"}

http://****?Action=SaveFeedBack&acode=cb81088dd9932f987ba488a16a737cb9&Uid=13323038757&cid=118812

24.删除收藏课程DeleteFavorite


{Action：GetSameCourse}
{cid：118812}
{acode:cb81088dd9932f987ba488a16a737cb9cb81088dd9932f987ba488a16a737cb9}
{Uid:13323038757}

	{"result":"success"}

http://****?Action=SaveFeedBack&acode=cb81088dd9932f987ba488a16a737cb9&Uid=13323038757&cid=118812

25.保存反馈信息SaveFeedBack


{Action：GetSameCourse}
{acode:cb81088dd9932f987ba488a16a737cb9cb81088dd9932f987ba488a16a737cb9}
{Uid:13323038757}
{content:sdsds}
{title:jdjjddj}

	{"result":"success"}

http://****?Action=SaveFeedBack&title=jdjjddj&acode=cb81088dd9932f987ba488a16a737cb9&content=sdsds&Uid=13323038757
	
26.保存课程征订信息SaveSubscription


{Action：SaveSubscription}
{acode:cb81088dd9932f987ba488a16a737cb9cb81088dd9932f987ba488a16a737cb9}
{Uid:13323038757}
{content:sdsds}
{title:jdjjddj}	


	{"result":"success"}

http://****?Action=SaveSubscription&title=jdjjddj&acode=cb81088dd9932f987ba488a16a737cb9&content=sdsds&Uid=13323038757

27.获取课程征订列表getSubscription

{Action：SaveSubscription}
{content:sdsds}
{title:jdjjddj}
	
	{
    "subList": [
        {
            "id": "10181",
            "hot": "1",
            "title": "jdjjddj",
            "content": "sdsds",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2017-6-24 21:51:49",
            "userid": "164835"
        },
        {
            "id": "10180",
            "hot": "2",
            "title": "java系统自学教程",
            "content": "自学java系统完整课程",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2017-6-9 15:38:44",
            "userid": "11293"
        },
        {
            "id": "10179",
            "hot": "2",
            "title": "PHP",
            "content": "PHP高级视频",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2017-6-9 9:06:58",
            "userid": "163247"
        },
        {
            "id": "10178",
            "hot": "2",
            "title": "选调生面试视频",
            "content": "历年选调生面试视屏",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2017-5-27 12:29:58",
            "userid": "163991"
        },
        {
            "id": "10177",
            "hot": "3",
            "title": "护理",
            "content": "中级护师",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2017-5-11 21:51:29",
            "userid": "21361"
        },
        {
            "id": "10176",
            "hot": "3",
            "title": "英语阅读技巧，",
            "content": "更多文章",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2017-5-5 15:09:01",
            "userid": "163004"
        },
        {
            "id": "10175",
            "hot": "4",
            "title": "初中体育与健康",
            "content": "初中体育与健康",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2017-4-23 20:33:54",
            "userid": "0"
        },
        {
            "id": "10174",
            "hot": "2",
            "title": "征订",
            "content": "428865",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2017-3-25 18:25:23",
            "userid": "60437"
        },
        {
            "id": "10173",
            "hot": "3",
            "title": "审计学00067",
            "content": "全郭",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2017-3-25 7:41:56",
            "userid": "29103"
        },
        {
            "id": "10172",
            "hot": "2",
            "title": "征订测试",
            "content": "69986",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2017-3-24 15:09:45",
            "userid": "60437"
        },
        {
            "id": "10171",
            "hot": "1",
            "title": "测试征订",
            "content": "6653583",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2017-3-24 14:53:41",
            "userid": "60437"
        },
        {
            "id": "10170",
            "hot": "1",
            "title": "测试征订",
            "content": "42565",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2017-3-24 14:53:08",
            "userid": "60437"
        },
        {
            "id": "10169",
            "hot": "1",
            "title": "测试",
            "content": "25554",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2017-3-24 14:51:41",
            "userid": "60437"
        },
        {
            "id": "10168",
            "hot": "1",
            "title": "测试中",
            "content": "65867",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2017-3-24 14:43:25",
            "userid": "60437"
        },
        {
            "id": "10167",
            "hot": "1",
            "title": "测试中",
            "content": "6583644",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2017-3-24 14:43:00",
            "userid": "60437"
        },
        {
            "id": "10166",
            "hot": "1",
            "title": "测试",
            "content": "5565295",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2017-3-24 14:41:01",
            "userid": "60437"
        },
        {
            "id": "10165",
            "hot": "1",
            "title": "测试",
            "content": "5555145",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2017-3-24 14:37:10",
            "userid": "60437"
        },
        {
            "id": "10164",
            "hot": "1",
            "title": "测试",
            "content": "7434946",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2017-3-24 14:34:19",
            "userid": "60437"
        },
        {
            "id": "10163",
            "hot": "1",
            "title": "测试",
            "content": "11111111",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2017-3-24 14:30:07",
            "userid": "60437"
        },
        {
            "id": "10162",
            "hot": "1",
            "title": "看看",
            "content": "啦啦啦",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2017-3-17 17:57:44",
            "userid": "28656"
        },
        {
            "id": "10161",
            "hot": "2",
            "title": "如何制作精美PPT",
            "content": "求教制作精美PPT教程",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2017-3-16 9:32:08",
            "userid": "12084"
        },
        {
            "id": "10160",
            "hot": "1",
            "title": "特岗初中英语专业知识讲解",
            "content": "考初中特岗英语专业知识涉及到哪些",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2017-3-12 23:25:09",
            "userid": "95499"
        },
        {
            "id": "10159",
            "hot": "1",
            "title": "测试",
            "content": "测试",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2017-3-2 11:17:26",
            "userid": "60437"
        },
        {
            "id": "10158",
            "hot": "2",
            "title": "元认知怎么培养",
            "content": "元认知很总要，什么是好的元认知，怎么培训",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2017-3-1 10:49:08",
            "userid": "0"
        },
        {
            "id": "10157",
            "hot": "2",
            "title": "小学教师资格证",
            "content": "教育知识与能力",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2017-2-11 22:17:32",
            "userid": "60435"
        },
        {
            "id": "10156",
            "hot": "1",
            "title": "教师证面试高中政治",
            "content": "高中政治的面试视频",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-12-27 15:24:40",
            "userid": "39470"
        },
        {
            "id": "10155",
            "hot": "1",
            "title": "肖秀荣考研政治命题人知识点提要视频",
            "content": "肖秀荣考研政治命题人知识点提要视频",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-12-19 13:46:02",
            "userid": "39235"
        },
        {
            "id": "10154",
            "hot": "1",
            "title": "教师资格证面试",
            "content": "高中语文教师资格证面试",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-12-18 21:43:52",
            "userid": "39222"
        },
        {
            "id": "10153",
            "hot": "1",
            "title": "小学社会面试",
            "content": "试讲课程",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-12-16 16:57:18",
            "userid": "39163"
        },
        {
            "id": "10152",
            "hot": "2",
            "title": "???????",
            "content": "???????",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-12-16 9:35:12",
            "userid": "11562"
        },
        {
            "id": "10151",
            "hot": "1",
            "title": "???????",
            "content": "???????",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-12-16 9:34:47",
            "userid": "11562"
        },
        {
            "id": "10150",
            "hot": "1",
            "title": "???????",
            "content": "???????",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-12-16 9:34:18",
            "userid": "11562"
        },
        {
            "id": "10149",
            "hot": "1",
            "title": "伤寒杂病论",
            "content": "伤寒杂病论",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-12-12 20:03:39",
            "userid": "29015"
        },
        {
            "id": "10148",
            "hot": "1",
            "title": "伤寒杂病论",
            "content": "伤寒杂病论视频",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-12-12 19:56:27",
            "userid": "29015"
        },
        {
            "id": "10147",
            "hot": "1",
            "title": "自考本科",
            "content": "工本高数",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-12-6 19:16:05",
            "userid": "26409"
        },
        {
            "id": "10146",
            "hot": "1",
            "title": "伤寒杂病论",
            "content": "伤寒杂病论",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-12-2 0:12:50",
            "userid": "29015"
        },
        {
            "id": "10145",
            "hot": "1",
            "title": "伤寒杂病论",
            "content": "伤寒杂病论",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-12-2 0:11:42",
            "userid": "29015"
        },
        {
            "id": "10144",
            "hot": "1",
            "title": "国家计算机资格证",
            "content": "国家计算机资格证",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-10-28 20:56:44",
            "userid": "28556"
        },
        {
            "id": "10143",
            "hot": "2",
            "title": "古本易筋经十二式导引法",
            "content": "教学视频",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-10-24 11:02:21",
            "userid": "28364"
        },
        {
            "id": "10142",
            "hot": "11",
            "title": "2016河北高速",
            "content": "2016河北高速考试",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-10-17 20:34:46",
            "userid": "27817"
        },
        {
            "id": "10141",
            "hot": "14",
            "title": "高速公路考试课程",
            "content": "求课程和试题",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-10-15 7:55:12",
            "userid": "27247"
        },
        {
            "id": "10140",
            "hot": "13",
            "title": "高速公路考试课程",
            "content": "求课程和试题",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-10-15 7:55:05",
            "userid": "27247"
        },
        {
            "id": "10139",
            "hot": "1",
            "title": "资产评估",
            "content": "资产评估相关视频课程和资料",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-10-14 14:37:36",
            "userid": "26142"
        },
        {
            "id": "10138",
            "hot": "10",
            "title": "2016年高速公路招聘复习资料",
            "content": "2016年高速公路招聘复习资料 精品题库 往年试题 20106年真题精选",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-10-13 21:11:09",
            "userid": "27105"
        },
        {
            "id": "10137",
            "hot": "13",
            "title": "2016年高速公路收费员考试题",
            "content": "高速路收费员考试题",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-10-11 21:21:35",
            "userid": "26610"
        },
        {
            "id": "10136",
            "hot": "11",
            "title": "高速招聘",
            "content": "高速招聘题库",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-10-10 19:46:29",
            "userid": "13845"
        },
        {
            "id": "10135",
            "hot": "1",
            "title": "HCNA",
            "content": "华为认证",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-10-9 15:27:03",
            "userid": "26409"
        },
        {
            "id": "10134",
            "hot": "1",
            "title": "计量经济学",
            "content": "计量经济学",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-9-5 11:32:03",
            "userid": "25059"
        },
        {
            "id": "10133",
            "hot": "2",
            "title": "考博",
            "content": "公共课",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-9-5 9:49:02",
            "userid": "25123"
        },
        {
            "id": "10132",
            "hot": "1",
            "title": "江苏导游基础知识",
            "content": "江苏导游基础知识",
            "hfcontent": "中仕学社有整理好的内部资料哦！购买套餐免费赠送！http://****/html/2016/daoyou/",
            "hftime": "2016-9-21 13:53:11",
            "addtime": "2016-8-30 9:14:48",
            "userid": "21962"
        },
        {
            "id": "10131",
            "hot": "6",
            "title": "导游服务能力",
            "content": "贵州",
            "hfcontent": "http://****/C10410_138837.html",
            "hftime": "2016-9-21 13:47:35",
            "addtime": "2016-8-24 1:03:43",
            "userid": "24830"
        },
        {
            "id": "10130",
            "hot": "4",
            "title": "JAVA",
            "content": "全国计算机二级考试JAVA视频教程",
            "hfcontent": "http://****/html/jisuanji2ji",
            "hftime": "2016-8-23 15:03:52",
            "addtime": "2016-8-21 22:55:03",
            "userid": "24748"
        },
        {
            "id": "10129",
            "hot": "3",
            "title": "上海导游证考试培训",
            "content": "由于今年上海导游证考试改革，所以力求政府部门可以多播放一些模板视频给大家",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-8-20 14:53:25",
            "userid": "24700"
        },
        {
            "id": "10125",
            "hot": "1",
            "title": "主管护师",
            "content": "主管护师课程",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-8-15 17:19:02",
            "userid": "21361"
        },
        {
            "id": "10124",
            "hot": "2",
            "title": "德语",
            "content": "德语入门",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-8-8 22:20:15",
            "userid": "17333"
        },
        {
            "id": "10123",
            "hot": "2",
            "title": "2016政法干警文综",
            "content": "2016政法干警文综",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-8-5 20:00:11",
            "userid": "19573"
        },
        {
            "id": "10122",
            "hot": "2",
            "title": "河北省2016年特岗教师面试视频",
            "content": "河北省2016年特岗教师小学语文人教版面试视频",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-8-5 9:59:17",
            "userid": "15827"
        },
        {
            "id": "10121",
            "hot": "6",
            "title": "公共基础知识",
            "content": "公共基础知识＋教育综合知识",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-8-3 15:52:59",
            "userid": "19452"
        },
        {
            "id": "10111",
            "hot": "1",
            "title": "竖笛学习",
            "content": "我想学习竖笛，希望有一门基础的课程。",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-7-19 21:31:20",
            "userid": "19463"
        },
        {
            "id": "10109",
            "hot": "3",
            "title": "英语四级",
            "content": "大学英语四级",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-7-12 11:20:33",
            "userid": "10936"
        },
        {
            "id": "10098",
            "hot": "3",
            "title": "设计院",
            "content": "设计相关课程",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-6-27 11:13:31",
            "userid": "10607"
        },
        {
            "id": "10092",
            "hot": "2",
            "title": "html5画布",
            "content": "需要一份html5画布的课",
            "hfcontent": "http://****/C10035_108945.html祝您学习愉快哦！",
            "hftime": "2016-9-21 13:51:49",
            "addtime": "2016-6-20 17:13:12",
            "userid": "11562"
        },
        {
            "id": "10091",
            "hot": "2",
            "title": "特岗教师",
            "content": "特岗教师",
            "hfcontent": "http://****/0_0____%CC%D8%B8%DA%BD%CC%CA%A6_1.html",
            "hftime": "2016-8-23 15:05:04",
            "addtime": "2016-6-8 9:46:02",
            "userid": "13870"
        },
        {
            "id": "10090",
            "hot": "2",
            "title": "2016河北省特岗教师招聘",
            "content": "2016河北省特岗教师招聘",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-6-5 19:42:12",
            "userid": "13870"
        },
        {
            "id": "10089",
            "hot": "1",
            "title": "2016河北省特岗教师招聘",
            "content": "2016河北省特岗教师招聘",
            "hfcontent": "http://****/html/2016/tegang/",
            "hftime": "2016-8-23 15:03:19",
            "addtime": "2016-6-5 19:42:12",
            "userid": "13870"
        },
        {
            "id": "10088",
            "hot": "2",
            "title": "有关高速公路工作者考试的课程",
            "content": "2016年河北省高速公路收费员招聘考试，公共基础知识课程及真题解析",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-5-28 22:27:36",
            "userid": "19190"
        },
        {
            "id": "10087",
            "hot": "1",
            "title": "小学英语教师资格证面试",
            "content": "小学英语教师资格证面试",
            "hfcontent": "http://****/html/jiaomian",
            "hftime": "2016-9-21 13:53:57",
            "addtime": "2016-5-19 10:25:28",
            "userid": "19005"
        },
        {
            "id": "10084",
            "hot": "2",
            "title": "2016年幼儿教师资格证面试",
            "content": "2016年幼儿教师资格证面试课程、教案。",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-5-16 10:21:01",
            "userid": "0"
        },
        {
            "id": "10083",
            "hot": "3",
            "title": "高中美术",
            "content": "美术教案，课课稿",
            "hfcontent": "http://****/html/jiaomianziliao#hh3 欢迎下载各个科目的参考教案！祝您考试顺利",
            "hftime": "2016-9-21 13:50:31",
            "addtime": "2016-5-14 21:21:38",
            "userid": "17979"
        },
        {
            "id": "10080",
            "hot": "5",
            "title": "行测、申论",
            "content": "山西省公务员考试书籍",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-3-18 18:52:59",
            "userid": "15216"
        },
        {
            "id": "10079",
            "hot": "3",
            "title": "毕业论文",
            "content": "大学生毕业论文，视频和文章类的应该多弄一些，谢谢，",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-3-5 14:23:59",
            "userid": "12084"
        },
        {
            "id": "10075",
            "hot": "2",
            "title": "孩子教育",
            "content": "如何正确的教育孩子，和孩子做好朋友",
            "hfcontent": "http://****/0_100____%BA%A2%D7%D3+%BD%CC%D3%FD_1.html",
            "hftime": "2016-4-21 11:53:49",
            "addtime": "2016-3-1 9:40:08",
            "userid": "12084"
        },
        {
            "id": "10074",
            "hot": "2",
            "title": "厨具安装",
            "content": "安装厨具的过程，排烟罩，管道安装过程，谢谢",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-2-29 21:01:53",
            "userid": "12143"
        },
        {
            "id": "10073",
            "hot": "2",
            "title": "乒乓球教学课程",
            "content": "打了很多年乒乓球，但是一直打得不好，希望能有系统学习乒乓球打发的理论。",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2016-2-28 17:29:10",
            "userid": "10014"
        },
        {
            "id": "10053",
            "hot": "1",
            "title": "英语专八",
            "content": "相关资料",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2015-12-15 17:41:40",
            "userid": "14568"
        },
        {
            "id": "10040",
            "hot": "5",
            "title": "河北高速公路招聘",
            "content": "习题",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2015-12-4 21:35:54",
            "userid": "14464"
        },
        {
            "id": "10039",
            "hot": "7",
            "title": "高速公路招考",
            "content": "模拟题",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2015-12-2 19:42:41",
            "userid": "14138"
        },
        {
            "id": "10038",
            "hot": "2",
            "title": "高速公里基础知识",
            "content": "高速公里基础知识",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2015-12-2 8:42:11",
            "userid": "13928"
        },
        {
            "id": "10037",
            "hot": "1",
            "title": "河北省高速公路考试",
            "content": "河北省高速公路考试复习资料、视频等",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2015-11-29 8:56:23",
            "userid": "0"
        },
        {
            "id": "10035",
            "hot": "1",
            "title": "公共营养师二级",
            "content": "营养师二级",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2015-11-24 13:38:15",
            "userid": "10040"
        },
        {
            "id": "10033",
            "hot": "1",
            "title": "平面设计专业软件教程",
            "content": "平面",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2015-11-4 16:35:00",
            "userid": "10936"
        },
        {
            "id": "10032",
            "hot": "1",
            "title": "广播电视学",
            "content": "专接本 新闻学概论 中国新闻传播史 新闻采访学",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2015-10-28 19:31:30",
            "userid": "11853"
        },
        {
            "id": "10031",
            "hot": "1",
            "title": "应用心理学",
            "content": "专接本 应用心理学 普通心理学 西方近代心理学史",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2015-10-28 19:29:47",
            "userid": "11853"
        },
        {
            "id": "10028",
            "hot": "4",
            "title": "鬼步舞",
            "content": "鬼步舞",
            "hfcontent": "http://****/C10933_118513.html 这些舞蹈也不错哦！感谢您的征集！我们将继续努力满足您的学习需求！",
            "hftime": "2016-9-21 13:49:26",
            "addtime": "2015-8-31 20:05:12",
            "userid": "10419"
        },
        {
            "id": "10026",
            "hot": "8",
            "title": "计算机二级公共基础知识",
            "content": "计算机二级公共基础知识",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2015-8-13 16:00:16",
            "userid": "10837"
        },
        {
            "id": "10025",
            "hot": "5",
            "title": "计算机二级公共基础知识",
            "content": "计算机二级公共基础知识",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2015-8-13 16:00:14",
            "userid": "10837"
        },
        {
            "id": "10023",
            "hot": "4",
            "title": "考研数学",
            "content": "考研高数二",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2015-8-11 10:11:27",
            "userid": "10035"
        },
        {
            "id": "10022",
            "hot": "4",
            "title": "江苏省计算机二级VFP",
            "content": "关于江苏省计算机二级VFP的考点讲解",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2015-7-31 16:20:47",
            "userid": "10777"
        },
        {
            "id": "10021",
            "hot": "23",
            "title": "风险控制类课程",
            "content": "讲企业风险管理的课程，包括人员风险，财务风险，战略风险，市场风向等",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2015-7-29 16:04:26",
            "userid": "10014"
        },
        {
            "id": "10020",
            "hot": "9",
            "title": "二级计算机高级办公自动化",
            "content": "试题及视频解析",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2015-7-25 19:54:27",
            "userid": "10679"
        },
        {
            "id": "10019",
            "hot": "6",
            "title": "二级计算机高级办公自动化",
            "content": "试题及视频解析",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2015-7-25 19:54:07",
            "userid": "10679"
        },
        {
            "id": "10016",
            "hot": "36",
            "title": "我要看计算机原理的课程",
            "content": "有关计算机组成原理的一些课程",
            "hfcontent": "http://****/0_100____%BC%C6%CB%E3%BB%FA+%D4%AD%C0%ED_1.html",
            "hftime": "2016-5-3 9:38:45",
            "addtime": "2015-7-3 16:11:01",
            "userid": "10013"
        },
        {
            "id": "10010",
            "hot": "13",
            "title": "最新公务员申论，行测视频",
            "content": "今年的考试不是有更新么，导致很多人没有完成，因此强烈建议增加新的视频",
            "hfcontent": "",
            "hftime": "",
            "addtime": "2015-5-17 14:43:26",
            "userid": "10426"
        }
    ]
}

http://****?Action=getSubscription&title=jdjjddj&content=sdsds
	
28.征集追加SubscriptionAgree
	
{Action：SubscriptionAgree}
{acode:cb81088dd9932f987ba488a16a737cb9cb81088dd9932f987ba488a16a737cb9}
{Uid:13323038757}
{id:id}

	{"result":"success"}

http://****?Action=SubscriptionAgree&acode=cb81088dd9932f987ba488a16a737cb9&Uid=13323038757&id=id

29.搜索课程searchCourse	

{Action:searchCourse}
{kc_types:0}
{keywords:W}

	{
    "page_all": 4,
    "page_now": 1,
    "kc_types": 0,
    "courseList": [
        {
            "kc_id": "140478",
            "title": "响应式网页设计",
            "img": "http://****/CourseImg/IMG-20161224/20161224095173197319.png",
            "info": "为提供用户体验度，我们需要利用响应式设计的功能使得我们的页面适应不同的设备尺寸。在本课程中我们会学习响应式设计最常用的工具，并且做一些实例供大家联系巩固所学的知识，理论+实践让你快速掌握响应式设计方法！",
            "money": "100",
            "keshi": 36,
            "hot": 926,
            "teacher": ""
        },
        {
            "kc_id": "118891",
            "title": "办公软件金山WPS Office表格2013全套从入门到精通",
            "img": "http://****/CourseImg/IMG-20151009/20151009225390109010.jpg",
            "info": "办公软件金山WPS Office表格2013全套从入门到精通教程由Office培训讲师讲解风格细致入微、通俗易懂，并从最基础的知识开始讲解到比较高深的应用，内容全面。并在视频教程中配以大量的实例进行讲解，让课程生动起来。来学习吧！如果你是职场办公人员。你一定用得上。WPS Office系列包括有“WPS文字”“WPS表格”“WPS演示”等，“WPS文字”WPS Office系列软件之一，是国内优秀的文字处理软件，可以处理文书、表格、简报、书籍编著、文件整理等各种文字工作，能提高我们的工作效率。",
            "money": "1088",
            "keshi": 55,
            "hot": 804,
            "teacher": ""
        },
        {
            "kc_id": "118932",
            "title": "Dreamweaver网页制作 在线自学视频DW淘宝美工自学",
            "img": "http://****/CourseImg/IMG-20151020/20151020210225542554.png",
            "info": "网页的基本对象包括文本、图像、超链接等等，这些是构成整个网页的灵魂。正是有了这些基本对象，我们才能制作出或华丽、或大气、或细致的漂亮网页。本课程主要向学员介绍了对网页对象基本编辑的方法。本课程采用实例的方式，详细系统地讲解了Dreamweaver CS5网页制作的基本方法与要点，对刚接触Dreamweaver CS5网页制作的学员有很好的指导参考作用。",
            "money": "2000",
            "keshi": 40,
            "hot": 667,
            "teacher": "王一"
        },
        {
            "kc_id": "118555",
            "title": "轻松玩转办公软件",
            "img": "http://****/CourseImg/IMG-20160217/20160217141850225022.jpg",
            "info": "本套视频主要针对现代企业对员工素质的要求而设计，适合各个层次的办公人员及管理人员，能使您快速掌握现代商务办公的各项知识和操作技术。内容丰富，体系完整，贴近实际应用。",
            "money": "1000",
            "keshi": 78,
            "hot": 517,
            "teacher": "."
        },
        {
            "kc_id": "120259",
            "title": "网页设计综合课程Dreamweaver模块",
            "img": "http://****/CourseImg/IMG-20160125/20160125095785048504.jpg",
            "info": "通过本视频课程的学习，学员可以学到以下内容：1.认识Html等网页属性名称2.掌握站点制作和操作要领3.了解网页制作的流程4.熟悉表格布局5.站点的建立6.文字图片加入的操作7.表格及其用表格进行布局8.制作超级链接9.了解的链接属性（注意:本视频课程仅有视频无附件资料）",
            "money": "3000",
            "keshi": 59,
            "hot": 452,
            "teacher": "何老师"
        },
        {
            "kc_id": "118646",
            "title": "惊呆小伙伴的全套EXCEL函数技能",
            "img": "http://****/CourseImg/IMG-20150907/20150907142589228922.jpg",
            "info": "面对一大堆零乱的数据一筹莫展？苦恼做着重复低效的工作？想提高工作效率，你学会玩excel函数了吗？本课程为你全方位详解excel函数的实战应用及分析方法，让你面对数据不再头大，轻松变身excel全能大侠。",
            "money": "588",
            "keshi": 21,
            "hot": 448,
            "teacher": "追梦蝶"
        },
        {
            "kc_id": "119493",
            "title": "html+css零基础入门学习",
            "img": "http://****/CourseImg/IMG-20151226/20151226115848924892.jpg",
            "info": "html+css零基础入门学习视频教程从最基本的概念开始讲起,步步深入带领学员学习HTML、CSS样式基础知识，了解各种常用标签的意义以及基本用法等基础知识，通俗易懂简单好学。",
            "money": "1300",
            "keshi": 26,
            "hot": 368,
            "teacher": "削铅笔"
        },
        {
            "kc_id": "119631",
            "title": "CorelDraw CDRX6 视频教程",
            "img": "http://****/CourseImg/IMG-20151230/2015123016230227227.jpg",
            "info": "CorelDraw CDR X6教学视频教程主要讲授了CorelDraw X6 X7的软件下载，安装，注册的全部过程，以及由有许多年平面工作经验和设计艺术培训方面的老师为学员讲解CorelDraw x6的使用方法和使用技巧，讲解细致周到，从基础到精通，适合各类人员学习。",
            "money": "299",
            "keshi": 109,
            "hot": 356,
            "teacher": "何伟"
        },
        {
            "kc_id": "108442",
            "title": "Dreamweaver8",
            "img": "http://****/CourseImg/IMG-20150227/20150227153992149214.jpg",
            "info": "为什么要学习Dreamweaver？互联网时代，人们都是通过网络交流，工作与学习，商品流通很多程度离不开网络，要会应用互联网，必须要学 Dreamweaver。尤其是网商、网店卖家、企业销售人员，企业策划人员，公司高管。我们经常需要发贴，发博文。这些发贴界面通常需要一些网页代码。页面才会更美观，更能打动人。",
            "money": "150",
            "keshi": 20,
            "hot": 350,
            "teacher": "思"
        },
        {
            "kc_id": "109113",
            "title": "Dreamweaver软件基础",
            "img": "http://****/CourseImg/IMG-20150407/20150407140141024102.jpg",
            "info": "  本课程对Dreamweaver软件基础知识进行了详细的讲解。",
            "money": "200",
            "keshi": 41,
            "hot": 317,
            "teacher": "檀老师"
        }
    ]
}

http://****?Action=searchCourse&kc_types=0&keywords=w

30.获取人们搜索词getKeywords	

{Action:searchCourse}
{kc_types:0}

	{
    "MBA",
    "英语四级",
    "英语六级",
    "公务员",
    "C语言",
    "PhotoShop",
    "教师资格证",
    "自考",
    "吉他",
    "会计"
]
http://****?Action=getKeywords&kc_types=0

31.签到toSign


{Action:toSign}
{acode:cb81088dd9932f987ba488a16a737cb9}
{Uid:13323038757}	

	{
    "jifen": "5",
    "jifen_all": "593",
    "days": "1",
    "ewai_jifen": "0"
}
http://****?Action=toSign&acode=cb81088dd9932f987ba488a16a737cb9&Uid=13323038757

32.获取签到状态getSign	


{Action:getSign}
{acode:cb81088dd9932f987ba488a16a737cb9}
{Uid:13323038757}

	{
    "jifen": "5",
    "jifen_all": "593",
    "days": "1",
    "ewai_jifen": "0",
    "qd_date": "2017-6-24 22:29:00"
}	

http://****?Action=getSign&acode=cb81088dd9932f987ba488a16a737cb9&Uid=13323038757


33.获取图书章节信息getBookIndexs	

{Action:getBookIndexs}
{kc_id:108989}

	{
    "kc_id": "108989",
    "kc_name": "《超全的驾驶知识》",
    "index_1": [
        {
            "title_1": "第一篇",
            "zhang_id": 2334,
            "index_2": [
                {
                    "title_2": "一、 城市环路高速时的经验",
                    "b_id": "5311"
                },
                {
                    "title_2": "二、市内行车规范、",
                    "b_id": "5312"
                },
                {
                    "title_2": "三、学会从方向盘上辨故障",
                    "b_id": "5313"
                },
                {
                    "title_2": "四、找准换挡时机",
                    "b_id": "5314"
                }
            ]
        },
        {
            "title_1": "第二篇",
            "zhang_id": 2335,
            "index_2": [
                {
                    "title_2": "一、机动车驾驶人",
                    "b_id": "5315"
                },
                {
                    "title_2": "二、单位和个人",
                    "b_id": "5316"
                },
                {
                    "title_2": "三、非机动车、行人、乘车人",
                    "b_id": "5317"
                },
                {
                    "title_2": "四、高速公路",
                    "b_id": "5318"
                }
            ]
        },
        {
            "title_1": "第三篇",
            "zhang_id": 2336,
            "index_2": [
                {
                    "title_2": "一、六种良好驾驶习惯可节油",
                    "b_id": "5319"
                },
                {
                    "title_2": "二、刹车的踩法",
                    "b_id": "5320"
                },
                {
                    "title_2": "三、山区路段、山路弯道、隧道中",
                    "b_id": "5321"
                },
                {
                    "title_2": "四、赴外地的要点",
                    "b_id": "5322"
                }
            ]
        },
        {
            "title_1": "第四篇",
            "zhang_id": 2337,
            "index_2": [
                {
                    "title_2": "一、大雨路段",
                    "b_id": "5323"
                },
                {
                    "title_2": "二、浓雾路段",
                    "b_id": "5324"
                },
                {
                    "title_2": "三、汽车在行驶中“灭车”怎么办",
                    "b_id": "5325"
                }
            ]
        },
        {
            "title_1": "第五篇",
            "zhang_id": 2338,
            "index_2": [
                {
                    "title_2": "一、行车中如何闪避车前障碍物",
                    "b_id": "5326"
                },
                {
                    "title_2": "二、新手上路开车36计 上",
                    "b_id": "5327"
                },
                {
                    "title_2": "三、新手上路开车36计 下",
                    "b_id": "5328"
                },
                {
                    "title_2": "四、行车过程中容易忽略的十大危险ZT",
                    "b_id": "5329"
                }
            ]
        },
        {
            "title_1": "第六篇",
            "zhang_id": 2339,
            "index_2": [
                {
                    "title_2": "一、平时养车的方方面面",
                    "b_id": "5330"
                },
                {
                    "title_2": "二、行车中的保养",
                    "b_id": "5331"
                },
                {
                    "title_2": "三、平时的日常维护",
                    "b_id": "5332"
                },
                {
                    "title_2": "四、夜晚如何驾驶",
                    "b_id": "5333"
                }
            ]
        },
        {
            "title_1": "第七篇",
            "zhang_id": 2340,
            "index_2": [
                {
                    "title_2": "一、汽车启动三步曲",
                    "b_id": "5334"
                },
                {
                    "title_2": "二、开车注意事项",
                    "b_id": "5335"
                },
                {
                    "title_2": "三、女士开车应注意的问题",
                    "b_id": "5336"
                }
            ]
        }
    ]
}


http://****?Action=getBookIndexs&Kc_id=108989

34.获取读书详细章节内容getBookContent	

	{不能解析：因为没有购买}
	

35.添加书签addbookmark

	{
		没有节id
}
	
36.获取书签列表getBookmarkList


{Action：getBookmarkList}
{Kc_id：108673}	
{acode：cb81088dd9932f987ba488a16a737cb9}
{Uid：13323038757}


	{
    "kc_id": 108673,
    "Bookmark": []
}
http://****?Action=getBookmarkList&Kc_id=108673&acode=cb81088dd9932f987ba488a16a737cb9&Uid=13323038757

37.保存笔记addNotes

	{没有笔记}
	
38.获取用户笔记列表getNoteLists

{Action：getNoteLists}
{kc_id：108989}
{acode：cb81088dd9932f987ba488a16a737cb9}
{Uid：13323038757}

	{
    "kc_id": 108989,
    "noteslist": []
}
http://****?Action=getNoteLists&kc_id=108989&acode=cb81088dd9932f987ba488a16a737cb9&Uid=13323038757	
39.积分学币兑换exchangeMoney	

{Action：exchangeMoney}
{acode：cb81088dd9932f987ba488a16a737cb9}
{Uid：13323038757}
{exchangeType：xuebi}
{money：1}

	{
    "result": "success",
    "jifen": 403,
    "xuebi": 1
}
http://****?Action=exchangeMoney&acode=cb81088dd9932f987ba488a16a737cb9&Uid=13323038757&exchangeType=xuebi&money=1
40.获取某用户写过笔记的课程列表getNotesCourse
	
{Action:getNotesCourse}
{acode:cb81088dd9932f987ba488a16a737cb9}
{Uid:13323038757}
{Kc_types:0}

	{
    "kc_types": 0,
    "courselist": []
}
http://****?Action=getNotesCourse&acode=cb81088dd9932f987ba488a16a737cb9&Uid=13323038757&Kc_types=0

41.删除单条笔记delNote


{Action:delNote}
{acode:cb81088dd9932f987ba488a16a737cb9}
{Uid:13323038757}
{Kc_id:108989}
{nid:1}

	{
    "result": "success"
}

http://****?Action=delNote&acode=cb81088dd9932f987ba488a16a737cb9&Uid=13323038757&Kc_id=108989&nid=1	

42.获取积分日志列表getJifenRecords	

{Action:getJifenRecords}
{acode:cb81088dd9932f987ba488a16a737cb9}
{Uid:13323038757}

	{
    "page_all": 1,
    "page_now": 1,
    "list": [
        {
            "addtime": "2017-6-25 9:20:02",
            "shouzhi": "- ",
            "money": 200,
            "title": "积分兑换学币"
        },
        {
            "addtime": "2017-6-25 9:06:30",
            "shouzhi": "+ ",
            "money": 10,
            "title": "签到赠送积分"
        },
        {
            "addtime": "2017-6-24 22:29:46",
            "shouzhi": "+ ",
            "money": 5,
            "title": "签到赠送积分"
        },
        {
            "addtime": "2017-6-24 10:15:01",
            "shouzhi": "+ ",
            "money": 588,
            "title": "账号注册赠送积分"
        }
    ]
}

http://****?Action=getJifenRecords&acode=cb81088dd9932f987ba488a16a737cb9&Uid=13323038757