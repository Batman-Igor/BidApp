package com.bidapp.demo.objects;

import javax.persistence.*;

@Entity
@Table(name = "Bids")
public class Bid {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String data;
    private String email;
    private String dateOfCreation;
    private String status;

    public Bid() {
    }

    public Bid(String title, String data, String email, String dateOfCreation, String status) {
        this.title = title;
        this.data = data;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        StringBuffer sb = new StringBuffer("Bid{");
        sb.append("title='").append(getTitle()).append('\'');
        sb.append(", data='").append(getData()).append('\'');
        sb.append(", email='").append(getEmail()).append('\'');
        sb.append(", dateOfCreation='").append(getDateOfCreation()).append('\'');
        sb.append(", status='").append(getStatus()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
