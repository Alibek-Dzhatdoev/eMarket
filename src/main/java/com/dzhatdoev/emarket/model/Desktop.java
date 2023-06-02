package com.dzhatdoev.emarket.model;

import com.dzhatdoev.emarket.util.DesktopType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Entity
@Getter
@Setter
public class Desktop extends Product{

    @Enumerated(EnumType.STRING)
    @NotNull
    private DesktopType type;


}
