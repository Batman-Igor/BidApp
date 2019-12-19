package com.bidapp.demo.objects;

public class Bid {

    private String title;
    private String data;
    private String dateOfCreation;
    private String status;

    public Bid() {
    }

    public Bid(String title, String data, String dateOfCreation, String status) {
        this.title = title;
        this.data = data;
        this.dateOfCreation = dateOfCreation;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Bid{");
        sb.append("title='").append(getTitle()).append('\'');
        sb.append(", data='").append(getData()).append('\'');
        sb.append(", dateOfCreation='").append(getDateOfCreation()).append('\'');
        sb.append(", status='").append(getStatus()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
