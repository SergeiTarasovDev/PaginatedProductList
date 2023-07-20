package ru.teliontech.paginatedproductlist.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Properties {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "product")
    private Set<Product> productSet = new HashSet<>();

//    @ManyToMany(mappedBy = "propertySet")
//    private Set<Product> productSet = new HashSet<>();

}
