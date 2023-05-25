package com.test.products.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "users")
public class User {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;

    public User() {
    }

    public User(String id, String name, String email) {
        // this.cnt = cnt;
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String value) {
        this.email = value;
    }

}
