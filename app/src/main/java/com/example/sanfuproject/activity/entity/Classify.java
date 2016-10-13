package com.example.sanfuproject.activity.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Hello on 2016/10/12.
 */

public class Classify implements Serializable{

    /**
     * success : true
     * msg : {"category":[{"has_child":0,"icon":"","id":63,"img":"http://img.sanfu.com/img/goods/sort/201604071653075087.jpg","in_use":1,"list2":[{"has_child":0,"icon":"","id":75,"img":"http://img.sanfu.com/img/goods/sort/201603021132094607.png","in_use":1,"list2":[{"has_child":0,"icon":"","id":84,"img":"http://www.sanfu.com/upload/index3/201510121457511921.jpg","in_use":1,"list2":[],"name":"马甲","pid":75,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":88,"img":"http://www.sanfu.com/upload/index3/201510121458204486.jpg","in_use":1,"list2":[],"name":"皮衣","pid":75,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":91,"img":"http://www.sanfu.com/upload/index3/201510121458465752.jpg","in_use":1,"list2":[],"name":"羽绒","pid":75,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":86,"img":"http://www.sanfu.com/upload/index3/201510121458101001.jpg","in_use":1,"list2":[],"name":"大衣/风衣","pid":75,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":89,"img":"http://www.sanfu.com/upload/index3/201510121458312844.jpg","in_use":1,"list2":[],"name":"夹克","pid":75,"seq":2,"type":1,"url":""},{"has_child":0,"icon":"","id":85,"img":"http://img.sanfu.com/img/goods/sort/201602151112308814.jpg","in_use":1,"list2":[],"name":"西装","pid":75,"seq":4,"type":1,"url":""},{"has_child":0,"icon":"","id":90,"img":"http://www.sanfu.com/upload/index3/201510121458384346.jpg","in_use":1,"list2":[],"name":"棉服","pid":75,"seq":5,"type":1,"url":""}],"name":"外套","pid":63,"seq":1,"type":1,"url":""},{"has_child":0,"icon":"","id":77,"img":"http://img.sanfu.com/img/goods/sort/201603021132586380.png","in_use":1,"list2":[{"has_child":0,"icon":"","id":95,"img":"http://www.sanfu.com/upload/index3/201510121500221667.jpg","in_use":1,"list2":[],"name":"套头卫衣","pid":77,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":94,"img":"http://www.sanfu.com/upload/index3/201510121500001550.jpg","in_use":1,"list2":[],"name":"开衫卫衣","pid":77,"seq":0,"type":1,"url":""}],"name":"卫衣","pid":63,"seq":2,"type":1,"url":""},{"has_child":0,"icon":"","id":76,"img":"http://img.sanfu.com/img/goods/sort/201603021132479072.png","in_use":1,"list2":[{"has_child":0,"icon":"","id":93,"img":"http://www.sanfu.com/upload/index3/201510121459126740.jpg","in_use":1,"list2":[],"name":"套头毛衣","pid":76,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":92,"img":"http://www.sanfu.com/upload/index3/201510121459033347.jpg","in_use":1,"list2":[],"name":"开衫毛衣","pid":76,"seq":0,"type":1,"url":""}],"name":"针织衫","pid":63,"seq":3,"type":1,"url":""},{"has_child":0,"icon":"","id":70,"img":"http://img.sanfu.com/img/goods/sort/201605061705024882.png","in_use":1,"list2":[{"has_child":0,"icon":"","id":71,"img":"http://www.sanfu.com/upload/index3/201510121449208575.jpg","in_use":1,"list2":[],"name":"短袖T恤","pid":70,"seq":1,"type":1,"url":""},{"has_child":0,"icon":"","id":181186,"img":"http://img.sanfu.com/img/goods/sort/201607121015143350.jpg","in_use":1,"list2":[],"name":"背心","pid":70,"seq":2,"type":1,"url":""},{"has_child":0,"icon":"","id":81,"img":"http://www.sanfu.com/upload/index3/201510121449290681.jpg","in_use":1,"list2":[],"name":"长袖T恤","pid":70,"seq":3,"type":1,"url":""}],"name":"T恤","pid":63,"seq":4,"type":1,"url":""},{"has_child":0,"icon":"","id":72,"img":"http://img.sanfu.com/img/goods/sort/201603021131588223.png","in_use":1,"list2":[{"has_child":0,"icon":"","id":83,"img":"http://www.sanfu.com/upload/index3/201510121456521689.jpg","in_use":1,"list2":[],"name":"长袖衬衣","pid":72,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":82,"img":"http://www.sanfu.com/upload/index3/201510121449560722.jpg","in_use":1,"list2":[],"name":"短袖衬衣","pid":72,"seq":0,"type":1,"url":""}],"name":"衬衣","pid":63,"seq":5,"type":1,"url":""},{"has_child":0,"icon":"","id":78,"img":"http://img.sanfu.com/img/goods/sort/201603021133102370.png","in_use":1,"list2":[{"has_child":0,"icon":"","id":96,"img":"http://www.sanfu.com/upload/index3/201510121500449602.jpg","in_use":1,"list2":[],"name":"长裤","pid":78,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":98,"img":"http://www.sanfu.com/upload/index3/201510121501025707.jpg","in_use":1,"list2":[],"name":"短裤","pid":78,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":97,"img":"http://www.sanfu.com/upload/index3/201510121500546723.jpg","in_use":1,"list2":[],"name":"分裤","pid":78,"seq":0,"type":1,"url":""}],"name":"休闲裤","pid":63,"seq":6,"type":1,"url":""},{"has_child":0,"icon":"","id":79,"img":"http://img.sanfu.com/img/goods/sort/201603021133347251.png","in_use":1,"list2":[{"has_child":0,"icon":"","id":99,"img":"http://www.sanfu.com/upload/index3/201510121505089055.jpg","in_use":1,"list2":[],"name":"长裤","pid":79,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":101,"img":"http://www.sanfu.com/upload/index3/201510121505281427.jpg","in_use":1,"list2":[],"name":"短裤","pid":79,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":100,"img":"http://www.sanfu.com/upload/index3/201510121505195273.jpg","in_use":1,"list2":[],"name":"分裤","pid":79,"seq":0,"type":1,"url":""}],"name":"牛仔裤","pid":63,"seq":7,"type":1,"url":""}],"name":"男装","pid":0,"seq":2,"type":1,"url":""},{"has_child":0,"icon":"","id":64,"img":"http://img.sanfu.com/img/goods/sort/201604071654576600.jpg","in_use":1,"list2":[{"has_child":0,"icon":"","id":105,"img":"http://img.sanfu.com/img/goods/sort/201605061706583778.png","in_use":1,"list2":[{"has_child":0,"icon":"","id":120,"img":"http://www.sanfu.com/upload/index3/201510121511145751.jpg","in_use":1,"list2":[],"name":"马甲","pid":105,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":122,"img":"http://www.sanfu.com/upload/index3/201510121511290644.jpg","in_use":1,"list2":[],"name":"大衣/风衣","pid":105,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":128,"img":"http://www.sanfu.com/upload/index3/201510121512146268.jpg","in_use":1,"list2":[],"name":"皮衣","pid":105,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":125,"img":"http://www.sanfu.com/upload/index3/201510121511483171.jpg","in_use":1,"list2":[],"name":"棉服","pid":105,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":127,"img":"http://www.sanfu.com/upload/index3/201510121512071364.jpg","in_use":1,"list2":[],"name":"披肩","pid":105,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":121,"img":"http://www.sanfu.com/upload/index3/201510121511237112.jpg","in_use":1,"list2":[],"name":"夹克","pid":105,"seq":4,"type":1,"url":""},{"has_child":0,"icon":"","id":124,"img":"http://www.sanfu.com/upload/index3/201510121511405191.jpg","in_use":1,"list2":[],"name":"西装","pid":105,"seq":7,"type":1,"url":""}],"name":"外套","pid":64,"seq":1,"type":1,"url":""},{"has_child":0,"icon":"","id":108,"img":"http://img.sanfu.com/img/goods/sort/201605061707259031.png","in_use":1,"list2":[{"has_child":0,"icon":"","id":132,"img":"http://www.sanfu.com/upload/index3/201510121513015540.jpg","in_use":1,"list2":[],"name":"套头卫衣","pid":108,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":131,"img":"http://www.sanfu.com/upload/index3/201510121512500646.jpg","in_use":1,"list2":[],"name":"开衫卫衣","pid":108,"seq":0,"type":1,"url":""}],"name":"卫衣","pid":64,"seq":2,"type":1,"url":""},{"has_child":0,"icon":"","id":111,"img":"http://img.sanfu.com/img/goods/sort/201605061707507633.png","in_use":1,"list2":[{"has_child":0,"icon":"","id":143,"img":"http://www.sanfu.com/upload/index3/201510141735250575.jpg","in_use":1,"list2":[],"name":"半裙","pid":111,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":142,"img":"http://www.sanfu.com/upload/index3/201510141735080936.jpg","in_use":1,"list2":[],"name":"连衣裙/套装","pid":111,"seq":0,"type":1,"url":""}],"name":"裙装/套装","pid":64,"seq":3,"type":1,"url":""},{"has_child":0,"icon":"","id":107,"img":"http://img.sanfu.com/img/goods/sort/201605061707157370.png","in_use":1,"list2":[{"has_child":0,"icon":"","id":130,"img":"http://www.sanfu.com/upload/index3/201510121512398541.jpg","in_use":1,"list2":[],"name":"套头毛衣","pid":107,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":129,"img":"http://www.sanfu.com/upload/index3/201510121512323283.jpg","in_use":1,"list2":[],"name":"开衫毛衣","pid":107,"seq":0,"type":1,"url":""}],"name":"针织衫","pid":64,"seq":4,"type":1,"url":""},{"has_child":0,"icon":"","id":102,"img":"http://img.sanfu.com/img/goods/sort/201605061706216527.png","in_use":1,"list2":[{"has_child":0,"icon":"","id":112,"img":"http://www.sanfu.com/upload/index3/201510121506227818.jpg","in_use":1,"list2":[],"name":"短袖T恤","pid":102,"seq":1,"type":1,"url":""},{"has_child":0,"icon":"","id":181187,"img":"http://img.sanfu.com/img/goods/sort/201607121015531307.jpg","in_use":1,"list2":[],"name":"背心/吊带","pid":102,"seq":2,"type":1,"url":""},{"has_child":0,"icon":"","id":113,"img":"http://www.sanfu.com/upload/index3/201510121506337077.jpg","in_use":1,"list2":[],"name":"长袖T恤","pid":102,"seq":3,"type":1,"url":""}],"name":"T恤","pid":64,"seq":5,"type":1,"url":""},{"has_child":0,"icon":"","id":104,"img":"http://img.sanfu.com/img/goods/sort/201605061706492364.png","in_use":1,"list2":[{"has_child":0,"icon":"","id":116,"img":"http://www.sanfu.com/upload/index3/201510121510369797.jpg","in_use":1,"list2":[],"name":"短袖衬衣","pid":104,"seq":1,"type":1,"url":""},{"has_child":0,"icon":"","id":117,"img":"http://www.sanfu.com/upload/index3/201510121510472152.jpg","in_use":1,"list2":[],"name":"长袖衬衣","pid":104,"seq":2,"type":1,"url":""}],"name":"衬衣","pid":64,"seq":6,"type":1,"url":""},{"has_child":0,"icon":"","id":109,"img":"http://img.sanfu.com/img/goods/sort/201605061707373812.png","in_use":1,"list2":[{"has_child":0,"icon":"","id":133,"img":"http://www.sanfu.com/upload/index3/201510121513172221.jpg","in_use":1,"list2":[],"name":"连体/背带裤","pid":109,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":134,"img":"http://www.sanfu.com/upload/index3/201510121513269160.jpg","in_use":1,"list2":[],"name":"长裤","pid":109,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":137,"img":"http://www.sanfu.com/upload/index3/201510121514021573.jpg","in_use":1,"list2":[],"name":"短裤","pid":109,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":136,"img":"http://www.sanfu.com/upload/index3/201510121513472145.jpg","in_use":1,"list2":[],"name":"打底裤","pid":109,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":135,"img":"http://www.sanfu.com/upload/index3/201510121513362680.jpg","in_use":1,"list2":[],"name":"分裤","pid":109,"seq":0,"type":1,"url":""}],"name":"休闲裤","pid":64,"seq":7,"type":1,"url":""},{"has_child":0,"icon":"","id":110,"img":"http://img.sanfu.com/img/goods/sort/201603021136119294.png","in_use":1,"list2":[{"has_child":0,"icon":"","id":138,"img":"http://www.sanfu.com/upload/index3/201510121514222441.jpg","in_use":1,"list2":[],"name":"连体/背带裤","pid":110,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":141,"img":"http://www.sanfu.com/upload/index3/201510121514521494.jpg","in_use":1,"list2":[],"name":"短裤","pid":110,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":140,"img":"http://www.sanfu.com/upload/index3/201510121514437825.jpg","in_use":1,"list2":[],"name":"分裤","pid":110,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":139,"img":"http://www.sanfu.com/upload/index3/201510121514341695.jpg","in_use":1,"list2":[],"name":"长裤","pid":110,"seq":0,"type":1,"url":""}],"name":"牛仔裤","pid":64,"seq":8,"type":1,"url":""}],"name":"女装","pid":0,"seq":3,"type":1,"url":""},{"has_child":0,"icon":"","id":67,"img":"http://img.sanfu.com/img/goods/sort/201604071655302782.jpg","in_use":1,"list2":[{"has_child":0,"icon":"","id":162,"img":"http://img.sanfu.com/img/goods/sort/201607121401343655.png","in_use":1,"list2":[{"has_child":0,"icon":"","id":165,"img":"http://www.sanfu.com/upload/index3/201510121529449861.jpg","in_use":1,"list2":[],"name":"男士家居","pid":162,"seq":1,"type":1,"url":""},{"has_child":0,"icon":"","id":166,"img":"http://www.sanfu.com/upload/index3/201510121529508825.jpg","in_use":1,"list2":[],"name":"女士家居","pid":162,"seq":2,"type":1,"url":""}],"name":"家居服","pid":67,"seq":1,"type":1,"url":""},{"has_child":0,"icon":"","id":157,"img":"http://img.sanfu.com/img/goods/sort/201607121400439614.png","in_use":1,"list2":[{"has_child":0,"icon":"","id":220,"img":"http://www.sanfu.com/upload/index3/201510121529038772.jpg","in_use":1,"list2":[],"name":"文胸","pid":157,"seq":1,"type":1,"url":""},{"has_child":0,"icon":"","id":526,"img":"http://www.sanfu.com/upload/index3/201510121529144599.jpg","in_use":1,"list2":[],"name":"居家背心","pid":157,"seq":2,"type":1,"url":""}],"name":"内衣","pid":67,"seq":2,"type":1,"url":""},{"has_child":0,"icon":"","id":159,"img":"http://img.sanfu.com/img/goods/sort/201605101514039632.png","in_use":1,"list2":[{"has_child":0,"icon":"","id":163,"img":"http://www.sanfu.com/upload/index3/201511061620215255.jpg","in_use":1,"list2":[],"name":"男内裤","pid":159,"seq":4,"type":1,"url":""},{"has_child":0,"icon":"","id":164,"img":"http://www.sanfu.com/upload/index3/201510121529280887.jpg","in_use":1,"list2":[],"name":"女内裤","pid":159,"seq":5,"type":1,"url":""}],"name":"内裤","pid":67,"seq":3,"type":1,"url":""},{"has_child":0,"icon":"","id":168,"img":"http://img.sanfu.com/img/goods/sort/201605101514101267.png","in_use":1,"list2":[{"has_child":0,"icon":"","id":171,"img":"http://www.sanfu.com/upload/index3/201510121529554841.jpg","in_use":1,"list2":[],"name":"男袜","pid":168,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":499,"img":"http://www.sanfu.com/upload/index3/201510121530113234.jpg","in_use":1,"list2":[],"name":"打底裤/丝袜","pid":168,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":172,"img":"http://www.sanfu.com/upload/index3/201510121530036906.jpg","in_use":1,"list2":[],"name":"女袜","pid":168,"seq":0,"type":1,"url":""}],"name":"袜子","pid":67,"seq":4,"type":1,"url":""}],"name":"家居 内衣","pid":0,"seq":4,"type":1,"url":""},{"has_child":0,"icon":"","id":65,"img":"http://img.sanfu.com/img/goods/sort/201605101506114455.jpg","in_use":1,"list2":[{"has_child":0,"icon":"","id":330,"img":"http://img.sanfu.com/img/goods/sort/201605101511053799.png","in_use":1,"list2":[{"has_child":0,"icon":"","id":331,"img":"http://www.sanfu.com/upload/index3/201510121527440055.jpg","in_use":1,"list2":[],"name":"钱包","pid":330,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":460,"img":"http://www.sanfu.com/upload/index3/201510121528037150.jpg","in_use":1,"list2":[],"name":"手提包","pid":330,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":333,"img":"http://www.sanfu.com/upload/index3/201510121527589330.jpg","in_use":1,"list2":[],"name":"单肩包","pid":330,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":332,"img":"http://www.sanfu.com/upload/index3/201510121527513518.jpg","in_use":1,"list2":[],"name":"双肩包","pid":330,"seq":0,"type":1,"url":""}],"name":"女包","pid":65,"seq":1,"type":1,"url":""},{"has_child":0,"icon":"","id":147,"img":"http://img.sanfu.com/img/goods/sort/201605101509388171.png","in_use":1,"list2":[{"has_child":0,"icon":"","id":177,"img":"http://www.sanfu.com/upload/index3/201510121515401853.jpg","in_use":1,"list2":[],"name":"单鞋","pid":147,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":178,"img":"http://www.sanfu.com/upload/index3/201510121515477038.jpg","in_use":1,"list2":[],"name":"凉鞋","pid":147,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":181,"img":"http://www.sanfu.com/upload/index3/201510121516123093.jpg","in_use":1,"list2":[],"name":"靴","pid":147,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":180,"img":"http://www.sanfu.com/upload/index3/201510121516025299.jpg","in_use":1,"list2":[],"name":"休闲鞋","pid":147,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":179,"img":"http://www.sanfu.com/upload/index3/201510121515546927.jpg","in_use":1,"list2":[],"name":"拖鞋","pid":147,"seq":0,"type":1,"url":""}],"name":"女鞋","pid":65,"seq":2,"type":1,"url":""},{"has_child":0,"icon":"","id":1401185,"img":"http://img.sanfu.com/img/goods/sort/201609211616108905.png","in_use":1,"list2":[{"has_child":0,"icon":"","id":1401186,"img":"","in_use":1,"list2":[],"name":"彩妆","pid":1401185,"seq":1,"type":1,"url":""},{"has_child":0,"icon":"","id":1401187,"img":"","in_use":1,"list2":[],"name":"护肤","pid":1401185,"seq":2,"type":1,"url":""},{"has_child":0,"icon":"","id":1401188,"img":"","in_use":1,"list2":[],"name":"美容用具","pid":1401185,"seq":3,"type":1,"url":""}],"name":"美妆护肤","pid":65,"seq":3,"type":1,"url":""},{"has_child":0,"icon":"","id":155,"img":"http://img.sanfu.com/img/goods/sort/201605101510474035.png","in_use":1,"list2":[{"has_child":0,"icon":"","id":182,"img":"http://www.sanfu.com/upload/index3/201510121517160560.jpg","in_use":1,"list2":[],"name":"凉鞋","pid":155,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":184,"img":"http://www.sanfu.com/upload/index3/201510121517323049.jpg","in_use":1,"list2":[],"name":"拖鞋","pid":155,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":185,"img":"http://www.sanfu.com/upload/index3/201510121517391036.jpg","in_use":1,"list2":[],"name":"休闲鞋","pid":155,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":186,"img":"http://www.sanfu.com/upload/index3/201510121517452443.jpg","in_use":1,"list2":[],"name":"靴","pid":155,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":1421185,"img":"","in_use":1,"list2":[],"name":"双肩包","pid":155,"seq":1,"type":1,"url":""},{"has_child":0,"icon":"","id":1421186,"img":"","in_use":1,"list2":[],"name":"单肩包","pid":155,"seq":2,"type":1,"url":""},{"has_child":0,"icon":"","id":1421187,"img":"","in_use":1,"list2":[],"name":"钱包","pid":155,"seq":3,"type":1,"url":""}],"name":"男士鞋包","pid":65,"seq":4,"type":1,"url":""},{"has_child":0,"icon":"","id":144,"img":"http://img.sanfu.com/img/goods/sort/201605061711391806.png","in_use":1,"list2":[{"has_child":0,"icon":"","id":175,"img":"http://www.sanfu.com/upload/index3/201510121515180768.jpg","in_use":1,"list2":[],"name":"男帽","pid":144,"seq":1,"type":1,"url":""},{"has_child":0,"icon":"","id":176,"img":"http://www.sanfu.com/upload/index3/201510121515251887.jpg","in_use":1,"list2":[],"name":"女帽","pid":144,"seq":2,"type":1,"url":""}],"name":"帽子","pid":65,"seq":5,"type":1,"url":""},{"has_child":0,"icon":"","id":149,"img":"http://img.sanfu.com/img/goods/sort/201605101510202946.png","in_use":1,"list2":[{"has_child":0,"icon":"","id":188,"img":"http://www.sanfu.com/upload/index3/201510121516373745.jpg","in_use":1,"list2":[],"name":"女士腰带","pid":149,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":187,"img":"http://www.sanfu.com/upload/index3/201510121516313472.jpg","in_use":1,"list2":[],"name":"男士腰带","pid":149,"seq":0,"type":1,"url":""}],"name":"腰带","pid":65,"seq":5,"type":1,"url":""},{"has_child":0,"icon":"","id":194,"img":"http://img.sanfu.com/img/goods/sort/201608261127040381.png","in_use":1,"list2":[{"has_child":0,"icon":"","id":195,"img":"http://www.sanfu.com/upload/index3/201510121517581334.jpg","in_use":1,"list2":[],"name":"围巾/耳暖","pid":194,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":196,"img":"http://www.sanfu.com/upload/index3/201510121518062426.jpg","in_use":1,"list2":[],"name":"雨伞/鞋垫","pid":194,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":197,"img":"http://www.sanfu.com/upload/index3/201510121518169138.jpg","in_use":1,"list2":[],"name":"杯子/餐具","pid":194,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":493,"img":"http://www.sanfu.com/upload/index3/201510121518338874.jpg","in_use":1,"list2":[],"name":"抱枕/毛公仔/玩具","pid":194,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":505,"img":"http://www.sanfu.com/upload/index3/201510121518510005.jpg","in_use":1,"list2":[],"name":"小家电/家居/数码","pid":194,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":631,"img":"http://www.sanfu.com/upload/index3/201510121519239342.jpg","in_use":1,"list2":[],"name":"收纳用具","pid":194,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":570,"img":"http://www.sanfu.com/upload/index3/201510121519100526.jpg","in_use":1,"list2":[],"name":"文具类","pid":194,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":580,"img":"http://www.sanfu.com/upload/index3/201510121519171303.jpg","in_use":1,"list2":[],"name":"口罩/手套/防晒类","pid":194,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":81185,"img":"http://img.sanfu.com/img/goods/sort/201607121428533880.jpg","in_use":1,"list2":[],"name":"饰品/眼镜","pid":194,"seq":2,"type":1,"url":""},{"has_child":0,"icon":"","id":201185,"img":"","in_use":1,"list2":[],"name":"手绘","pid":194,"seq":3,"type":1,"url":""}],"name":"饰品/家居用品","pid":65,"seq":6,"type":1,"url":""}],"name":"化妆 鞋包","pid":0,"seq":5,"type":1,"url":""}]}
     * key : vyherruxokhhkgo
     * sign : 9F6F20121A7659CA3CBD2AC2799DE049
     * length : 20413
     */

