package com.demo.model;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int quantity;
    private String branch;
    private String image;
    @Column(columnDefinition = "TEXT")
    private String description;
    @ManyToOne
    Category category;
}
