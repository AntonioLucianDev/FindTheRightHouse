package com.asusoftware.FindTheRightHouse.post.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "apartments")
public class Apartment {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "number_of_rooms", nullable = false)
    private int numberOfRooms;

    @Column(name = "number_of_bathroom", nullable = false)
    private int numberBathroom;

    @Column(name = "size_of_apartment", nullable = false)
    private Long sizeOfApartment;

    @Column(name = "have_garage", nullable = false)
    private boolean haveGarage;

    @Column(name = "have_terrace")
    private boolean haveTerrace;

    @Column(name = "build_in")
    private int buildIn;

    @Column(name = "have_lift")
    private boolean haveLift;

    @Column(name = "floor_number")
    private int floor;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "cap", nullable = false)
    private int cap;
}
