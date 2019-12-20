package com.binapp.demo.objects;

/**
 * Created by Allan on 21.12.2019.
 */
public class UpdatesInfo {

    private String title;
    private String date;
    private String status;

    public UpdatesInfo() {
    }

    public UpdatesInfo(String title, String date, String status) {
        this.title = title;
        this.date = date;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
