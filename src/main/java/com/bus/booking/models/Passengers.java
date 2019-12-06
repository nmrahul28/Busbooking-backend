package com.bus.booking.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "passengers")
public class Passengers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int passengerId;
    private String passengerName;
    private int phoneNumber;
    private int seatNo;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ticketId", referencedColumnName = "ticketId")
    private Tickets ticket;

}
