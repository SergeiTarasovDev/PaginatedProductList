package ru.teliontech.paginatedproductlist.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "product_properties")
@Data
public class JoinedProductProperties implements Serializable {

    @EmbeddedId
    private JoinedProductPropertiesPK id;

    @ManyToOne
    @MapsId("product_id")
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @MapsId("property_id")
    @JoinColumn(name = "property_id", updatable = false, insertable = false,
            referencedColumnName = "id")
    private Properties property;

    @JoinColumn(name = "property_value", updatable = false, insertable = false,
            referencedColumnName = "id")
    private String propertyValue;
}
