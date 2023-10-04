package com.themarket.backend.entity;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="product")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column (name = "sku")
    private String sku;

    @Column (name = "name")
    private String name;

    @Column (name = "description")
    private String description;

    @Column (name = "unit_price")
    private BigDecimal unitPrice;

    @Column (name = "image_url")
    private String imageUrl;

    @Column (name = "active")
    private boolean active;

    @Column (name = "units_in_stock")
    private int unitsInStock;

    @Column (name = "date_created")
    private Date dateCreated;

    @Column (name = "last_updated")
    private Date lastUpdated;
}
