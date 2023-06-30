package ru.teliontech.paginatedproductlist.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class JoinedProductPropertiesPK implements Serializable {

    @Column(name = "product_id")
    private Integer product_id;

    @Column(name = "property_id")
    private Integer property_id;

}
