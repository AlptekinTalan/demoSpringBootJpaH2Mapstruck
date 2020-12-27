package com.digitalplanet.evaluation.alptekintalan.dao;

import com.digitalplanet.evaluation.alptekintalan.model.Truck;

import java.util.List;

public interface TruckRepository {
    Truck findById(Long id);
    List<Truck> findAll();
    void create(Truck truck);
    Truck update(Truck truck);
    void delete(Long id);
}
