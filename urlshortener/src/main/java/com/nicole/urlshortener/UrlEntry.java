package com.nicole.urlshortener;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity // Creates database for this class
public class UrlEntry {

    @Id //Unique primary key
    private String shortCode;

    @Column(length=2048) 
    private String originalUrl;

    //Spring JPA - Empty constructor requirement
    public UrlEntry(){

    }

    //Constructor to create new entities
    public UrlEntry(String shortCode, String originalUrl){
        this.shortCode = shortCode;
        this.originalUrl = originalUrl;
    }

    //Getters
    public String getShortCode(){
        return shortCode;
    }

    public String getOriginalUrl(){
        return originalUrl;
    }

}
