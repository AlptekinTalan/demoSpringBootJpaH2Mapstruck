package com.digitalplanet.evaluation.gizemsertkaya.mapper;

import com.digitalplanet.evaluation.gizemsertkaya.model.Car;
import com.digitalplanet.evaluation.gizemsertkaya.model.Truck;
import com.digitalplanet.evaluation.gizemsertkaya.modelDto.CarDto;
import com.digitalplanet.evaluation.gizemsertkaya.modelDto.TruckDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface VehicleMapper {
    VehicleMapper INSTANCE = Mappers.getMapper(VehicleMapper.class);
    CarDto toCarDto(Car car);
    TruckDto toTruckDto(Truck truck);
    Car toCar(CarDto carDto);
    Truck toTruck(TruckDto truckDto);

}
