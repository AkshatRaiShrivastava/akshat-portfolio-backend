package com.akshat.akshatPortfolio.Models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "messages")
public class messageModel {
    private String name;
    private String email;
    private String message;

    public String getName() {
        return name;
    }

    public messageModel(String name, String email, String message) {
        this.name = name;
        this.email = email;
        this.message = message;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public messageModel() {
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
