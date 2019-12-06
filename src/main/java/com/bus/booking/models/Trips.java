package com.bus.booking.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "trips")
public class Trips {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tripId;
    private int availableSeats;
    @Temporal(TemporalType.DATE)
    private Date date;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "routeId", referencedColumnName = "routeId")
    private Routes route;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "busId", referencedColumnName = "busId")
    private BusDetails busdetails;
}
