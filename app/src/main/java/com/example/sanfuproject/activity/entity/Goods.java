package com.example.sanfuproject.activity.entity;

import java.util.List;

/**
 * Created by Hello on 2016/10/15.
 */

public class Goods {

    /**
     * success : true
     * msg : {"userPoint":0,"goodsPhotolist":[{"b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135163235.jpg","base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135163235.jpg","full_b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135163235.jpg","full_base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135163235.jpg","full_m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135163235.jpg","full_s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135163235.jpg","goods_id":1894757,"id":2021098,"isdefault":1,"m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135163235.jpg","s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135163235.jpg","tiny_img":"http://img.sanfu.com/img/goods/photos/tiny/1610/tiny201610141135163235.jpg"},{"b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135195111.jpg","base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135195111.jpg","full_b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135195111.jpg","full_base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135195111.jpg","full_m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135195111.jpg","full_s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135195111.jpg","goods_id":1894757,"id":2021099,"isdefault":0,"m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135195111.jpg","s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135195111.jpg","tiny_img":"http://img.sanfu.com/img/goods/photos/tiny/1610/tiny201610141135195111.jpg"},{"b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135231123.jpg","base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135231123.jpg","full_b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135231123.jpg","full_base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135231123.jpg","full_m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135231123.jpg","full_s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135231123.jpg","goods_id":1894757,"id":2021100,"isdefault":0,"m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135231123.jpg","s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135231123.jpg","tiny_img":"http://img.sanfu.com/img/goods/photos/tiny/1610/tiny201610141135231123.jpg"},{"b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135269037.jpg","base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135269037.jpg","full_b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135269037.jpg","full_base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135269037.jpg","full_m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135269037.jpg","full_s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135269037.jpg","goods_id":1894757,"id":2021101,"isdefault":0,"m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135269037.jpg","s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135269037.jpg","tiny_img":"http://img.sanfu.com/img/goods/photos/tiny/1610/tiny201610141135269037.jpg"},{"b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135297892.jpg","base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135297892.jpg","full_b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135297892.jpg","full_base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135297892.jpg","full_m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135297892.jpg","full_s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135297892.jpg","goods_id":1894757,"id":2021102,"isdefault":0,"m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135297892.jpg","s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135297892.jpg","tiny_img":"http://img.sanfu.com/img/goods/photos/tiny/1610/tiny201610141135297892.jpg"},{"b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135332068.jpg","base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135332068.jpg","full_b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135332068.jpg","full_base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135332068.jpg","full_m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135332068.jpg","full_s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135332068.jpg","goods_id":1894757,"id":2021103,"isdefault":0,"m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135332068.jpg","s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135332068.jpg","tiny_img":"http://img.sanfu.com/img/goods/photos/tiny/1610/tiny201610141135332068.jpg"}],"commentlist":[],"commentsize":0,"collectSize":0,"choosen":[{"addtime":1476349421,"addtimeStr":"2016-10-13 17:03:41","brand_id":0,"c_img":"","category_id":0,"cats_name":"","class_id":63,"description":"","genre_id":86,"goods_name":"三福2016男冬廓形不可脱羊羔毛帽外套 纯色抽绳大衣","goods_sn":"363034","goods_type":5,"id":1894742,"img_list":[],"is_best":0,"is_disc":0,"is_hot":0,"is_new":0,"isvalid":1,"keywords":"363034,SANFU,男装,上装,流行,外套,锦棉","l_img":"http://img.sanfu.com/img/goods/list/201610141148482397.jpg","m_goods_id":0,"mb_price":339,"model":"YJ-6312羊羔毛里","num":0,"number":0,"pattern":"","pf_price":339,"s_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141146589494.jpg","sc_price":339,"search_words":"三福2016男冬廓形不可脱羊羔毛帽外套 纯色抽绳大衣,363034,SANFU,男装,上装,流行,外套,锦棉,,男装,外套,大衣/风衣每周上新,男士新品,男上新,363034,冬,校园文艺,锦棉,外套,流行,暂无,黑色,S,M,L,XXXXL,XXL,XXXL,XL","season":"","shelf_time":1476437610,"shelf_timeStr":"2016-10-14 17:33:30","smallpic":"","sort_id":75,"start_time":1476349421,"start_timeStr":"2016-10-13 17:03:41"},{"addtime":1476349381,"addtimeStr":"2016-10-13 17:03:01","brand_id":0,"c_img":"","category_id":0,"cats_name":"","class_id":63,"description":"","genre_id":86,"goods_name":"三福2016男秋满版漆点字母印花风衣 短款棒球外套","goods_sn":"362986","goods_type":5,"id":1894715,"img_list":[],"is_best":0,"is_disc":0,"is_hot":0,"is_new":0,"isvalid":1,"keywords":"362986,SANFU,男装,上装,时尚,外套,化纤","l_img":"http://img.sanfu.com/img/goods/list/201610141121177347.jpg","m_goods_id":0,"mb_price":259,"model":"DND-6519满版漆点代","num":0,"number":0,"pattern":"","pf_price":259,"s_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141117459389.jpg","sc_price":259,"search_words":"三福2016男秋满版漆点字母印花风衣 短款棒球外套,362986,SANFU,男装,上装,时尚,外套,化纤,,男装,外套,大衣/风衣每周上新,男士新品,男上新,362986,秋,街头时尚,化纤,外套,时尚,暂无,黑色,象牙白,S,M,L,XL,XXL,XXXL,XXXXL","season":"","shelf_time":1476437610,"shelf_timeStr":"2016-10-14 17:33:30","smallpic":"","sort_id":75,"start_time":1476349381,"start_timeStr":"2016-10-13 17:03:01"},{"addtime":1475205592,"addtimeStr":"2016-09-30 11:19:52","brand_id":0,"c_img":"","category_id":0,"cats_name":"","class_id":63,"description":"","genre_id":86,"goods_name":"三福2016男冬净色连帽贴标外套 韩版休闲百搭风衣","goods_sn":"362817","goods_type":5,"id":1774782,"img_list":[],"is_best":0,"is_disc":0,"is_hot":0,"is_new":0,"isvalid":1,"keywords":"362817,SATTACHERA,男装,上装,经典,外套,棉","l_img":"http://img.sanfu.com/img/goods/list/201609301125545024.jpg","m_goods_id":0,"mb_price":339,"model":"SYC-SMW163236贴标","num":2,"number":2,"pattern":"","pf_price":339,"s_img":"http://img.sanfu.com/img/goods/photos/middle/1609/middle201609301124052116.jpg","sc_price":339,"search_words":"三福2016男冬净色连帽贴标外套 韩版休闲百搭风衣,362817,SATTACHERA,男装,上装,经典,外套,棉,,男装,外套,大衣/风衣每周上新,男士新品,男上新,362817,冬,都市生活,棉,外套,经典,暂无,黑色,灰色,S,XL,XXXXL,XXXL,XXL,M,L","season":"","shelf_time":1475918855,"shelf_timeStr":"2016-10-08 17:27:35","smallpic":"","sort_id":75,"start_time":1475205592,"start_timeStr":"2016-09-30 11:19:52"},{"addtime":1476256939,"addtimeStr":"2016-10-12 15:22:19","brand_id":0,"c_img":"","category_id":0,"cats_name":"","class_id":63,"description":"","genre_id":86,"goods_name":"三福2016男冬明线牛仔外套 连帽抽绳中长款大衣","goods_sn":"362979","goods_type":1,"id":1874727,"img_list":[],"is_best":0,"is_disc":0,"is_hot":0,"is_new":0,"isvalid":1,"keywords":"362979,SANFU,男装,上装,流行,外套,牛仔","l_img":"http://img.sanfu.com/img/goods/list/201610121525231433.jpg","m_goods_id":0,"mb_price":379,"model":"YJ-W6297#牛仔明线","num":0,"number":0,"pattern":"","pf_price":379,"s_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610121523147642.jpg","sc_price":379,"search_words":"三福2016男冬明线牛仔外套 连帽抽绳中长款大衣,362979,SANFU,男装,上装,流行,外套,牛仔,,男装,外套,大衣/风衣每周上新,男士新品,本周上新,9月30日新品,男上新,362979,冬,校园文艺,牛仔,外套,流行,暂无,宝蓝,S,M,L,XXXXL,XXL,XXXL,XL","season":"","shelf_time":1476328941,"shelf_timeStr":"2016-10-13 11:22:21","smallpic":"","sort_id":75,"start_time":1476256939,"start_timeStr":"2016-10-12 15:22:19"},{"addtime":1475129161,"addtimeStr":"2016-09-29 14:06:01","brand_id":0,"c_img":"","category_id":0,"cats_name":"","class_id":63,"description":"","genre_id":86,"goods_name":"三福2016男冬后背英文印花外套 纯色连帽双口袋风衣","goods_sn":"362863","goods_type":5,"id":1774717,"img_list":[],"is_best":0,"is_disc":0,"is_hot":0,"is_new":0,"isvalid":1,"keywords":"362863,SANFU,男装,上装,流行,外套,棉麻","l_img":"http://img.sanfu.com/img/goods/list/201609301151066057.jpg","m_goods_id":0,"mb_price":279,"model":"TZ-9050洗水棉","num":2,"number":2,"pattern":"","pf_price":279,"s_img":"http://img.sanfu.com/img/goods/photos/middle/1609/middle201609301148388577.jpg","sc_price":279,"search_words":"三福2016男冬后背英文印花外套 纯色连帽双口袋风衣,362863,SANFU,男装,上装,流行,外套,棉麻,,男装,外套,大衣/风衣每周上新,男士新品,本周上新,8月30日新品,男上新,362863,冬,校园文艺,棉麻,外套,流行,暂无,黑色,绿色,灰色,XXXL,XXL,XL,L,M,S,XXXXL","season":"","shelf_time":1475207601,"shelf_timeStr":"2016-09-30 11:53:21","smallpic":"","sort_id":75,"start_time":1475129161,"start_timeStr":"2016-09-29 14:06:01"},{"addtime":1474531818,"addtimeStr":"2016-09-22 16:10:18","brand_id":0,"c_img":"","category_id":0,"cats_name":"","class_id":63,"description":"","genre_id":86,"goods_name":"三福2016男冬纯色翻领外套 韩版修身英伦呢大衣","goods_sn":"363370","goods_type":5,"id":1614771,"img_list":[],"is_best":0,"is_disc":0,"is_hot":0,"is_new":0,"isvalid":1,"keywords":"363370,SATTACHERA,男装,上装,经典,外套,羊毛","l_img":"http://img.sanfu.com/img/goods/list/201609240935457535.jpg","m_goods_id":0,"mb_price":369,"model":"RCTX-R-8806长款","num":8,"number":8,"pattern":"","pf_price":369,"s_img":"http://img.sanfu.com/img/goods/photos/middle/1609/middle201609240933110566.jpg","sc_price":369,"search_words":"三福2016男冬纯色翻领外套 韩版修身英伦呢大衣,363370,SATTACHERA,男装,上装,经典,外套,羊毛,,男装,外套,大衣/风衣每周上新,男士新品,本周上新,9月23日新品,男上新,363370,冬,都市生活,羊毛,外套,经典,暂无,藏青,灰色,S,M,L,XL,XXL,XXXL,XXXXL","season":"","shelf_time":1474872432,"shelf_timeStr":"2016-09-26 14:47:12","smallpic":"","sort_id":75,"start_time":1474531818,"start_timeStr":"2016-09-22 16:10:18"},{"addtime":1475140268,"addtimeStr":"2016-09-29 17:11:08","brand_id":0,"c_img":"","category_id":0,"cats_name":"","class_id":63,"description":"","genre_id":86,"goods_name":"三福2016男冬迷彩棒球领外套 侧边隐形插带中长款大衣","goods_sn":"754862","goods_type":5,"id":1774775,"img_list":[],"is_best":0,"is_disc":0,"is_hot":0,"is_new":0,"isvalid":1,"keywords":"754862,SANFU,男装,上装,时尚,外套,化纤","l_img":"http://img.sanfu.com/img/goods/list/201609291713425537.jpg","m_goods_id":0,"mb_price":299,"model":"DD-1261迷彩棒球领","num":0,"number":0,"pattern":"","pf_price":299,"s_img":"http://img.sanfu.com/img/goods/photos/middle/1609/middle201609291711521574.jpg","sc_price":299,"search_words":"三福2016男冬迷彩棒球领外套 侧边隐形插带中长款大衣,754862,SANFU,男装,上装,时尚,外套,化纤,,男装,外套,大衣/风衣每周上新,男士新品,男上新,754862,冬,街头时尚,化纤,外套,时尚,暂无,军绿,M,XXL,S,XXXL,XXXXL,L,XL","season":"","shelf_time":1475918785,"shelf_timeStr":"2016-10-08 17:26:25","smallpic":"","sort_id":75,"start_time":1475140268,"start_timeStr":"2016-09-29 17:11:08"},{"addtime":1476349400,"addtimeStr":"2016-10-13 17:03:20","brand_id":0,"c_img":"","category_id":0,"cats_name":"","class_id":63,"description":"","genre_id":86,"goods_name":"三福2016男冬纯色衣袖贴标外套 口袋拉链连帽大衣","goods_sn":"363033","goods_type":5,"id":1894726,"img_list":[],"is_best":0,"is_disc":0,"is_hot":0,"is_new":0,"isvalid":1,"keywords":"363033,SANFU,男装,上装,流行,外套,涤纶","l_img":"http://img.sanfu.com/img/goods/list/201610141132028441.jpg","m_goods_id":0,"mb_price":369,"model":"TZ-F-8228袖标","num":0,"number":0,"pattern":"","pf_price":369,"s_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141130134553.jpg","sc_price":369,"search_words":"三福2016男冬纯色衣袖贴标外套 口袋拉链连帽大衣,363033,SANFU,男装,上装,流行,外套,涤纶,,男装,外套,大衣/风衣每周上新,男士新品,男上新,363033,冬,校园文艺,涤纶,外套,流行,暂无,黑色,军绿,S,M,L,XL,XXL,XXXL,XXXXL","season":"","shelf_time":1476437610,"shelf_timeStr":"2016-10-14 17:33:30","smallpic":"","sort_id":75,"start_time":1476349400,"start_timeStr":"2016-10-13 17:03:20"},{"addtime":1476349436,"addtimeStr":"2016-10-13 17:03:56","brand_id":0,"c_img":"","category_id":0,"cats_name":"","class_id":63,"description":"","genre_id":86,"goods_name":"三福2016男冬棒球领中长款外套 抽绳拉链简约风衣","goods_sn":"362826","goods_type":5,"id":1894758,"img_list":[],"is_best":0,"is_disc":0,"is_hot":0,"is_new":0,"isvalid":1,"keywords":"362826,SATTACHERA,男装,上装,经典,外套,棉","l_img":"http://img.sanfu.com/img/goods/list/201610141139095131.jpg","m_goods_id":0,"mb_price":339,"model":"KD-AK826519拉链","num":0,"number":0,"pattern":"","pf_price":339,"s_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141136259010.jpg","sc_price":339,"search_words":"三福2016男冬棒球领中长款外套 抽绳拉链简约风衣,362826,SATTACHERA,男装,上装,经典,外套,棉,,男装,外套,大衣/风衣每周上新,男士新品,10月14日新品,男上新,362826,冬,都市生活,棉,外套,经典,暂无,黑色,灰色,S,M,L,XL,XXL,XXXL,XXXXL","season":"","shelf_time":1476437610,"shelf_timeStr":"2016-10-14 17:33:30","smallpic":"","sort_id":75,"start_time":1476349436,"start_timeStr":"2016-10-13 17:03:56"},{"addtime":1475219940,"addtimeStr":"2016-09-30 15:19:00","brand_id":0,"c_img":"","category_id":0,"cats_name":"","class_id":63,"description":"","genre_id":86,"goods_name":"三福2016男冬撞色字母拉链外套 连帽中长款大衣","goods_sn":"363005","goods_type":5,"id":1794706,"img_list":[],"is_best":0,"is_disc":0,"is_hot":0,"is_new":0,"isvalid":1,"keywords":"363005,SANFU,男装,上装,流行,外套,化纤","l_img":"http://img.sanfu.com/img/goods/list/201609301522565295.jpg","m_goods_id":0,"mb_price":439,"model":"WY-F6990字母拉链","num":0,"number":0,"pattern":"","pf_price":439,"s_img":"http://img.sanfu.com/img/goods/photos/middle/1609/middle201609301519443021.jpg","sc_price":439,"search_words":"三福2016男冬撞色字母拉链外套 连帽中长款大衣,363005,SANFU,男装,上装,流行,外套,化纤,,男装,外套,大衣/风衣每周上新,男士新品,本周上新,9月30日新品,男上新,363005,冬,校园文艺,化纤,外套,流行,暂无,黑色,灰色,S,M,L,XL,XXL,XXXL,XXXXL","season":"","shelf_time":1476155381,"shelf_timeStr":"2016-10-11 11:09:41","smallpic":"","sort_id":75,"start_time":1475219940,"start_timeStr":"2016-09-30 15:19:00"},{"addtime":1475129162,"addtimeStr":"2016-09-29 14:06:02","brand_id":0,"c_img":"","category_id":0,"cats_name":"","class_id":63,"description":"","genre_id":86,"goods_name":"三福2016男冬拼接毛织袖薄外套 小立领贴章外衣","goods_sn":"362922","goods_type":5,"id":1774723,"img_list":[],"is_best":0,"is_disc":0,"is_hot":0,"is_new":0,"isvalid":1,"keywords":"362922,SANFU,男装,上装,流行,外套,棉","l_img":"http://img.sanfu.com/img/goods/list/201610081646027832.jpg","m_goods_id":0,"mb_price":239,"model":"CC-8561薄棉拼接代","num":0,"number":0,"pattern":"","pf_price":239,"s_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610081642321329.jpg","sc_price":239,"search_words":"三福2016男冬拼接毛织袖薄外套 小立领贴章外衣,362922,SANFU,男装,上装,流行,外套,棉,,男装,外套,大衣/风衣每周上新,男士新品,本周上新,9月30日新品,男上新,362922,冬,校园文艺,棉,外套,流行,暂无,黑色,灰色,S,M,L,XL,XXL,XXXL,XXXXL","season":"","shelf_time":1475916398,"shelf_timeStr":"2016-10-08 16:46:38","smallpic":"","sort_id":75,"start_time":1475129162,"start_timeStr":"2016-09-29 14:06:02"},{"addtime":1476349381,"addtimeStr":"2016-10-13 17:03:01","brand_id":0,"c_img":"","category_id":0,"cats_name":"","class_id":63,"description":"","genre_id":86,"goods_name":"三福2016男秋后背拼接印花棒球外套 纯色短款休闲风衣","goods_sn":"363001","goods_type":5,"id":1894717,"img_list":[],"is_best":0,"is_disc":0,"is_hot":0,"is_new":0,"isvalid":1,"keywords":"363001,SANFU,男装,上装,时尚,外套,化纤","l_img":"http://img.sanfu.com/img/goods/list/201610141123278914.jpg","m_goods_id":0,"mb_price":299,"model":"DND-8538后背印花代","num":0,"number":0,"pattern":"","pf_price":299,"s_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141121532382.jpg","sc_price":299,"search_words":"三福2016男秋后背拼接印花棒球外套 纯色短款休闲风衣,363001,SANFU,男装,上装,时尚,外套,化纤,,男装,外套,大衣/风衣每周上新,男士新品,男上新,363001,秋,街头时尚,化纤,外套,时尚,暂无,黑色,暗灰,S,M,L,XL,XXL,XXXL,XXXXL","season":"","shelf_time":1476437610,"shelf_timeStr":"2016-10-14 17:33:30","smallpic":"","sort_id":75,"start_time":1476349381,"start_timeStr":"2016-10-13 17:03:01"},{"addtime":1474679075,"addtimeStr":"2016-09-24 09:04:35","brand_id":0,"c_img":"","category_id":0,"cats_name":"","class_id":63,"description":"","genre_id":86,"goods_name":"三福2016男冬纯色翻领外套 韩版中长款百搭呢大衣","goods_sn":"362821","goods_type":5,"id":1654705,"img_list":[],"is_best":0,"is_disc":0,"is_hot":0,"is_new":0,"isvalid":1,"keywords":"362821,SATTACHERA,男装,上装,经典,外套,毛呢","l_img":"http://img.sanfu.com/img/goods/list/201609240907311693.jpg","m_goods_id":0,"mb_price":499,"model":"KLN-K7703针织呢","num":1,"number":1,"pattern":"","pf_price":499,"s_img":"http://img.sanfu.com/img/goods/photos/middle/1609/middle201609240905305788.jpg","sc_price":499,"search_words":"三福2016男冬纯色翻领外套 韩版中长款百搭呢大衣,362821,SATTACHERA,男装,上装,经典,外套,毛呢,,男装,外套,大衣/风衣每周上新,男士新品,本周上新,9月23日新品,男上新,都会外套,都会所有商品,362821,冬,都市生活,毛呢,外套,经典,暂无,深蓝,S,XL,XXXXL,XXXL,XXL,L,M","season":"","shelf_time":1475026285,"shelf_timeStr":"2016-09-28 09:31:25","smallpic":"","sort_id":75,"start_time":1474679075,"start_timeStr":"2016-09-24 09:04:35"},{"addtime":1475893618,"addtimeStr":"2016-10-08 10:26:58","brand_id":0,"c_img":"","category_id":0,"cats_name":"","class_id":63,"description":"","genre_id":86,"goods_name":"三福2016男冬纯色翻领字母印花外套 韩版廓形大衣","goods_sn":"362819","goods_type":5,"id":1814706,"img_list":[],"is_best":0,"is_disc":0,"is_hot":0,"is_new":0,"isvalid":1,"keywords":"362819,SATTACHERA,男装,上装,经典,外套,毛呢","l_img":"http://img.sanfu.com/img/goods/list/201610081032554088.jpg","m_goods_id":0,"mb_price":499,"model":"SYC-SMW163178印字","num":1,"number":1,"pattern":"","pf_price":499,"s_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610081027584796.jpg","sc_price":499,"search_words":"三福2016男冬纯色翻领字母印花外套 韩版廓形大衣,362819,SATTACHERA,男装,上装,经典,外套,毛呢,,男装,外套,大衣/风衣每周上新,男士新品,本周上新,9月23日新品,男上新,362819,冬,都市生活,毛呢,外套,经典,暂无,黑色,灰色,XL,S,XXXL,L,XXL,M,XXXXL","season":"","shelf_time":1475894037,"shelf_timeStr":"2016-10-08 10:33:57","smallpic":"","sort_id":75,"start_time":1475893618,"start_timeStr":"2016-10-08 10:26:58"},{"addtime":1472719498,"addtimeStr":"2016-09-01 16:44:58","brand_id":0,"c_img":"","category_id":0,"cats_name":"","class_id":63,"description":"","genre_id":86,"goods_name":"三福2016男秋胸前撞色字母印花连帽外套 中长款大衣","goods_sn":"361819","goods_type":5,"id":1374788,"img_list":[],"is_best":0,"is_disc":0,"is_hot":0,"is_new":0,"isvalid":1,"keywords":"361819,SANFU,男装,上装,流行,外套,棉料","l_img":"http://img.sanfu.com/img/goods/list/201609021353291718.jpg","m_goods_id":0,"mb_price":259,"model":"FSK-WT6901胸前字母","num":0,"number":0,"pattern":"","pf_price":259,"s_img":"http://img.sanfu.com/img/goods/photos/middle/1609/middle201609261038493054.jpg","sc_price":259,"search_words":"三福2016男秋胸前撞色字母印花连帽外套 中长款大衣,361819,SANFU,男装,上装,流行,外套,棉料,,男装,外套,大衣/风衣每周上新,男士新品,本周上新,2016年秋装男女新品,男上新,361819,秋,校园文艺,棉料,外套,流行,暂无,黑色,绿色,XXXL,XXL,XL,L,M,S,XXXXL","season":"","shelf_time":1474857784,"shelf_timeStr":"2016-09-26 10:43:04","smallpic":"","sort_id":75,"start_time":1472719498,"start_timeStr":"2016-09-01 16:44:58"}],"promolist":[{"add_time":"2016-10-10 10:06:46","amount":129,"amountStr":"129元","cid":0,"cid_name":"","coupon_id":"","coupon_name":"","etime":"2018-03-28 00:00:00","goods_sn":"","id":3,"in_use":1,"memo":"","modeStr":"","modes":1,"money":0,"moneyStr":"0福币","name":"实付满129元包邮","order_num":0,"point":0,"pointStr":"0积分","sale":0,"saleStr":"免邮","shop":"1","shopStr":"全部","status":0,"stime":"2015-06-02 00:00:00","type":1,"typeStr":"元","url":"","way":3,"wayStr":"包邮"},{"add_time":"2016-04-01 16:10:52","amount":0,"amountStr":"0元","cid":0,"cid_name":"","coupon_id":"","coupon_name":"","etime":"2017-12-31 23:59:07","goods_sn":"","id":211,"in_use":1,"memo":"","modeStr":"","modes":1,"money":0,"moneyStr":"0福币","name":"首次购买第一件9折","order_num":1,"point":0,"pointStr":"0积分","sale":90,"saleStr":"9折","shop":"1","shopStr":"全部","status":0,"stime":"2016-03-29 23:59:07","type":1,"typeStr":"元","url":"","way":2,"wayStr":"折扣"}],"goodsProps":{"brand":"SATTACHERA","category":"男装","colors":"","firstsubtype":"","givelevel":"","goods_id":1894757,"goods_sn":362823,"goodssubtype":"","goostyle":"经典","id":1810279,"lengthlevel":"","lifedays":90,"material":"毛呢","modeltype":"","netcollection":"都市生活","pattern":"外套","planshelfdate":"","remark":"","season":"冬","sizes":"","softlevel":"","specs":"SYC-SMW163183织带","thinlevel":"","tips":"","washSTD":"","weartype":"上装"},"goods":{"addtime":1476349436,"addtimeStr":"2016-10-13 17:03:56","brand_id":0,"c_img":"","category_id":0,"cats_name":"","class_id":63,"description":"","genre_id":86,"goods_name":"三福2016男冬翻盖口袋连帽大衣 中长款腰部抽绳外套","goods_sn":"362823","goods_type":5,"id":1894757,"img_list":[],"is_best":0,"is_disc":0,"is_hot":0,"is_new":0,"isvalid":1,"keywords":"362823,SATTACHERA,男装,上装,经典,外套,毛呢","l_img":"http://img.sanfu.com/img/goods/list/201610141137421035.jpg","m_goods_id":0,"mb_price":499,"model":"SYC-SMW163183织带","num":0,"number":0,"pattern":"","pf_price":499,"s_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135163235.jpg","sc_price":499,"search_words":"三福2016男冬翻盖口袋连帽大衣 中长款腰部抽绳外套,362823,SATTACHERA,男装,上装,经典,外套,毛呢,,男装,外套,大衣/风衣每周上新,男士新品,男上新,362823,冬,都市生活,毛呢,外套,经典,暂无,黑色,灰色,S,M,L,XL,XXL,XXXL,XXXXL","season":"","shelf_time":1476437610,"shelf_timeStr":"2016-10-14 17:33:30","smallpic":"","sort_id":75,"start_time":1476349436,"start_timeStr":"2016-10-13 17:03:56"},"goodsSpeci":[{"barcode":"36282301","class_id":0,"color_id":0,"color_name":"黑色","flag":"","genre_id":0,"goodsPhoto":{"b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135163235.jpg","base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135163235.jpg","full_b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135163235.jpg","full_base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135163235.jpg","full_m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135163235.jpg","full_s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135163235.jpg","goods_id":1894757,"id":2021098,"isdefault":1,"m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135163235.jpg","s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135163235.jpg","tiny_img":"http://img.sanfu.com/img/goods/photos/tiny/1610/tiny201610141135163235.jpg"},"goods_id":1894757,"goods_name":"","goods_sn":362823,"id":2033524,"isvalid":0,"num":5,"number":5,"photo_id":2021098,"size_id":12,"size_name":"S","sort_id":0,"stock":null},{"barcode":"36282302","class_id":0,"color_id":0,"color_name":"黑色","flag":"","genre_id":0,"goodsPhoto":{"b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135163235.jpg","base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135163235.jpg","full_b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135163235.jpg","full_base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135163235.jpg","full_m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135163235.jpg","full_s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135163235.jpg","goods_id":1894757,"id":2021098,"isdefault":1,"m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135163235.jpg","s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135163235.jpg","tiny_img":"http://img.sanfu.com/img/goods/photos/tiny/1610/tiny201610141135163235.jpg"},"goods_id":1894757,"goods_name":"","goods_sn":362823,"id":2033525,"isvalid":0,"num":91,"number":91,"photo_id":2021098,"size_id":9,"size_name":"M","sort_id":0,"stock":null},{"barcode":"36282303","class_id":0,"color_id":0,"color_name":"黑色","flag":"","genre_id":0,"goodsPhoto":{"b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135163235.jpg","base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135163235.jpg","full_b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135163235.jpg","full_base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135163235.jpg","full_m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135163235.jpg","full_s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135163235.jpg","goods_id":1894757,"id":2021098,"isdefault":1,"m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135163235.jpg","s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135163235.jpg","tiny_img":"http://img.sanfu.com/img/goods/photos/tiny/1610/tiny201610141135163235.jpg"},"goods_id":1894757,"goods_name":"","goods_sn":362823,"id":2033526,"isvalid":0,"num":123,"number":123,"photo_id":2021098,"size_id":11,"size_name":"L","sort_id":0,"stock":null},{"barcode":"36282304","class_id":0,"color_id":0,"color_name":"黑色","flag":"","genre_id":0,"goodsPhoto":{"b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135163235.jpg","base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135163235.jpg","full_b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135163235.jpg","full_base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135163235.jpg","full_m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135163235.jpg","full_s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135163235.jpg","goods_id":1894757,"id":2021098,"isdefault":1,"m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135163235.jpg","s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135163235.jpg","tiny_img":"http://img.sanfu.com/img/goods/photos/tiny/1610/tiny201610141135163235.jpg"},"goods_id":1894757,"goods_name":"","goods_sn":362823,"id":2033527,"isvalid":0,"num":80,"number":80,"photo_id":2021098,"size_id":10,"size_name":"XL","sort_id":0,"stock":null},{"barcode":"36282305","class_id":0,"color_id":0,"color_name":"黑色","flag":"","genre_id":0,"goodsPhoto":{"b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135163235.jpg","base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135163235.jpg","full_b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135163235.jpg","full_base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135163235.jpg","full_m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135163235.jpg","full_s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135163235.jpg","goods_id":1894757,"id":2021098,"isdefault":1,"m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135163235.jpg","s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135163235.jpg","tiny_img":"http://img.sanfu.com/img/goods/photos/tiny/1610/tiny201610141135163235.jpg"},"goods_id":1894757,"goods_name":"","goods_sn":362823,"id":2033528,"isvalid":0,"num":14,"number":14,"photo_id":2021098,"size_id":8,"size_name":"XXL","sort_id":0,"stock":null}]}
     * key : dmdhcrtcjkvhabq
     * sign : 363620B27EB56FFF2D6AF8E3A218F1C2
     * length : 27560
     */

