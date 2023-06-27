package ru.teliontech.paginatedproductlist.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class ProductProperties {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToMany(mappedBy = "productPropertiesSet")
    private Set<ProductType> productTypeSet = new HashSet<>();

}
