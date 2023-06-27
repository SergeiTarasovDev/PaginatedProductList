package ru.teliontech.paginatedproductlist.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class ProductType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "type_properties",
            joinColumns = @JoinColumn(name = "product_properties_id"),
            inverseJoinColumns = @JoinColumn(name = "type_properties_id"))
    private Set<ProductProperties> productPropertiesSet = new HashSet<>();

}