    private boolean success;
    /**
     * userPoint : 0
     * goodsPhotolist : [{"b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135163235.jpg","base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135163235.jpg","full_b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135163235.jpg","full_base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135163235.jpg","full_m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135163235.jpg","full_s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135163235.jpg","goods_id":1894757,"id":2021098,"isdefault":1,"m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135163235.jpg","s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135163235.jpg","tiny_img":"http://img.sanfu.com/img/goods/photos/tiny/1610/tiny201610141135163235.jpg"},{"b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135195111.jpg","base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135195111.jpg","full_b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135195111.jpg","full_base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135195111.jpg","full_m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135195111.jpg","full_s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135195111.jpg","goods_id":1894757,"id":2021099,"isdefault":0,"m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135195111.jpg","s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135195111.jpg","tiny_img":"http://img.sanfu.com/img/goods/photos/tiny/1610/tiny201610141135195111.jpg"},{"b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135231123.jpg","base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135231123.jpg","full_b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135231123.jpg","full_base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135231123.jpg","full_m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135231123.jpg","full_s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135231123.jpg","goods_id":1894757,"id":2021100,"isdefault":0,"m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135231123.jpg","s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135231123.jpg","tiny_img":"http://img.sanfu.com/img/goods/photos/tiny/1610/tiny201610141135231123.jpg"},{"b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135269037.jpg","base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135269037.jpg","full_b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135269037.jpg","full_base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135269037.jpg","full_m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135269037.jpg","full_s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135269037.jpg","goods_id":1894757,"id":2021101,"isdefault":0,"m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135269037.jpg","s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135269037.jpg","tiny_img":"http://img.sanfu.com/img/goods/photos/tiny/1610/tiny201610141135269037.jpg"},{"b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135297892.jpg","base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135297892.jpg","full_b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135297892.jpg","full_base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135297892.jpg","full_m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135297892.jpg","full_s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135297892.jpg","goods_id":1894757,"id":2021102,"isdefault":0,"m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135297892.jpg","s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135297892.jpg","tiny_img":"http://img.sanfu.com/img/goods/photos/tiny/1610/tiny201610141135297892.jpg"},{"b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135332068.jpg","base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135332068.jpg","full_b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135332068.jpg","full_base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135332068.jpg","full_m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135332068.jpg","full_s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135332068.jpg","goods_id":1894757,"id":2021103,"isdefault":0,"m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135332068.jpg","s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135332068.jpg","tiny_img":"http://img.sanfu.com/img/goods/photos/tiny/1610/tiny201610141135332068.jpg"}]
     * commentlist : []
     * commentsize : 0
     * collectSize : 0
     * choosen : [{"addtime":1476349421,"addtimeStr":"2016-10-13 17:03:41","brand_id":0,"c_img":"","category_id":0,"cats_name":"","class_id":63,"description":"","genre_id":86,"goods_name":"三福2016男冬廓形不可脱羊羔毛帽外套 纯色抽绳大衣","goods_sn":"363034","goods_type":5,"id":1894742,"img_list":[],"is_best":0,"is_disc":0,"is_hot":0,"is_new":0,"isvalid":1,"keywords":"363034,SANFU,男装,上装,流行,外套,锦棉","l_img":"http://img.sanfu.com/img/goods/list/201610141148482397.jpg","m_goods_id":0,"mb_price":339,"model":"YJ-6312羊羔毛里","num":0,"number":0,"pattern":"","pf_price":339,"s_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141146589494.jpg","sc_price":339,"search_words":"三福2016男冬廓形不可脱羊羔毛帽外套 纯色抽绳大衣,363034,SANFU,男装,上装,流行,外套,锦棉,,男装,外套,大衣/风衣每周上新,男士新品,男上新,363034,冬,校园文艺,锦棉,外套,流行,暂无,黑色,S,M,L,XXXXL,XXL,XXXL,XL","season":"","shelf_time":1476437610,"shelf_timeStr":"2016-10-14 17:33:30","smallpic":"","sort_id":75,"start_time":1476349421,"start_timeStr":"2016-10-13 17:03:41"},{"addtime":1476349381,"addtimeStr":"2016-10-13 17:03:01","brand_id":0,"c_img":"","category_id":0,"cats_name":"","class_id":63,"description":"","genre_id":86,"goods_name":"三福2016男秋满版漆点字母印花风衣 短款棒球外套","goods_sn":"362986","goods_type":5,"id":1894715,"img_list":[],"is_best":0,"is_disc":0,"is_hot":0,"is_new":0,"isvalid":1,"keywords":"362986,SANFU,男装,上装,时尚,外套,化纤","l_img":"http://img.sanfu.com/img/goods/list/201610141121177347.jpg","m_goods_id":0,"mb_price":259,"model":"DND-6519满版漆点代","num":0,"number":0,"pattern":"","pf_price":259,"s_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141117459389.jpg","sc_price":259,"search_words":"三福2016男秋满版漆点字母印花风衣 短款棒球外套,362986,SANFU,男装,上装,时尚,外套,化纤,,男装,外套,大衣/风衣每周上新,男士新品,男上新,362986,秋,街头时尚,化纤,外套,时尚,暂无,黑色,象牙白,S,M,L,XL,XXL,XXXL,XXXXL","season":"","shelf_time":1476437610,"shelf_timeStr":"2016-10-14 17:33:30","smallpic":"","sort_id":75,"start_time":1476349381,"start_timeStr":"2016-10-13 17:03:01"},{"addtime":1475205592,"addtimeStr":"2016-09-30 11:19:52","brand_id":0,"c_img":"","category_id":0,"cats_name":"","class_id":63,"description":"","genre_id":86,"goods_name":"三福2016男冬净色连帽贴标外套 韩版休闲百搭风衣","goods_sn":"362817","goods_type":5,"id":1774782,"img_list":[],"is_best":0,"is_disc":0,"is_hot":0,"is_new":0,"isvalid":1,"keywords":"362817,SATTACHERA,男装,上装,经典,外套,棉","l_img":"http://img.sanfu.com/img/goods/list/201609301125545024.jpg","m_goods_id":0,"mb_price":339,"model":"SYC-SMW163236贴标","num":2,"number":2,"pattern":"","pf_price":339,"s_img":"http://img.sanfu.com/img/goods/photos/middle/1609/middle201609301124052116.jpg","sc_price":339,"search_words":"三福2016男冬净色连帽贴标外套 韩版休闲百搭风衣,362817,SATTACHERA,男装,上装,经典,外套,棉,,男装,外套,大衣/风衣每周上新,男士新品,男上新,362817,冬,都市生活,棉,外套,经典,暂无,黑色,灰色,S,XL,XXXXL,XXXL,XXL,M,L","season":"","shelf_time":1475918855,"shelf_timeStr":"2016-10-08 17:27:35","smallpic":"","sort_id":75,"start_time":1475205592,"start_timeStr":"2016-09-30 11:19:52"},{"addtime":1476256939,"addtimeStr":"2016-10-12 15:22:19","brand_id":0,"c_img":"","category_id":0,"cats_name":"","class_id":63,"description":"","genre_id":86,"goods_name":"三福2016男冬明线牛仔外套 连帽抽绳中长款大衣","goods_sn":"362979","goods_type":1,"id":1874727,"img_list":[],"is_best":0,"is_disc":0,"is_hot":0,"is_new":0,"isvalid":1,"keywords":"362979,SANFU,男装,上装,流行,外套,牛仔","l_img":"http://img.sanfu.com/img/goods/list/201610121525231433.jpg","m_goods_id":0,"mb_price":379,"model":"YJ-W6297#牛仔明线","num":0,"number":0,"pattern":"","pf_price":379,"s_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610121523147642.jpg","sc_price":379,"search_words":"三福2016男冬明线牛仔外套 连帽抽绳中长款大衣,362979,SANFU,男装,上装,流行,外套,牛仔,,男装,外套,大衣/风衣每周上新,男士新品,本周上新,9月30日新品,男上新,362979,冬,校园文艺,牛仔,外套,流行,暂无,宝蓝,S,M,L,XXXXL,XXL,XXXL,XL","season":"","shelf_time":1476328941,"shelf_timeStr":"2016-10-13 11:22:21","smallpic":"","sort_id":75,"start_time":1476256939,"start_timeStr":"2016-10-12 15:22:19"},{"addtime":1475129161,"addtimeStr":"2016-09-29 14:06:01","brand_id":0,"c_img":"","category_id":0,"cats_name":"","class_id":63,"description":"","genre_id":86,"goods_name":"三福2016男冬后背英文印花外套 纯色连帽双口袋风衣","goods_sn":"362863","goods_type":5,"id":1774717,"img_list":[],"is_best":0,"is_disc":0,"is_hot":0,"is_new":0,"isvalid":1,"keywords":"362863,SANFU,男装,上装,流行,外套,棉麻","l_img":"http://img.sanfu.com/img/goods/list/201609301151066057.jpg","m_goods_id":0,"mb_price":279,"model":"TZ-9050洗水棉","num":2,"number":2,"pattern":"","pf_price":279,"s_img":"http://img.sanfu.com/img/goods/photos/middle/1609/middle201609301148388577.jpg","sc_price":279,"search_words":"三福2016男冬后背英文印花外套 纯色连帽双口袋风衣,362863,SANFU,男装,上装,流行,外套,棉麻,,男装,外套,大衣/风衣每周上新,男士新品,本周上新,8月30日新品,男上新,362863,冬,校园文艺,棉麻,外套,流行,暂无,黑色,绿色,灰色,XXXL,XXL,XL,L,M,S,XXXXL","season":"","shelf_time":1475207601,"shelf_timeStr":"2016-09-30 11:53:21","smallpic":"","sort_id":75,"start_time":1475129161,"start_timeStr":"2016-09-29 14:06:01"},{"addtime":1474531818,"addtimeStr":"2016-09-22 16:10:18","brand_id":0,"c_img":"","category_id":0,"cats_name":"","class_id":63,"description":"","genre_id":86,"goods_name":"三福2016男冬纯色翻领外套 韩版修身英伦呢大衣","goods_sn":"363370","goods_type":5,"id":1614771,"img_list":[],"is_best":0,"is_disc":0,"is_hot":0,"is_new":0,"isvalid":1,"keywords":"363370,SATTACHERA,男装,上装,经典,外套,羊毛","l_img":"http://img.sanfu.com/img/goods/list/201609240935457535.jpg","m_goods_id":0,"mb_price":369,"model":"RCTX-R-8806长款","num":8,"number":8,"pattern":"","pf_price":369,"s_img":"http://img.sanfu.com/img/goods/photos/middle/1609/middle201609240933110566.jpg","sc_price":369,"search_words":"三福2016男冬纯色翻领外套 韩版修身英伦呢大衣,363370,SATTACHERA,男装,上装,经典,外套,羊毛,,男装,外套,大衣/风衣每周上新,男士新品,本周上新,9月23日新品,男上新,363370,冬,都市生活,羊毛,外套,经典,暂无,藏青,灰色,S,M,L,XL,XXL,XXXL,XXXXL","season":"","shelf_time":1474872432,"shelf_timeStr":"2016-09-26 14:47:12","smallpic":"","sort_id":75,"start_time":1474531818,"start_timeStr":"2016-09-22 16:10:18"},{"addtime":1475140268,"addtimeStr":"2016-09-29 17:11:08","brand_id":0,"c_img":"","category_id":0,"cats_name":"","class_id":63,"description":"","genre_id":86,"goods_name":"三福2016男冬迷彩棒球领外套 侧边隐形插带中长款大衣","goods_sn":"754862","goods_type":5,"id":1774775,"img_list":[],"is_best":0,"is_disc":0,"is_hot":0,"is_new":0,"isvalid":1,"keywords":"754862,SANFU,男装,上装,时尚,外套,化纤","l_img":"http://img.sanfu.com/img/goods/list/201609291713425537.jpg","m_goods_id":0,"mb_price":299,"model":"DD-1261迷彩棒球领","num":0,"number":0,"pattern":"","pf_price":299,"s_img":"http://img.sanfu.com/img/goods/photos/middle/1609/middle201609291711521574.jpg","sc_price":299,"search_words":"三福2016男冬迷彩棒球领外套 侧边隐形插带中长款大衣,754862,SANFU,男装,上装,时尚,外套,化纤,,男装,外套,大衣/风衣每周上新,男士新品,男上新,754862,冬,街头时尚,化纤,外套,时尚,暂无,军绿,M,XXL,S,XXXL,XXXXL,L,XL","season":"","shelf_time":1475918785,"shelf_timeStr":"2016-10-08 17:26:25","smallpic":"","sort_id":75,"start_time":1475140268,"start_timeStr":"2016-09-29 17:11:08"},{"addtime":1476349400,"addtimeStr":"2016-10-13 17:03:20","brand_id":0,"c_img":"","category_id":0,"cats_name":"","class_id":63,"description":"","genre_id":86,"goods_name":"三福2016男冬纯色衣袖贴标外套 口袋拉链连帽大衣","goods_sn":"363033","goods_type":5,"id":1894726,"img_list":[],"is_best":0,"is_disc":0,"is_hot":0,"is_new":0,"isvalid":1,"keywords":"363033,SANFU,男装,上装,流行,外套,涤纶","l_img":"http://img.sanfu.com/img/goods/list/201610141132028441.jpg","m_goods_id":0,"mb_price":369,"model":"TZ-F-8228袖标","num":0,"number":0,"pattern":"","pf_price":369,"s_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141130134553.jpg","sc_price":369,"search_words":"三福2016男冬纯色衣袖贴标外套 口袋拉链连帽大衣,363033,SANFU,男装,上装,流行,外套,涤纶,,男装,外套,大衣/风衣每周上新,男士新品,男上新,363033,冬,校园文艺,涤纶,外套,流行,暂无,黑色,军绿,S,M,L,XL,XXL,XXXL,XXXXL","season":"","shelf_time":1476437610,"shelf_timeStr":"2016-10-14 17:33:30","smallpic":"","sort_id":75,"start_time":1476349400,"start_timeStr":"2016-10-13 17:03:20"},{"addtime":1476349436,"addtimeStr":"2016-10-13 17:03:56","brand_id":0,"c_img":"","category_id":0,"cats_name":"","class_id":63,"description":"","genre_id":86,"goods_name":"三福2016男冬棒球领中长款外套 抽绳拉链简约风衣","goods_sn":"362826","goods_type":5,"id":1894758,"img_list":[],"is_best":0,"is_disc":0,"is_hot":0,"is_new":0,"isvalid":1,"keywords":"362826,SATTACHERA,男装,上装,经典,外套,棉","l_img":"http://img.sanfu.com/img/goods/list/201610141139095131.jpg","m_goods_id":0,"mb_price":339,"model":"KD-AK826519拉链","num":0,"number":0,"pattern":"","pf_price":339,"s_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141136259010.jpg","sc_price":339,"search_words":"三福2016男冬棒球领中长款外套 抽绳拉链简约风衣,362826,SATTACHERA,男装,上装,经典,外套,棉,,男装,外套,大衣/风衣每周上新,男士新品,10月14日新品,男上新,362826,冬,都市生活,棉,外套,经典,暂无,黑色,灰色,S,M,L,XL,XXL,XXXL,XXXXL","season":"","shelf_time":1476437610,"shelf_timeStr":"2016-10-14 17:33:30","smallpic":"","sort_id":75,"start_time":1476349436,"start_timeStr":"2016-10-13 17:03:56"},{"addtime":1475219940,"addtimeStr":"2016-09-30 15:19:00","brand_id":0,"c_img":"","category_id":0,"cats_name":"","class_id":63,"description":"","genre_id":86,"goods_name":"三福2016男冬撞色字母拉链外套 连帽中长款大衣","goods_sn":"363005","goods_type":5,"id":1794706,"img_list":[],"is_best":0,"is_disc":0,"is_hot":0,"is_new":0,"isvalid":1,"keywords":"363005,SANFU,男装,上装,流行,外套,化纤","l_img":"http://img.sanfu.com/img/goods/list/201609301522565295.jpg","m_goods_id":0,"mb_price":439,"model":"WY-F6990字母拉链","num":0,"number":0,"pattern":"","pf_price":439,"s_img":"http://img.sanfu.com/img/goods/photos/middle/1609/middle201609301519443021.jpg","sc_price":439,"search_words":"三福2016男冬撞色字母拉链外套 连帽中长款大衣,363005,SANFU,男装,上装,流行,外套,化纤,,男装,外套,大衣/风衣每周上新,男士新品,本周上新,9月30日新品,男上新,363005,冬,校园文艺,化纤,外套,流行,暂无,黑色,灰色,S,M,L,XL,XXL,XXXL,XXXXL","season":"","shelf_time":1476155381,"shelf_timeStr":"2016-10-11 11:09:41","smallpic":"","sort_id":75,"start_time":1475219940,"start_timeStr":"2016-09-30 15:19:00"},{"addtime":1475129162,"addtimeStr":"2016-09-29 14:06:02","brand_id":0,"c_img":"","category_id":0,"cats_name":"","class_id":63,"description":"","genre_id":86,"goods_name":"三福2016男冬拼接毛织袖薄外套 小立领贴章外衣","goods_sn":"362922","goods_type":5,"id":1774723,"img_list":[],"is_best":0,"is_disc":0,"is_hot":0,"is_new":0,"isvalid":1,"keywords":"362922,SANFU,男装,上装,流行,外套,棉","l_img":"http://img.sanfu.com/img/goods/list/201610081646027832.jpg","m_goods_id":0,"mb_price":239,"model":"CC-8561薄棉拼接代","num":0,"number":0,"pattern":"","pf_price":239,"s_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610081642321329.jpg","sc_price":239,"search_words":"三福2016男冬拼接毛织袖薄外套 小立领贴章外衣,362922,SANFU,男装,上装,流行,外套,棉,,男装,外套,大衣/风衣每周上新,男士新品,本周上新,9月30日新品,男上新,362922,冬,校园文艺,棉,外套,流行,暂无,黑色,灰色,S,M,L,XL,XXL,XXXL,XXXXL","season":"","shelf_time":1475916398,"shelf_timeStr":"2016-10-08 16:46:38","smallpic":"","sort_id":75,"start_time":1475129162,"start_timeStr":"2016-09-29 14:06:02"},{"addtime":1476349381,"addtimeStr":"2016-10-13 17:03:01","brand_id":0,"c_img":"","category_id":0,"cats_name":"","class_id":63,"description":"","genre_id":86,"goods_name":"三福2016男秋后背拼接印花棒球外套 纯色短款休闲风衣","goods_sn":"363001","goods_type":5,"id":1894717,"img_list":[],"is_best":0,"is_disc":0,"is_hot":0,"is_new":0,"isvalid":1,"keywords":"363001,SANFU,男装,上装,时尚,外套,化纤","l_img":"http://img.sanfu.com/img/goods/list/201610141123278914.jpg","m_goods_id":0,"mb_price":299,"model":"DND-8538后背印花代","num":0,"number":0,"pattern":"","pf_price":299,"s_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141121532382.jpg","sc_price":299,"search_words":"三福2016男秋后背拼接印花棒球外套 纯色短款休闲风衣,363001,SANFU,男装,上装,时尚,外套,化纤,,男装,外套,大衣/风衣每周上新,男士新品,男上新,363001,秋,街头时尚,化纤,外套,时尚,暂无,黑色,暗灰,S,M,L,XL,XXL,XXXL,XXXXL","season":"","shelf_time":1476437610,"shelf_timeStr":"2016-10-14 17:33:30","smallpic":"","sort_id":75,"start_time":1476349381,"start_timeStr":"2016-10-13 17:03:01"},{"addtime":1474679075,"addtimeStr":"2016-09-24 09:04:35","brand_id":0,"c_img":"","category_id":0,"cats_name":"","class_id":63,"description":"","genre_id":86,"goods_name":"三福2016男冬纯色翻领外套 韩版中长款百搭呢大衣","goods_sn":"362821","goods_type":5,"id":1654705,"img_list":[],"is_best":0,"is_disc":0,"is_hot":0,"is_new":0,"isvalid":1,"keywords":"362821,SATTACHERA,男装,上装,经典,外套,毛呢","l_img":"http://img.sanfu.com/img/goods/list/201609240907311693.jpg","m_goods_id":0,"mb_price":499,"model":"KLN-K7703针织呢","num":1,"number":1,"pattern":"","pf_price":499,"s_img":"http://img.sanfu.com/img/goods/photos/middle/1609/middle201609240905305788.jpg","sc_price":499,"search_words":"三福2016男冬纯色翻领外套 韩版中长款百搭呢大衣,362821,SATTACHERA,男装,上装,经典,外套,毛呢,,男装,外套,大衣/风衣每周上新,男士新品,本周上新,9月23日新品,男上新,都会外套,都会所有商品,362821,冬,都市生活,毛呢,外套,经典,暂无,深蓝,S,XL,XXXXL,XXXL,XXL,L,M","season":"","shelf_time":1475026285,"shelf_timeStr":"2016-09-28 09:31:25","smallpic":"","sort_id":75,"start_time":1474679075,"start_timeStr":"2016-09-24 09:04:35"},{"addtime":1475893618,"addtimeStr":"2016-10-08 10:26:58","brand_id":0,"c_img":"","category_id":0,"cats_name":"","class_id":63,"description":"","genre_id":86,"goods_name":"三福2016男冬纯色翻领字母印花外套 韩版廓形大衣","goods_sn":"362819","goods_type":5,"id":1814706,"img_list":[],"is_best":0,"is_disc":0,"is_hot":0,"is_new":0,"isvalid":1,"keywords":"362819,SATTACHERA,男装,上装,经典,外套,毛呢","l_img":"http://img.sanfu.com/img/goods/list/201610081032554088.jpg","m_goods_id":0,"mb_price":499,"model":"SYC-SMW163178印字","num":1,"number":1,"pattern":"","pf_price":499,"s_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610081027584796.jpg","sc_price":499,"search_words":"三福2016男冬纯色翻领字母印花外套 韩版廓形大衣,362819,SATTACHERA,男装,上装,经典,外套,毛呢,,男装,外套,大衣/风衣每周上新,男士新品,本周上新,9月23日新品,男上新,362819,冬,都市生活,毛呢,外套,经典,暂无,黑色,灰色,XL,S,XXXL,L,XXL,M,XXXXL","season":"","shelf_time":1475894037,"shelf_timeStr":"2016-10-08 10:33:57","smallpic":"","sort_id":75,"start_time":1475893618,"start_timeStr":"2016-10-08 10:26:58"},{"addtime":1472719498,"addtimeStr":"2016-09-01 16:44:58","brand_id":0,"c_img":"","category_id":0,"cats_name":"","class_id":63,"description":"","genre_id":86,"goods_name":"三福2016男秋胸前撞色字母印花连帽外套 中长款大衣","goods_sn":"361819","goods_type":5,"id":1374788,"img_list":[],"is_best":0,"is_disc":0,"is_hot":0,"is_new":0,"isvalid":1,"keywords":"361819,SANFU,男装,上装,流行,外套,棉料","l_img":"http://img.sanfu.com/img/goods/list/201609021353291718.jpg","m_goods_id":0,"mb_price":259,"model":"FSK-WT6901胸前字母","num":0,"number":0,"pattern":"","pf_price":259,"s_img":"http://img.sanfu.com/img/goods/photos/middle/1609/middle201609261038493054.jpg","sc_price":259,"search_words":"三福2016男秋胸前撞色字母印花连帽外套 中长款大衣,361819,SANFU,男装,上装,流行,外套,棉料,,男装,外套,大衣/风衣每周上新,男士新品,本周上新,2016年秋装男女新品,男上新,361819,秋,校园文艺,棉料,外套,流行,暂无,黑色,绿色,XXXL,XXL,XL,L,M,S,XXXXL","season":"","shelf_time":1474857784,"shelf_timeStr":"2016-09-26 10:43:04","smallpic":"","sort_id":75,"start_time":1472719498,"start_timeStr":"2016-09-01 16:44:58"}]
     * promolist : [{"add_time":"2016-10-10 10:06:46","amount":129,"amountStr":"129元","cid":0,"cid_name":"","coupon_id":"","coupon_name":"","etime":"2018-03-28 00:00:00","goods_sn":"","id":3,"in_use":1,"memo":"","modeStr":"","modes":1,"money":0,"moneyStr":"0福币","name":"实付满129元包邮","order_num":0,"point":0,"pointStr":"0积分","sale":0,"saleStr":"免邮","shop":"1","shopStr":"全部","status":0,"stime":"2015-06-02 00:00:00","type":1,"typeStr":"元","url":"","way":3,"wayStr":"包邮"},{"add_time":"2016-04-01 16:10:52","amount":0,"amountStr":"0元","cid":0,"cid_name":"","coupon_id":"","coupon_name":"","etime":"2017-12-31 23:59:07","goods_sn":"","id":211,"in_use":1,"memo":"","modeStr":"","modes":1,"money":0,"moneyStr":"0福币","name":"首次购买第一件9折","order_num":1,"point":0,"pointStr":"0积分","sale":90,"saleStr":"9折","shop":"1","shopStr":"全部","status":0,"stime":"2016-03-29 23:59:07","type":1,"typeStr":"元","url":"","way":2,"wayStr":"折扣"}]
     * goodsProps : {"brand":"SATTACHERA","category":"男装","colors":"","firstsubtype":"","givelevel":"","goods_id":1894757,"goods_sn":362823,"goodssubtype":"","goostyle":"经典","id":1810279,"lengthlevel":"","lifedays":90,"material":"毛呢","modeltype":"","netcollection":"都市生活","pattern":"外套","planshelfdate":"","remark":"","season":"冬","sizes":"","softlevel":"","specs":"SYC-SMW163183织带","thinlevel":"","tips":"","washSTD":"","weartype":"上装"}
     * goods : {"addtime":1476349436,"addtimeStr":"2016-10-13 17:03:56","brand_id":0,"c_img":"","category_id":0,"cats_name":"","class_id":63,"description":"","genre_id":86,"goods_name":"三福2016男冬翻盖口袋连帽大衣 中长款腰部抽绳外套","goods_sn":"362823","goods_type":5,"id":1894757,"img_list":[],"is_best":0,"is_disc":0,"is_hot":0,"is_new":0,"isvalid":1,"keywords":"362823,SATTACHERA,男装,上装,经典,外套,毛呢","l_img":"http://img.sanfu.com/img/goods/list/201610141137421035.jpg","m_goods_id":0,"mb_price":499,"model":"SYC-SMW163183织带","num":0,"number":0,"pattern":"","pf_price":499,"s_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135163235.jpg","sc_price":499,"search_words":"三福2016男冬翻盖口袋连帽大衣 中长款腰部抽绳外套,362823,SATTACHERA,男装,上装,经典,外套,毛呢,,男装,外套,大衣/风衣每周上新,男士新品,男上新,362823,冬,都市生活,毛呢,外套,经典,暂无,黑色,灰色,S,M,L,XL,XXL,XXXL,XXXXL","season":"","shelf_time":1476437610,"shelf_timeStr":"2016-10-14 17:33:30","smallpic":"","sort_id":75,"start_time":1476349436,"start_timeStr":"2016-10-13 17:03:56"}
     * goodsSpeci : [{"barcode":"36282301","class_id":0,"color_id":0,"color_name":"黑色","flag":"","genre_id":0,"goodsPhoto":{"b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135163235.jpg","base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135163235.jpg","full_b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135163235.jpg","full_base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135163235.jpg","full_m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135163235.jpg","full_s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135163235.jpg","goods_id":1894757,"id":2021098,"isdefault":1,"m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135163235.jpg","s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135163235.jpg","tiny_img":"http://img.sanfu.com/img/goods/photos/tiny/1610/tiny201610141135163235.jpg"},"goods_id":1894757,"goods_name":"","goods_sn":362823,"id":2033524,"isvalid":0,"num":5,"number":5,"photo_id":2021098,"size_id":12,"size_name":"S","sort_id":0,"stock":null},{"barcode":"36282302","class_id":0,"color_id":0,"color_name":"黑色","flag":"","genre_id":0,"goodsPhoto":{"b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135163235.jpg","base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135163235.jpg","full_b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135163235.jpg","full_base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135163235.jpg","full_m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135163235.jpg","full_s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135163235.jpg","goods_id":1894757,"id":2021098,"isdefault":1,"m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135163235.jpg","s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135163235.jpg","tiny_img":"http://img.sanfu.com/img/goods/photos/tiny/1610/tiny201610141135163235.jpg"},"goods_id":1894757,"goods_name":"","goods_sn":362823,"id":2033525,"isvalid":0,"num":91,"number":91,"photo_id":2021098,"size_id":9,"size_name":"M","sort_id":0,"stock":null},{"barcode":"36282303","class_id":0,"color_id":0,"color_name":"黑色","flag":"","genre_id":0,"goodsPhoto":{"b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135163235.jpg","base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135163235.jpg","full_b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135163235.jpg","full_base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135163235.jpg","full_m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135163235.jpg","full_s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135163235.jpg","goods_id":1894757,"id":2021098,"isdefault":1,"m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135163235.jpg","s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135163235.jpg","tiny_img":"http://img.sanfu.com/img/goods/photos/tiny/1610/tiny201610141135163235.jpg"},"goods_id":1894757,"goods_name":"","goods_sn":362823,"id":2033526,"isvalid":0,"num":123,"number":123,"photo_id":2021098,"size_id":11,"size_name":"L","sort_id":0,"stock":null},{"barcode":"36282304","class_id":0,"color_id":0,"color_name":"黑色","flag":"","genre_id":0,"goodsPhoto":{"b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135163235.jpg","base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135163235.jpg","full_b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135163235.jpg","full_base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135163235.jpg","full_m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135163235.jpg","full_s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135163235.jpg","goods_id":1894757,"id":2021098,"isdefault":1,"m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135163235.jpg","s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135163235.jpg","tiny_img":"http://img.sanfu.com/img/goods/photos/tiny/1610/tiny201610141135163235.jpg"},"goods_id":1894757,"goods_name":"","goods_sn":362823,"id":2033527,"isvalid":0,"num":80,"number":80,"photo_id":2021098,"size_id":10,"size_name":"XL","sort_id":0,"stock":null},{"barcode":"36282305","class_id":0,"color_id":0,"color_name":"黑色","flag":"","genre_id":0,"goodsPhoto":{"b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135163235.jpg","base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135163235.jpg","full_b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135163235.jpg","full_base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135163235.jpg","full_m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135163235.jpg","full_s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135163235.jpg","goods_id":1894757,"id":2021098,"isdefault":1,"m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135163235.jpg","s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135163235.jpg","tiny_img":"http://img.sanfu.com/img/goods/photos/tiny/1610/tiny201610141135163235.jpg"},"goods_id":1894757,"goods_name":"","goods_sn":362823,"id":2033528,"isvalid":0,"num":14,"number":14,"photo_id":2021098,"size_id":8,"size_name":"XXL","sort_id":0,"stock":null}]
     */

