package com.example.foodtruck.pojo;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "CID")
    private String CID;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "email",nullable = false)
    private String email;
    @Column(name = "phone",nullable = false)
    private String phone;

    //constructor

    public Customer(){
        this.CID=UUID.randomUUID().toString();
    }


    public String getCID() {
        return this.CID;
    }

    public void setCID(String CID) {
        this.CID = CID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    /*
     * When the client makes a request to the server how will the object be constructed?
     * what is the primary key of this object?
     * Will your db id be serial? or will it be integer value?
     */



}