    private boolean success;
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
        /**
         * has_child : 0
         * icon :
         * id : 63
         * img : http://img.sanfu.com/img/goods/sort/201604071653075087.jpg
         * in_use : 1
         * list2 : [{"has_child":0,"icon":"","id":75,"img":"http://img.sanfu.com/img/goods/sort/201603021132094607.png","in_use":1,"list2":[{"has_child":0,"icon":"","id":84,"img":"http://www.sanfu.com/upload/index3/201510121457511921.jpg","in_use":1,"list2":[],"name":"马甲","pid":75,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":88,"img":"http://www.sanfu.com/upload/index3/201510121458204486.jpg","in_use":1,"list2":[],"name":"皮衣","pid":75,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":91,"img":"http://www.sanfu.com/upload/index3/201510121458465752.jpg","in_use":1,"list2":[],"name":"羽绒","pid":75,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":86,"img":"http://www.sanfu.com/upload/index3/201510121458101001.jpg","in_use":1,"list2":[],"name":"大衣/风衣","pid":75,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":89,"img":"http://www.sanfu.com/upload/index3/201510121458312844.jpg","in_use":1,"list2":[],"name":"夹克","pid":75,"seq":2,"type":1,"url":""},{"has_child":0,"icon":"","id":85,"img":"http://img.sanfu.com/img/goods/sort/201602151112308814.jpg","in_use":1,"list2":[],"name":"西装","pid":75,"seq":4,"type":1,"url":""},{"has_child":0,"icon":"","id":90,"img":"http://www.sanfu.com/upload/index3/201510121458384346.jpg","in_use":1,"list2":[],"name":"棉服","pid":75,"seq":5,"type":1,"url":""}],"name":"外套","pid":63,"seq":1,"type":1,"url":""},{"has_child":0,"icon":"","id":77,"img":"http://img.sanfu.com/img/goods/sort/201603021132586380.png","in_use":1,"list2":[{"has_child":0,"icon":"","id":95,"img":"http://www.sanfu.com/upload/index3/201510121500221667.jpg","in_use":1,"list2":[],"name":"套头卫衣","pid":77,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":94,"img":"http://www.sanfu.com/upload/index3/201510121500001550.jpg","in_use":1,"list2":[],"name":"开衫卫衣","pid":77,"seq":0,"type":1,"url":""}],"name":"卫衣","pid":63,"seq":2,"type":1,"url":""},{"has_child":0,"icon":"","id":76,"img":"http://img.sanfu.com/img/goods/sort/201603021132479072.png","in_use":1,"list2":[{"has_child":0,"icon":"","id":93,"img":"http://www.sanfu.com/upload/index3/201510121459126740.jpg","in_use":1,"list2":[],"name":"套头毛衣","pid":76,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":92,"img":"http://www.sanfu.com/upload/index3/201510121459033347.jpg","in_use":1,"list2":[],"name":"开衫毛衣","pid":76,"seq":0,"type":1,"url":""}],"name":"针织衫","pid":63,"seq":3,"type":1,"url":""},{"has_child":0,"icon":"","id":70,"img":"http://img.sanfu.com/img/goods/sort/201605061705024882.png","in_use":1,"list2":[{"has_child":0,"icon":"","id":71,"img":"http://www.sanfu.com/upload/index3/201510121449208575.jpg","in_use":1,"list2":[],"name":"短袖T恤","pid":70,"seq":1,"type":1,"url":""},{"has_child":0,"icon":"","id":181186,"img":"http://img.sanfu.com/img/goods/sort/201607121015143350.jpg","in_use":1,"list2":[],"name":"背心","pid":70,"seq":2,"type":1,"url":""},{"has_child":0,"icon":"","id":81,"img":"http://www.sanfu.com/upload/index3/201510121449290681.jpg","in_use":1,"list2":[],"name":"长袖T恤","pid":70,"seq":3,"type":1,"url":""}],"name":"T恤","pid":63,"seq":4,"type":1,"url":""},{"has_child":0,"icon":"","id":72,"img":"http://img.sanfu.com/img/goods/sort/201603021131588223.png","in_use":1,"list2":[{"has_child":0,"icon":"","id":83,"img":"http://www.sanfu.com/upload/index3/201510121456521689.jpg","in_use":1,"list2":[],"name":"长袖衬衣","pid":72,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":82,"img":"http://www.sanfu.com/upload/index3/201510121449560722.jpg","in_use":1,"list2":[],"name":"短袖衬衣","pid":72,"seq":0,"type":1,"url":""}],"name":"衬衣","pid":63,"seq":5,"type":1,"url":""},{"has_child":0,"icon":"","id":78,"img":"http://img.sanfu.com/img/goods/sort/201603021133102370.png","in_use":1,"list2":[{"has_child":0,"icon":"","id":96,"img":"http://www.sanfu.com/upload/index3/201510121500449602.jpg","in_use":1,"list2":[],"name":"长裤","pid":78,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":98,"img":"http://www.sanfu.com/upload/index3/201510121501025707.jpg","in_use":1,"list2":[],"name":"短裤","pid":78,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":97,"img":"http://www.sanfu.com/upload/index3/201510121500546723.jpg","in_use":1,"list2":[],"name":"分裤","pid":78,"seq":0,"type":1,"url":""}],"name":"休闲裤","pid":63,"seq":6,"type":1,"url":""},{"has_child":0,"icon":"","id":79,"img":"http://img.sanfu.com/img/goods/sort/201603021133347251.png","in_use":1,"list2":[{"has_child":0,"icon":"","id":99,"img":"http://www.sanfu.com/upload/index3/201510121505089055.jpg","in_use":1,"list2":[],"name":"长裤","pid":79,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":101,"img":"http://www.sanfu.com/upload/index3/201510121505281427.jpg","in_use":1,"list2":[],"name":"短裤","pid":79,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":100,"img":"http://www.sanfu.com/upload/index3/201510121505195273.jpg","in_use":1,"list2":[],"name":"分裤","pid":79,"seq":0,"type":1,"url":""}],"name":"牛仔裤","pid":63,"seq":7,"type":1,"url":""}]
         * name : 男装
         * pid : 0
         * seq : 2
         * type : 1
         * url :
         */

