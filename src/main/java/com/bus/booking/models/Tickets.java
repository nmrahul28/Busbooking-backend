package com.bus.booking.models;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tickets")
public class Tickets {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ticketId;
    private float ticketPrice;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tripId", referencedColumnName = "tripId")
    private Trips trip;
    private String emailId;
}
