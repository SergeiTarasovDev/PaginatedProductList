package ru.teliontech.paginatedproductlist.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "type_properties",
            joinColumns = @JoinColumn(name = "properties_id"),
            inverseJoinColumns = @JoinColumn(name = "type_id"))
    private Set<Properties> propertiesSet = new HashSet<>();

}