    private MsgBean msg;
    private String key;
    private String sign;
    private int length;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public MsgBean getMsg() {
        return msg;
    }

    public void setMsg(MsgBean msg) {
        this.msg = msg;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public static class MsgBean {
        private int userPoint;
        private int commentsize;
        private int collectSize;
        /**
         * brand : SATTACHERA
         * category : 男装
         * colors :
         * firstsubtype :
         * givelevel :
         * goods_id : 1894757
         * goods_sn : 362823
         * goodssubtype :
         * goostyle : 经典
         * id : 1810279
         * lengthlevel :
         * lifedays : 90
         * material : 毛呢
         * modeltype :
         * netcollection : 都市生活
         * pattern : 外套
         * planshelfdate :
         * remark :
         * season : 冬
         * sizes :
         * softlevel :
         * specs : SYC-SMW163183织带
         * thinlevel :
         * tips :
         * washSTD :
         * weartype : 上装
         */

        private GoodsPropsBean goodsProps;
        /**
         * addtime : 1476349436
         * addtimeStr : 2016-10-13 17:03:56
         * brand_id : 0
         * c_img :
         * category_id : 0
         * cats_name :
         * class_id : 63
         * description :
         * genre_id : 86
         * goods_name : 三福2016男冬翻盖口袋连帽大衣 中长款腰部抽绳外套
         * goods_sn : 362823
         * goods_type : 5
         * id : 1894757
         * img_list : []
         * is_best : 0
         * is_disc : 0
         * is_hot : 0
         * is_new : 0
         * isvalid : 1
         * keywords : 362823,SATTACHERA,男装,上装,经典,外套,毛呢
         * l_img : http://img.sanfu.com/img/goods/list/201610141137421035.jpg
         * m_goods_id : 0
         * mb_price : 499
         * model : SYC-SMW163183织带
         * num : 0
         * number : 0
         * pattern :
         * pf_price : 499
         * s_img : http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135163235.jpg
         * sc_price : 499
         * search_words : 三福2016男冬翻盖口袋连帽大衣 中长款腰部抽绳外套,362823,SATTACHERA,男装,上装,经典,外套,毛呢,,男装,外套,大衣/风衣每周上新,男士新品,男上新,362823,冬,都市生活,毛呢,外套,经典,暂无,黑色,灰色,S,M,L,XL,XXL,XXXL,XXXXL
         * season :
         * shelf_time : 1476437610
         * shelf_timeStr : 2016-10-14 17:33:30
         * smallpic :
         * sort_id : 75
         * start_time : 1476349436
         * start_timeStr : 2016-10-13 17:03:56
         */

        private GoodsBean goods;
        /**
         * b_img : http://img.sanfu.com/img/goods/photos/big/1610/big201610141135163235.jpg
         * base_img : http://img.sanfu.com/img/goods/photos/base/1610/base201610141135163235.jpg
         * full_b_img : http://img.sanfu.com/img/goods/photos/big/1610/big201610141135163235.jpg
         * full_base_img : http://img.sanfu.com/img/goods/photos/base/1610/base201610141135163235.jpg
         * full_m_img : http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135163235.jpg
         * full_s_img : http://img.sanfu.com/img/goods/photos/small/1610/small201610141135163235.jpg
         * goods_id : 1894757
         * id : 2021098
         * isdefault : 1
         * m_img : http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135163235.jpg
         * s_img : http://img.sanfu.com/img/goods/photos/small/1610/small201610141135163235.jpg
         * tiny_img : http://img.sanfu.com/img/goods/photos/tiny/1610/tiny201610141135163235.jpg
         */

        private List<GoodsPhotolistBean> goodsPhotolist;
        private List<?> commentlist;
        /**
         * addtime : 1476349421
         * addtimeStr : 2016-10-13 17:03:41
         * brand_id : 0
         * c_img :
         * category_id : 0
         * cats_name :
         * class_id : 63
         * description :
         * genre_id : 86
         * goods_name : 三福2016男冬廓形不可脱羊羔毛帽外套 纯色抽绳大衣
         * goods_sn : 363034
         * goods_type : 5
         * id : 1894742
         * img_list : []
         * is_best : 0
         * is_disc : 0
         * is_hot : 0
         * is_new : 0
         * isvalid : 1
         * keywords : 363034,SANFU,男装,上装,流行,外套,锦棉
         * l_img : http://img.sanfu.com/img/goods/list/201610141148482397.jpg
         * m_goods_id : 0
         * mb_price : 339
         * model : YJ-6312羊羔毛里
         * num : 0
         * number : 0
         * pattern :
         * pf_price : 339
         * s_img : http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141146589494.jpg
         * sc_price : 339
         * search_words : 三福2016男冬廓形不可脱羊羔毛帽外套 纯色抽绳大衣,363034,SANFU,男装,上装,流行,外套,锦棉,,男装,外套,大衣/风衣每周上新,男士新品,男上新,363034,冬,校园文艺,锦棉,外套,流行,暂无,黑色,S,M,L,XXXXL,XXL,XXXL,XL
         * season :
         * shelf_time : 1476437610
         * shelf_timeStr : 2016-10-14 17:33:30
         * smallpic :
         * sort_id : 75
         * start_time : 1476349421
         * start_timeStr : 2016-10-13 17:03:41
         */

        private List<ChoosenBean> choosen;
        /**
         * add_time : 2016-10-10 10:06:46
         * amount : 129
         * amountStr : 129元
         * cid : 0
         * cid_name :
         * coupon_id :
         * coupon_name :
         * etime : 2018-03-28 00:00:00
         * goods_sn :
         * id : 3
         * in_use : 1
         * memo :
         * modeStr :
         * modes : 1
         * money : 0
         * moneyStr : 0福币
         * name : 实付满129元包邮
         * order_num : 0
         * point : 0
         * pointStr : 0积分
         * sale : 0
         * saleStr : 免邮
         * shop : 1
         * shopStr : 全部
         * status : 0
         * stime : 2015-06-02 00:00:00
         * type : 1
         * typeStr : 元
         * url :
         * way : 3
         * wayStr : 包邮
         */

        private List<PromolistBean> promolist;
        /**
         * barcode : 36282301
         * class_id : 0
         * color_id : 0
         * color_name : 黑色
         * flag :
         * genre_id : 0
         * goodsPhoto : {"b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135163235.jpg","base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135163235.jpg","full_b_img":"http://img.sanfu.com/img/goods/photos/big/1610/big201610141135163235.jpg","full_base_img":"http://img.sanfu.com/img/goods/photos/base/1610/base201610141135163235.jpg","full_m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135163235.jpg","full_s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135163235.jpg","goods_id":1894757,"id":2021098,"isdefault":1,"m_img":"http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135163235.jpg","s_img":"http://img.sanfu.com/img/goods/photos/small/1610/small201610141135163235.jpg","tiny_img":"http://img.sanfu.com/img/goods/photos/tiny/1610/tiny201610141135163235.jpg"}
         * goods_id : 1894757
         * goods_name :
         * goods_sn : 362823
         * id : 2033524
         * isvalid : 0
         * num : 5
         * number : 5
         * photo_id : 2021098
         * size_id : 12
         * size_name : S
         * sort_id : 0
         * stock : null
         */

        private List<GoodsSpeciBean> goodsSpeci;

        public int getUserPoint() {
            return userPoint;
        }

        public void setUserPoint(int userPoint) {
            this.userPoint = userPoint;
        }

        public int getCommentsize() {
            return commentsize;
        }

        public void setCommentsize(int commentsize) {
            this.commentsize = commentsize;
        }

        public int getCollectSize() {
            return collectSize;
        }

        public void setCollectSize(int collectSize) {
            this.collectSize = collectSize;
        }

        public GoodsPropsBean getGoodsProps() {
            return goodsProps;
        }

        public void setGoodsProps(GoodsPropsBean goodsProps) {
            this.goodsProps = goodsProps;
        }

        public GoodsBean getGoods() {
            return goods;
        }

        public void setGoods(GoodsBean goods) {
            this.goods = goods;
        }

        public List<GoodsPhotolistBean> getGoodsPhotolist() {
            return goodsPhotolist;
        }

        public void setGoodsPhotolist(List<GoodsPhotolistBean> goodsPhotolist) {
            this.goodsPhotolist = goodsPhotolist;
        }

        public List<?> getCommentlist() {
            return commentlist;
        }

        public void setCommentlist(List<?> commentlist) {
            this.commentlist = commentlist;
        }

        public List<ChoosenBean> getChoosen() {
            return choosen;
        }

        public void setChoosen(List<ChoosenBean> choosen) {
            this.choosen = choosen;
        }

        public List<PromolistBean> getPromolist() {
            return promolist;
        }

        public void setPromolist(List<PromolistBean> promolist) {
            this.promolist = promolist;
        }

        public List<GoodsSpeciBean> getGoodsSpeci() {
            return goodsSpeci;
        }

        public void setGoodsSpeci(List<GoodsSpeciBean> goodsSpeci) {
            this.goodsSpeci = goodsSpeci;
        }

        public static class GoodsPropsBean {
            private String brand;
            private String category;
            private String colors;
            private String firstsubtype;
            private String givelevel;
            private int goods_id;
            private int goods_sn;
            private String goodssubtype;
            private String goostyle;
            private int id;
            private String lengthlevel;
            private int lifedays;
            private String material;
            private String modeltype;
            private String netcollection;
            private String pattern;
            private String planshelfdate;
            private String remark;
            private String season;
            private String sizes;
            private String softlevel;
            private String specs;
            private String thinlevel;
            private String tips;
            private String washSTD;
            private String weartype;

            public String getBrand() {
                return brand;
            }

            public void setBrand(String brand) {
                this.brand = brand;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getColors() {
                return colors;
            }

            public void setColors(String colors) {
                this.colors = colors;
            }

            public String getFirstsubtype() {
                return firstsubtype;
            }

            public void setFirstsubtype(String firstsubtype) {
                this.firstsubtype = firstsubtype;
            }

            public String getGivelevel() {
                return givelevel;
            }

            public void setGivelevel(String givelevel) {
                this.givelevel = givelevel;
            }

            public int getGoods_id() {
                return goods_id;
            }

            public void setGoods_id(int goods_id) {
                this.goods_id = goods_id;
            }

            public int getGoods_sn() {
                return goods_sn;
            }

            public void setGoods_sn(int goods_sn) {
                this.goods_sn = goods_sn;
            }

            public String getGoodssubtype() {
                return goodssubtype;
            }

            public void setGoodssubtype(String goodssubtype) {
                this.goodssubtype = goodssubtype;
            }

            public String getGoostyle() {
                return goostyle;
            }

            public void setGoostyle(String goostyle) {
                this.goostyle = goostyle;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLengthlevel() {
                return lengthlevel;
            }

            public void setLengthlevel(String lengthlevel) {
                this.lengthlevel = lengthlevel;
            }

            public int getLifedays() {
                return lifedays;
            }

            public void setLifedays(int lifedays) {
                this.lifedays = lifedays;
            }

            public String getMaterial() {
                return material;
            }

            public void setMaterial(String material) {
                this.material = material;
            }

            public String getModeltype() {
                return modeltype;
            }

            public void setModeltype(String modeltype) {
                this.modeltype = modeltype;
            }

            public String getNetcollection() {
                return netcollection;
            }

            public void setNetcollection(String netcollection) {
                this.netcollection = netcollection;
            }

            public String getPattern() {
                return pattern;
            }

            public void setPattern(String pattern) {
                this.pattern = pattern;
            }

            public String getPlanshelfdate() {
                return planshelfdate;
            }

            public void setPlanshelfdate(String planshelfdate) {
                this.planshelfdate = planshelfdate;
            }

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public String getSeason() {
                return season;
            }

            public void setSeason(String season) {
                this.season = season;
            }

            public String getSizes() {
                return sizes;
            }

            public void setSizes(String sizes) {
                this.sizes = sizes;
            }

            public String getSoftlevel() {
                return softlevel;
            }

            public void setSoftlevel(String softlevel) {
                this.softlevel = softlevel;
            }

            public String getSpecs() {
                return specs;
            }

            public void setSpecs(String specs) {
                this.specs = specs;
            }

            public String getThinlevel() {
                return thinlevel;
            }

            public void setThinlevel(String thinlevel) {
                this.thinlevel = thinlevel;
            }

            public String getTips() {
                return tips;
            }

            public void setTips(String tips) {
                this.tips = tips;
            }

            public String getWashSTD() {
                return washSTD;
            }

            public void setWashSTD(String washSTD) {
                this.washSTD = washSTD;
            }

            public String getWeartype() {
                return weartype;
            }

            public void setWeartype(String weartype) {
                this.weartype = weartype;
            }
        }

        public static class GoodsBean {
            private int addtime;
            private String addtimeStr;
            private int brand_id;
            private String c_img;
            private int category_id;
            private String cats_name;
            private int class_id;
            private String description;
            private int genre_id;
            private String goods_name;
            private String goods_sn;
            private int goods_type;
            private int id;
            private int is_best;
            private int is_disc;
            private int is_hot;
            private int is_new;
            private int isvalid;
            private String keywords;
            private String l_img;
            private int m_goods_id;
            private int mb_price;
            private String model;
            private int num;
            private int number;
            private String pattern;
            private int pf_price;
            private String s_img;
            private int sc_price;
            private String search_words;
            private String season;
            private int shelf_time;
            private String shelf_timeStr;
            private String smallpic;
            private int sort_id;
            private int start_time;
            private String start_timeStr;
            private List<?> img_list;

            public int getAddtime() {
                return addtime;
            }

            public void setAddtime(int addtime) {
                this.addtime = addtime;
            }

            public String getAddtimeStr() {
                return addtimeStr;
            }

            public void setAddtimeStr(String addtimeStr) {
                this.addtimeStr = addtimeStr;
            }

            public int getBrand_id() {
                return brand_id;
            }

            public void setBrand_id(int brand_id) {
                this.brand_id = brand_id;
            }

            public String getC_img() {
                return c_img;
            }

            public void setC_img(String c_img) {
                this.c_img = c_img;
            }

            public int getCategory_id() {
                return category_id;
            }

            public void setCategory_id(int category_id) {
                this.category_id = category_id;
            }

            public String getCats_name() {
                return cats_name;
            }

            public void setCats_name(String cats_name) {
                this.cats_name = cats_name;
            }

            public int getClass_id() {
                return class_id;
            }

            public void setClass_id(int class_id) {
                this.class_id = class_id;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public int getGenre_id() {
                return genre_id;
            }

            public void setGenre_id(int genre_id) {
                this.genre_id = genre_id;
            }

            public String getGoods_name() {
                return goods_name;
            }

            public void setGoods_name(String goods_name) {
                this.goods_name = goods_name;
            }

            public String getGoods_sn() {
                return goods_sn;
            }

            public void setGoods_sn(String goods_sn) {
                this.goods_sn = goods_sn;
            }

            public int getGoods_type() {
                return goods_type;
            }

            public void setGoods_type(int goods_type) {
                this.goods_type = goods_type;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getIs_best() {
                return is_best;
            }

            public void setIs_best(int is_best) {
                this.is_best = is_best;
            }

            public int getIs_disc() {
                return is_disc;
            }

            public void setIs_disc(int is_disc) {
                this.is_disc = is_disc;
            }

            public int getIs_hot() {
                return is_hot;
            }

            public void setIs_hot(int is_hot) {
                this.is_hot = is_hot;
            }

            public int getIs_new() {
                return is_new;
            }

            public void setIs_new(int is_new) {
                this.is_new = is_new;
            }

            public int getIsvalid() {
                return isvalid;
            }

            public void setIsvalid(int isvalid) {
                this.isvalid = isvalid;
            }

            public String getKeywords() {
                return keywords;
            }

            public void setKeywords(String keywords) {
                this.keywords = keywords;
            }

            public String getL_img() {
                return l_img;
            }

            public void setL_img(String l_img) {
                this.l_img = l_img;
            }

            public int getM_goods_id() {
                return m_goods_id;
            }

            public void setM_goods_id(int m_goods_id) {
                this.m_goods_id = m_goods_id;
            }

            public int getMb_price() {
                return mb_price;
            }

            public void setMb_price(int mb_price) {
                this.mb_price = mb_price;
            }

            public String getModel() {
                return model;
            }

            public void setModel(String model) {
                this.model = model;
            }

            public int getNum() {
                return num;
            }

            public void setNum(int num) {
                this.num = num;
            }

            public int getNumber() {
                return number;
            }

            public void setNumber(int number) {
                this.number = number;
            }

            public String getPattern() {
                return pattern;
            }

            public void setPattern(String pattern) {
                this.pattern = pattern;
            }

            public int getPf_price() {
                return pf_price;
            }

            public void setPf_price(int pf_price) {
                this.pf_price = pf_price;
            }

            public String getS_img() {
                return s_img;
            }

            public void setS_img(String s_img) {
                this.s_img = s_img;
            }

            public int getSc_price() {
                return sc_price;
            }

            public void setSc_price(int sc_price) {
                this.sc_price = sc_price;
            }

            public String getSearch_words() {
                return search_words;
            }

            public void setSearch_words(String search_words) {
                this.search_words = search_words;
            }

            public String getSeason() {
                return season;
            }

            public void setSeason(String season) {
                this.season = season;
            }

            public int getShelf_time() {
                return shelf_time;
            }

            public void setShelf_time(int shelf_time) {
                this.shelf_time = shelf_time;
            }

            public String getShelf_timeStr() {
                return shelf_timeStr;
            }

            public void setShelf_timeStr(String shelf_timeStr) {
                this.shelf_timeStr = shelf_timeStr;
            }

            public String getSmallpic() {
                return smallpic;
            }

            public void setSmallpic(String smallpic) {
                this.smallpic = smallpic;
            }

            public int getSort_id() {
                return sort_id;
            }

            public void setSort_id(int sort_id) {
                this.sort_id = sort_id;
            }

            public int getStart_time() {
                return start_time;
            }

            public void setStart_time(int start_time) {
                this.start_time = start_time;
            }

            public String getStart_timeStr() {
                return start_timeStr;
            }

            public void setStart_timeStr(String start_timeStr) {
                this.start_timeStr = start_timeStr;
            }

            public List<?> getImg_list() {
                return img_list;
            }

            public void setImg_list(List<?> img_list) {
                this.img_list = img_list;
            }
        }

        public static class GoodsPhotolistBean {
            private String b_img;
            private String base_img;
            private String full_b_img;
            private String full_base_img;
            private String full_m_img;
            private String full_s_img;
            private int goods_id;
            private int id;
            private int isdefault;
            private String m_img;
            private String s_img;
            private String tiny_img;

            public String getB_img() {
                return b_img;
            }

            public void setB_img(String b_img) {
                this.b_img = b_img;
            }

            public String getBase_img() {
                return base_img;
            }

            public void setBase_img(String base_img) {
                this.base_img = base_img;
            }

            public String getFull_b_img() {
                return full_b_img;
            }

            public void setFull_b_img(String full_b_img) {
                this.full_b_img = full_b_img;
            }

            public String getFull_base_img() {
                return full_base_img;
            }

            public void setFull_base_img(String full_base_img) {
                this.full_base_img = full_base_img;
            }

            public String getFull_m_img() {
                return full_m_img;
            }

            public void setFull_m_img(String full_m_img) {
                this.full_m_img = full_m_img;
            }

            public String getFull_s_img() {
                return full_s_img;
            }

            public void setFull_s_img(String full_s_img) {
                this.full_s_img = full_s_img;
            }

            public int getGoods_id() {
                return goods_id;
            }

            public void setGoods_id(int goods_id) {
                this.goods_id = goods_id;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getIsdefault() {
                return isdefault;
            }

            public void setIsdefault(int isdefault) {
                this.isdefault = isdefault;
            }

            public String getM_img() {
                return m_img;
            }

            public void setM_img(String m_img) {
                this.m_img = m_img;
            }

            public String getS_img() {
                return s_img;
            }

            public void setS_img(String s_img) {
                this.s_img = s_img;
            }

            public String getTiny_img() {
                return tiny_img;
            }

            public void setTiny_img(String tiny_img) {
                this.tiny_img = tiny_img;
            }
        }

        public static class ChoosenBean {
            private int addtime;
            private String addtimeStr;
            private int brand_id;
            private String c_img;
            private int category_id;
            private String cats_name;
            private int class_id;
            private String description;
            private int genre_id;
            private String goods_name;
            private String goods_sn;
            private int goods_type;
            private int id;
            private int is_best;
            private int is_disc;
            private int is_hot;
            private int is_new;
            private int isvalid;
            private String keywords;
            private String l_img;
            private int m_goods_id;
            private int mb_price;
            private String model;
            private int num;
            private int number;
            private String pattern;
            private int pf_price;
            private String s_img;
            private int sc_price;
            private String search_words;
            private String season;
            private int shelf_time;
            private String shelf_timeStr;
            private String smallpic;
            private int sort_id;
            private int start_time;
            private String start_timeStr;
            private List<?> img_list;

            public int getAddtime() {
                return addtime;
            }

            public void setAddtime(int addtime) {
                this.addtime = addtime;
            }

            public String getAddtimeStr() {
                return addtimeStr;
            }

            public void setAddtimeStr(String addtimeStr) {
                this.addtimeStr = addtimeStr;
            }

            public int getBrand_id() {
                return brand_id;
            }

            public void setBrand_id(int brand_id) {
                this.brand_id = brand_id;
            }

            public String getC_img() {
                return c_img;
            }

            public void setC_img(String c_img) {
                this.c_img = c_img;
            }

            public int getCategory_id() {
                return category_id;
            }

            public void setCategory_id(int category_id) {
                this.category_id = category_id;
            }

            public String getCats_name() {
                return cats_name;
            }

            public void setCats_name(String cats_name) {
                this.cats_name = cats_name;
            }

            public int getClass_id() {
                return class_id;
            }

            public void setClass_id(int class_id) {
                this.class_id = class_id;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public int getGenre_id() {
                return genre_id;
            }

            public void setGenre_id(int genre_id) {
                this.genre_id = genre_id;
            }

            public String getGoods_name() {
                return goods_name;
            }

            public void setGoods_name(String goods_name) {
                this.goods_name = goods_name;
            }

            public String getGoods_sn() {
                return goods_sn;
            }

            public void setGoods_sn(String goods_sn) {
                this.goods_sn = goods_sn;
            }

            public int getGoods_type() {
                return goods_type;
            }

            public void setGoods_type(int goods_type) {
                this.goods_type = goods_type;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getIs_best() {
                return is_best;
            }

            public void setIs_best(int is_best) {
                this.is_best = is_best;
            }

            public int getIs_disc() {
                return is_disc;
            }

            public void setIs_disc(int is_disc) {
                this.is_disc = is_disc;
            }

            public int getIs_hot() {
                return is_hot;
            }

            public void setIs_hot(int is_hot) {
                this.is_hot = is_hot;
            }

            public int getIs_new() {
                return is_new;
            }

            public void setIs_new(int is_new) {
                this.is_new = is_new;
            }

            public int getIsvalid() {
                return isvalid;
            }

            public void setIsvalid(int isvalid) {
                this.isvalid = isvalid;
            }

            public String getKeywords() {
                return keywords;
            }

            public void setKeywords(String keywords) {
                this.keywords = keywords;
            }

            public String getL_img() {
                return l_img;
            }

            public void setL_img(String l_img) {
                this.l_img = l_img;
            }

            public int getM_goods_id() {
                return m_goods_id;
            }

            public void setM_goods_id(int m_goods_id) {
                this.m_goods_id = m_goods_id;
            }

            public int getMb_price() {
                return mb_price;
            }

            public void setMb_price(int mb_price) {
                this.mb_price = mb_price;
            }

            public String getModel() {
                return model;
            }

            public void setModel(String model) {
                this.model = model;
            }

            public int getNum() {
                return num;
            }

            public void setNum(int num) {
                this.num = num;
            }

            public int getNumber() {
                return number;
            }

            public void setNumber(int number) {
                this.number = number;
            }

            public String getPattern() {
                return pattern;
            }

            public void setPattern(String pattern) {
                this.pattern = pattern;
            }

            public int getPf_price() {
                return pf_price;
            }

            public void setPf_price(int pf_price) {
                this.pf_price = pf_price;
            }

            public String getS_img() {
                return s_img;
            }

            public void setS_img(String s_img) {
                this.s_img = s_img;
            }

            public int getSc_price() {
                return sc_price;
            }

            public void setSc_price(int sc_price) {
                this.sc_price = sc_price;
            }

            public String getSearch_words() {
                return search_words;
            }

            public void setSearch_words(String search_words) {
                this.search_words = search_words;
            }

            public String getSeason() {
                return season;
            }

            public void setSeason(String season) {
                this.season = season;
            }

            public int getShelf_time() {
                return shelf_time;
            }

            public void setShelf_time(int shelf_time) {
                this.shelf_time = shelf_time;
            }

            public String getShelf_timeStr() {
                return shelf_timeStr;
            }

            public void setShelf_timeStr(String shelf_timeStr) {
                this.shelf_timeStr = shelf_timeStr;
            }

            public String getSmallpic() {
                return smallpic;
            }

            public void setSmallpic(String smallpic) {
                this.smallpic = smallpic;
            }

            public int getSort_id() {
                return sort_id;
            }

            public void setSort_id(int sort_id) {
                this.sort_id = sort_id;
            }

            public int getStart_time() {
                return start_time;
            }

            public void setStart_time(int start_time) {
                this.start_time = start_time;
            }

            public String getStart_timeStr() {
                return start_timeStr;
            }

            public void setStart_timeStr(String start_timeStr) {
                this.start_timeStr = start_timeStr;
            }

            public List<?> getImg_list() {
                return img_list;
            }

            public void setImg_list(List<?> img_list) {
                this.img_list = img_list;
            }
        }

        public static class PromolistBean {
            private String add_time;
            private int amount;
            private String amountStr;
            private int cid;
            private String cid_name;
            private String coupon_id;
            private String coupon_name;
            private String etime;
            private String goods_sn;
            private int id;
            private int in_use;
            private String memo;
            private String modeStr;
            private int modes;
            private int money;
            private String moneyStr;
            private String name;
            private int order_num;
            private int point;
            private String pointStr;
            private int sale;
            private String saleStr;
            private String shop;
            private String shopStr;
            private int status;
            private String stime;
            private int type;
            private String typeStr;
            private String url;
            private int way;
            private String wayStr;

            public String getAdd_time() {
                return add_time;
            }

            public void setAdd_time(String add_time) {
                this.add_time = add_time;
            }

            public int getAmount() {
                return amount;
            }

            public void setAmount(int amount) {
                this.amount = amount;
            }

            public String getAmountStr() {
                return amountStr;
            }

            public void setAmountStr(String amountStr) {
                this.amountStr = amountStr;
            }

            public int getCid() {
                return cid;
            }

            public void setCid(int cid) {
                this.cid = cid;
            }

            public String getCid_name() {
                return cid_name;
            }

            public void setCid_name(String cid_name) {
                this.cid_name = cid_name;
            }

            public String getCoupon_id() {
                return coupon_id;
            }

            public void setCoupon_id(String coupon_id) {
                this.coupon_id = coupon_id;
            }

            public String getCoupon_name() {
                return coupon_name;
            }

            public void setCoupon_name(String coupon_name) {
                this.coupon_name = coupon_name;
            }

            public String getEtime() {
                return etime;
            }

            public void setEtime(String etime) {
                this.etime = etime;
            }

            public String getGoods_sn() {
                return goods_sn;
            }

            public void setGoods_sn(String goods_sn) {
                this.goods_sn = goods_sn;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getIn_use() {
                return in_use;
            }

            public void setIn_use(int in_use) {
                this.in_use = in_use;
            }

            public String getMemo() {
                return memo;
            }

            public void setMemo(String memo) {
                this.memo = memo;
            }

            public String getModeStr() {
                return modeStr;
            }

            public void setModeStr(String modeStr) {
                this.modeStr = modeStr;
            }

            public int getModes() {
                return modes;
            }

            public void setModes(int modes) {
                this.modes = modes;
            }

            public int getMoney() {
                return money;
            }

            public void setMoney(int money) {
                this.money = money;
            }

            public String getMoneyStr() {
                return moneyStr;
            }

            public void setMoneyStr(String moneyStr) {
                this.moneyStr = moneyStr;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getOrder_num() {
                return order_num;
            }

            public void setOrder_num(int order_num) {
                this.order_num = order_num;
            }

            public int getPoint() {
                return point;
            }

            public void setPoint(int point) {
                this.point = point;
            }

            public String getPointStr() {
                return pointStr;
            }

            public void setPointStr(String pointStr) {
                this.pointStr = pointStr;
            }

            public int getSale() {
                return sale;
            }

            public void setSale(int sale) {
                this.sale = sale;
            }

            public String getSaleStr() {
                return saleStr;
            }

            public void setSaleStr(String saleStr) {
                this.saleStr = saleStr;
            }

            public String getShop() {
                return shop;
            }

            public void setShop(String shop) {
                this.shop = shop;
            }

            public String getShopStr() {
                return shopStr;
            }

            public void setShopStr(String shopStr) {
                this.shopStr = shopStr;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getStime() {
                return stime;
            }

            public void setStime(String stime) {
                this.stime = stime;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getTypeStr() {
                return typeStr;
            }

            public void setTypeStr(String typeStr) {
                this.typeStr = typeStr;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getWay() {
                return way;
            }

            public void setWay(int way) {
                this.way = way;
            }

            public String getWayStr() {
                return wayStr;
            }

            public void setWayStr(String wayStr) {
                this.wayStr = wayStr;
            }
        }

        public static class GoodsSpeciBean {
            private String barcode;
            private int class_id;
            private int color_id;
            private String color_name;
            private String flag;
            private int genre_id;
            /**
             * b_img : http://img.sanfu.com/img/goods/photos/big/1610/big201610141135163235.jpg
             * base_img : http://img.sanfu.com/img/goods/photos/base/1610/base201610141135163235.jpg
             * full_b_img : http://img.sanfu.com/img/goods/photos/big/1610/big201610141135163235.jpg
             * full_base_img : http://img.sanfu.com/img/goods/photos/base/1610/base201610141135163235.jpg
             * full_m_img : http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135163235.jpg
             * full_s_img : http://img.sanfu.com/img/goods/photos/small/1610/small201610141135163235.jpg
             * goods_id : 1894757
             * id : 2021098
             * isdefault : 1
             * m_img : http://img.sanfu.com/img/goods/photos/middle/1610/middle201610141135163235.jpg
             * s_img : http://img.sanfu.com/img/goods/photos/small/1610/small201610141135163235.jpg
             * tiny_img : http://img.sanfu.com/img/goods/photos/tiny/1610/tiny201610141135163235.jpg
             */

            private GoodsPhotoBean goodsPhoto;
            private int goods_id;
            private String goods_name;
            private int goods_sn;
            private int id;
            private int isvalid;
            private int num;
            private int number;
            private int photo_id;
            private int size_id;
            private String size_name;
            private int sort_id;
            private Object stock;

            public String getBarcode() {
                return barcode;
            }

            public void setBarcode(String barcode) {
                this.barcode = barcode;
            }

            public int getClass_id() {
                return class_id;
            }

            public void setClass_id(int class_id) {
                this.class_id = class_id;
            }

            public int getColor_id() {
                return color_id;
            }

            public void setColor_id(int color_id) {
                this.color_id = color_id;
            }

            public String getColor_name() {
                return color_name;
            }

            public void setColor_name(String color_name) {
                this.color_name = color_name;
            }

            public String getFlag() {
                return flag;
            }

            public void setFlag(String flag) {
                this.flag = flag;
            }

            public int getGenre_id() {
                return genre_id;
            }

            public void setGenre_id(int genre_id) {
                this.genre_id = genre_id;
            }

            public GoodsPhotoBean getGoodsPhoto() {
                return goodsPhoto;
            }

            public void setGoodsPhoto(GoodsPhotoBean goodsPhoto) {
                this.goodsPhoto = goodsPhoto;
            }

            public int getGoods_id() {
                return goods_id;
            }

            public void setGoods_id(int goods_id) {
                this.goods_id = goods_id;
            }

            public String getGoods_name() {
                return goods_name;
            }

            public void setGoods_name(String goods_name) {
                this.goods_name = goods_name;
            }

            public int getGoods_sn() {
                return goods_sn;
            }

            public void setGoods_sn(int goods_sn) {
                this.goods_sn = goods_sn;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getIsvalid() {
                return isvalid;
            }

            public void setIsvalid(int isvalid) {
                this.isvalid = isvalid;
            }

            public int getNum() {
                return num;
            }

            public void setNum(int num) {
                this.num = num;
            }

            public int getNumber() {
                return number;
            }

            public void setNumber(int number) {
                this.number = number;
            }

            public int getPhoto_id() {
                return photo_id;
            }

            public void setPhoto_id(int photo_id) {
                this.photo_id = photo_id;
            }

            public int getSize_id() {
                return size_id;
            }

            public void setSize_id(int size_id) {
                this.size_id = size_id;
            }

            public String getSize_name() {
                return size_name;
            }

            public void setSize_name(String size_name) {
                this.size_name = size_name;
            }

            public int getSort_id() {
                return sort_id;
            }

            public void setSort_id(int sort_id) {
                this.sort_id = sort_id;
            }

            public Object getStock() {
                return stock;
            }

            public void setStock(Object stock) {
                this.stock = stock;
            }

            public static class GoodsPhotoBean {
                private String b_img;
                private String base_img;
                private String full_b_img;
                private String full_base_img;
                private String full_m_img;
                private String full_s_img;
                private int goods_id;
                private int id;
                private int isdefault;
                private String m_img;
                private String s_img;
                private String tiny_img;

                public String getB_img() {
                    return b_img;
                }

                public void setB_img(String b_img) {
                    this.b_img = b_img;
                }

                public String getBase_img() {
                    return base_img;
                }

                public void setBase_img(String base_img) {
                    this.base_img = base_img;
                }

                public String getFull_b_img() {
                    return full_b_img;
                }

                public void setFull_b_img(String full_b_img) {
                    this.full_b_img = full_b_img;
                }

                public String getFull_base_img() {
                    return full_base_img;
                }

                public void setFull_base_img(String full_base_img) {
                    this.full_base_img = full_base_img;
                }

                public String getFull_m_img() {
                    return full_m_img;
                }

                public void setFull_m_img(String full_m_img) {
                    this.full_m_img = full_m_img;
                }

                public String getFull_s_img() {
                    return full_s_img;
                }

                public void setFull_s_img(String full_s_img) {
                    this.full_s_img = full_s_img;
                }

                public int getGoods_id() {
                    return goods_id;
                }

                public void setGoods_id(int goods_id) {
                    this.goods_id = goods_id;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getIsdefault() {
                    return isdefault;
                }

                public void setIsdefault(int isdefault) {
                    this.isdefault = isdefault;
                }

                public String getM_img() {
                    return m_img;
                }

                public void setM_img(String m_img) {
                    this.m_img = m_img;
                }

                public String getS_img() {
                    return s_img;
                }

                public void setS_img(String s_img) {
                    this.s_img = s_img;
                }

                public String getTiny_img() {
                    return tiny_img;
                }

                public void setTiny_img(String tiny_img) {
                    this.tiny_img = tiny_img;
                }
            }
        }
    }
}
