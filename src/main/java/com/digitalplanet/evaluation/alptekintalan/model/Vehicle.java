package com.digitalplanet.evaluation.alptekintalan.model;

import javax.persistence.*;

@MappedSuperclass
public abstract class Vehicle {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
