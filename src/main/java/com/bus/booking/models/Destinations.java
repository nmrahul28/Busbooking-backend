package com.bus.booking.models;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "destinations")
public class Destinations {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int destinationId;
    private String destinationCity;
    private String Address;
}
