package com.example.sanfuproject.activity.entity;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

import static android.R.attr.id;

/**
 * Created by Hello on 2016/10/18.
 */

@Table(name = "shopcart", onCreated = "")//表名
public class ShopCart {

    @Column(
            name = "id",
            isId = true,
            autoGen = true,
            property = "NOT NULL"
    )
    public int id;

    //默认的构造方法必须写出，如果没有，这张表是创建不成功的
    public ShopCart() {
    }

    @Column(name = "img")
    public String imgUrl;

    @Column(name = "name")
    public String name;

    @Column(name = "size")
    public String size;

    @Column(name = "color")
    public String color;

    @Column(name = "price")
    public String price;

    @Column(name = "number")
    public String number;

    public ShopCart(String imgUrl, String name, String size, String color, String price, String number) {
        this.imgUrl = imgUrl;
        this.name = name;
        this.size = size;
        this.color = color;
        this.price = price;
        this.number = number;
    }

    public int get_id() {
        return id;
    }

    public void set_id(int _id) {
        this.id = _id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "ShopCart{" +
                "id=" + id +
                ", imgUrl='" + imgUrl + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price='" + price + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

}
