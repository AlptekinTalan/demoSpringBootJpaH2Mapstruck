package com.digitalplanet.evaluation.alptekintalan.model;

import com.digitalplanet.evaluation.alptekintalan.modelDto.VehicleDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="t_truck")
public class Truck extends Vehicle{
    @Column(name="name")
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