        private List<CategoryBean> category;

        public List<CategoryBean> getCategory() {
            return category;
        }

        public void setCategory(List<CategoryBean> category) {
            this.category = category;
        }

        public static class CategoryBean {
            private int has_child;
            private String icon;
            private int id;
            private String img;
            private int in_use;
            private String name;
            private int pid;
            private int seq;
            private int type;
            private String url;
            /**
             * has_child : 0
             * icon :
             * id : 75
             * img : http://img.sanfu.com/img/goods/sort/201603021132094607.png
             * in_use : 1
             * list2 : [{"has_child":0,"icon":"","id":84,"img":"http://www.sanfu.com/upload/index3/201510121457511921.jpg","in_use":1,"list2":[],"name":"马甲","pid":75,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":88,"img":"http://www.sanfu.com/upload/index3/201510121458204486.jpg","in_use":1,"list2":[],"name":"皮衣","pid":75,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":91,"img":"http://www.sanfu.com/upload/index3/201510121458465752.jpg","in_use":1,"list2":[],"name":"羽绒","pid":75,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":86,"img":"http://www.sanfu.com/upload/index3/201510121458101001.jpg","in_use":1,"list2":[],"name":"大衣/风衣","pid":75,"seq":0,"type":1,"url":""},{"has_child":0,"icon":"","id":89,"img":"http://www.sanfu.com/upload/index3/201510121458312844.jpg","in_use":1,"list2":[],"name":"夹克","pid":75,"seq":2,"type":1,"url":""},{"has_child":0,"icon":"","id":85,"img":"http://img.sanfu.com/img/goods/sort/201602151112308814.jpg","in_use":1,"list2":[],"name":"西装","pid":75,"seq":4,"type":1,"url":""},{"has_child":0,"icon":"","id":90,"img":"http://www.sanfu.com/upload/index3/201510121458384346.jpg","in_use":1,"list2":[],"name":"棉服","pid":75,"seq":5,"type":1,"url":""}]
             * name : 外套
             * pid : 63
             * seq : 1
             * type : 1
             * url :
             */

