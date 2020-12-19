package com.digitalplanet.evaluation.gizemsertkaya.dao;

import com.digitalplanet.evaluation.gizemsertkaya.model.Truck;

import java.util.List;

public interface TruckRepository {
    Truck findById(Long id);
    List<Truck> findAll();
    void create(Truck truck);
    Truck update(Truck truck);
    void delete(Long id);
}
