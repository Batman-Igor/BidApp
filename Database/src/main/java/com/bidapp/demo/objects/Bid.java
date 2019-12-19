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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
