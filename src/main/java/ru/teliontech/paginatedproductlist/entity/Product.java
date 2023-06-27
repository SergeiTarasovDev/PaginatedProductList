package ru.teliontech.paginatedproductlist.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private BigDecimal price;

    @ManyToOne
    private ProductType productType;
}
