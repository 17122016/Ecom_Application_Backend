package com.example.EcomApplication.model;

import jakarta.persistence.*;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String brand;
    private String category;
    private BigDecimal price;

    @Temporal(TemporalType.DATE)
    private Date releaseDate;
    private int quantity;
    private boolean available;

    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageData;


}
