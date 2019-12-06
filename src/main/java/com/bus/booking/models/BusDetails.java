package com.bus.booking.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "busDetails")
public class BusDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int busId;
    @Enumerated(EnumType.STRING)
    private BusType busType;
    @NotNull
    private int totalSeats;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "companyId", referencedColumnName = "companyId")
    private Buscompany buscompany;
}
