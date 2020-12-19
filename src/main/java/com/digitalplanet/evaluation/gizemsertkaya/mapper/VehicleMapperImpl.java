package com.digitalplanet.evaluation.gizemsertkaya.mapper;

import com.digitalplanet.evaluation.gizemsertkaya.model.Car;
import com.digitalplanet.evaluation.gizemsertkaya.model.Truck;
import com.digitalplanet.evaluation.gizemsertkaya.modelDto.CarDto;
import com.digitalplanet.evaluation.gizemsertkaya.modelDto.TruckDto;

public class VehicleMapperImpl implements VehicleMapper {
    @Override
    public CarDto toCarDto(Car car) {
        if (car == null) {
            return null;
        }
        CarDto carDto = new CarDto();
        carDto.setId(car.getId());
        carDto.setName(car.getName());

        return carDto;
    }
    @Override
    public TruckDto toTruckDto(Truck truck) {
        if (truck == null) {
            return null;
        }
        TruckDto truckDto = new TruckDto();
        truckDto.setId(truck.getId());
        truckDto.setName(truck.getName());

        return truckDto;
    }
    @Override
    public Car toCar(CarDto CarDto) {
        if (CarDto == null) {
            return null;
        }
        Car car = new Car();
        car.setId(CarDto.getId());
        car.setName(CarDto.getName());

        return car;
    }
    @Override
    public Truck toTruck(TruckDto truckDto) {
        if (truckDto == null) {
            return null;
        }
        Truck truck = new Truck();
        truck.setId(truckDto.getId());
        truck.setName(truckDto.getName());

        return truck;
    }
}
