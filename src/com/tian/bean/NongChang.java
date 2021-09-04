package com.tian.bean;

import org.springframework.format.annotation.DateTimeFormat;

public class NongChang {
    private String name;
    private String price;
    private String count;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String time;

    @Override
    public String toString() {
        return "NongChang{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", count='" + count + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
