package com.bus.booking.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "routes")
public class Routes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int routeId;
    private float distance;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sourceId", referencedColumnName = "destinationId")
    private Destinations source;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "destinationId", referencedColumnName = "destinationId")
    private Destinations destination;
}
