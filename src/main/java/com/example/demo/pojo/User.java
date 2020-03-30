package com.example.demo.pojo;

public class User {
    private String id;

    private String level;

    private String description;

    private String date;

    private String pic;

    public String getPic() {
            return pic;
        }

    public void setPic(String pic) {
            this.pic = pic;
        }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
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
