package com.test.products.entity;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;


@Table(name = "products")
public class Product {
    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    
    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    public Product() {
    }

    public Product(String id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
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

    public String getCode() {
        return this.code;
    }

    public void setCode(String value) {
        this.code = value;
    }
}