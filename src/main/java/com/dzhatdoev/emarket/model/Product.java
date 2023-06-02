package com.dzhatdoev.emarket.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Product {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column
    @NotEmpty
    private String serialNumber;

    @Column
    @NotEmpty
    private String manufacturer;

    @Column
    private double price;

    @Column
    private int quantity;
}