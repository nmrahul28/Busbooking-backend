package com.bus.booking.models;

import lombok.Data;
import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "busCompany")
public class Buscompany {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Valid
    private int companyId;

    @Valid
    @NotNull
    private String companyName;

    @Valid
    private float rating;

    @Valid
    private String size;

}
