package com.smv.model;

import javax.persistence.*;

@Entity
@Table (name = "airline")
public class Airline {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    @Column(name = "name", unique = false, nullable = false)
    private String name;
    @Column(name = "description", unique = false, nullable = true)
    private String description;
    @Column(name = "rating", unique = false, nullable = true)
    private double rating;
    @OneToOne(fetch = FetchType.EAGER)
    private Location location;

}
