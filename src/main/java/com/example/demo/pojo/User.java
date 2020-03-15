package com.example.demo.pojo;


public class User {
    private String id;

    private String level;

    private String  description;

    private String date;

    private String pic;

    public String getClasses() {
            return pic;
        }

    public void setClasses(String classes) {
            this.pic = classes;
        }

    public String getSex() {
        return description;
    }

    public void setSex(String sex) {
        this.description = sex;
    }

    public String getAge() {
        return date;
    }

    public void setAge(String age) {
        this.date = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return level;
    }

    public void setName(String name) {
        this.level = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", level='" + level + '\'' +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", pic='" + pic + '\'' +
                '}';
    }
}
