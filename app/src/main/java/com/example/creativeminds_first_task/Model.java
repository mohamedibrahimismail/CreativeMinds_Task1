package com.example.creativeminds_first_task;

public class Model {
    private String text;
    private int img;
    private boolean iscancelled;
    private String time;
    private String gender;
    private String type;
    private String number;
    private Boolean point;

    public Model(String text, int img, boolean iscancelled, String time, String gender, String type, String number, Boolean point) {
        this.text = text;
        this.img = img;
        this.iscancelled = iscancelled;
        this.time = time;
        this.gender = gender;
        this.type = type;
        this.number = number;
        this.point = point;
    }

    public Model(String text, int img, boolean iscancelled, String time, String gender, String type, String number) {
        this.text = text;
        this.img = img;
        this.iscancelled = iscancelled;
        this.time = time;
        this.gender = gender;
        this.type = type;
        this.number = number;
    }

    public Boolean getPoint() {
        return point;
    }

    public void setPoint(Boolean point) {
        this.point = point;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public boolean isIscancelled() {
        return iscancelled;
    }

    public void setIscancelled(boolean iscancelled) {
        this.iscancelled = iscancelled;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
