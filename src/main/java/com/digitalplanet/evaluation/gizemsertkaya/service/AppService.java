package com.digitalplanet.evaluation.gizemsertkaya.service;

import com.digitalplanet.evaluation.gizemsertkaya.model.Car;
import com.digitalplanet.evaluation.gizemsertkaya.model.Truck;
import com.digitalplanet.evaluation.gizemsertkaya.model.Vehicle;
import com.digitalplanet.evaluation.gizemsertkaya.modelDto.CarDto;
import com.digitalplanet.evaluation.gizemsertkaya.modelDto.TruckDto;

import java.util.ArrayList;
import java.util.List;

public interface AppService {

    List<CarDto> findCars();

    List<TruckDto> findTrucks();

    void createCar(CarDto car);

    void updateCar(CarDto car);

    void createTruck(TruckDto truckDto);

    void updateTruck(TruckDto truckDto);
}
