package com.dzhatdoev.emarket.model;

import com.dzhatdoev.emarket.util.LaptopSize;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Laptop extends Product{

    @Enumerated(EnumType.STRING)
    @NotNull
    private LaptopSize size;
}
