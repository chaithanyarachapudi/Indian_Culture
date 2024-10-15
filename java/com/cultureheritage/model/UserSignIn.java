package com.cultureheritage.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "register")
public class UserSignIn{
	@Column(name = "username")
	@Id
    private String name;
	@Column(name = "number")
    private String mobileNumber;
	@Column(name = "password")
    private String password;

    // Constructor
    public UserSignIn(String name, String mobileNumber, String password) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.password = password;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getPassword() {
        return password;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
