package ru.teliontech.paginatedproductlist.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private BigDecimal price;

    @ManyToOne
    private Type type;

    @OneToMany(mappedBy = "property")
    private Set<Properties> propertiesSet = new HashSet<>();

//    @ManyToMany(cascade = {
//            CascadeType.PERSIST,
//            CascadeType.MERGE
//    })
//    @JoinTable(name = "product_properties",
//            joinColumns = @JoinColumn(name = "product_id"),
//            inverseJoinColumns = @JoinColumn(name = "property_id"))
//    private Set<Properties> propertySet = new HashSet<>();
//    @JoinTable(name = "product_properties",
//            joinColumns = @JoinColumn(name = "property_id"),
//            inverseJoinColumns = @JoinColumn(name = "product_id"))
//    private Set<Properties> propertySet = new HashSet<>();
}