            private List<List2Bean> list2;

            public int getHas_child() {
                return has_child;
            }

            public void setHas_child(int has_child) {
                this.has_child = has_child;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public int getIn_use() {
                return in_use;
            }

            public void setIn_use(int in_use) {
                this.in_use = in_use;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getPid() {
                return pid;
            }

            public void setPid(int pid) {
                this.pid = pid;
            }

            public int getSeq() {
                return seq;
            }

            public void setSeq(int seq) {
                this.seq = seq;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public List<List2Bean> getList2() {
                return list2;
            }

            public void setList2(List<List2Bean> list2) {
                this.list2 = list2;
            }

            public static class List2Bean {
                private int has_child;
                private String icon;
                private int id;
                private String img;
                private int in_use;
                private String name;
                private int pid;
                private int seq;
                private int type;
                private String url;
                /**
                 * has_child : 0
                 * icon :
                 * id : 84
                 * img : http://www.sanfu.com/upload/index3/201510121457511921.jpg
                 * in_use : 1
                 * list2 : []
                 * name : 马甲
                 * pid : 75
                 * seq : 0
                 * type : 1
                 * url :
                 */

                private List<List2Bean> list2;

                public int getHas_child() {
                    return has_child;
                }

                public void setHas_child(int has_child) {
                    this.has_child = has_child;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getImg() {
                    return img;
                }

                public void setImg(String img) {
                    this.img = img;
                }

                public int getIn_use() {
                    return in_use;
                }

                public void setIn_use(int in_use) {
                    this.in_use = in_use;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getPid() {
                    return pid;
                }

                public void setPid(int pid) {
                    this.pid = pid;
                }

                public int getSeq() {
                    return seq;
                }

                public void setSeq(int seq) {
                    this.seq = seq;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public List<List2Bean> getList2() {
                    return list2;
                }

                public void setList2(List<List2Bean> list2) {
                    this.list2 = list2;
                }

                public static class List22Bean {
                    private int has_child;
                    private String icon;
                    private int id;
                    private String img;
                    private int in_use;
                    private String name;
                    private int pid;
                    private int seq;
                    private int type;
                    private String url;
                    private List<?> list2;

                    public int getHas_child() {
                        return has_child;
                    }

                    public void setHas_child(int has_child) {
                        this.has_child = has_child;
                    }

                    public String getIcon() {
                        return icon;
                    }

                    public void setIcon(String icon) {
                        this.icon = icon;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getImg() {
                        return img;
                    }

                    public void setImg(String img) {
                        this.img = img;
                    }

                    public int getIn_use() {
                        return in_use;
                    }

                    public void setIn_use(int in_use) {
                        this.in_use = in_use;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public int getPid() {
                        return pid;
                    }

                    public void setPid(int pid) {
                        this.pid = pid;
                    }

                    public int getSeq() {
                        return seq;
                    }

                    public void setSeq(int seq) {
                        this.seq = seq;
                    }

                    public int getType() {
                        return type;
                    }

                    public void setType(int type) {
                        this.type = type;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public List<?> getList2() {
                        return list2;
                    }

                    public void setList2(List<?> list2) {
                        this.list2 = list2;
                    }
                }
            }
        }
    }
}

