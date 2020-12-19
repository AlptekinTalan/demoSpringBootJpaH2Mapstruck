package com.digitalplanet.evaluation.gizemsertkaya.dao;

import com.digitalplanet.evaluation.gizemsertkaya.model.Car;

import java.util.List;

public interface CarRepository {
    Car findById(Long id);
    List<Car> findAll();
    void create(Car car);
    Car update(Car car);
    void delete(Long id);
}
