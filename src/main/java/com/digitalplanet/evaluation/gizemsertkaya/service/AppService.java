package com.digitalplanet.evaluation.gizemsertkaya.service;

import com.digitalplanet.evaluation.gizemsertkaya.modelDto.CarDto;
import com.digitalplanet.evaluation.gizemsertkaya.modelDto.TruckDto;

import java.util.List;

public interface AppService {

    List<CarDto> findCars();

    CarDto findCarById(Long id);

    List<TruckDto> findTrucks();

    TruckDto findTruckById(Long id);

    void createCar(CarDto car);

    void updateCar(CarDto car);

    void createTruck(TruckDto truckDto);

    void updateTruck(TruckDto truckDto);
}
