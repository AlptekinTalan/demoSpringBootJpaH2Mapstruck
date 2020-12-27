package com.digitalplanet.evaluation.alptekintalan.mapper;

import com.digitalplanet.evaluation.alptekintalan.model.Car;
import com.digitalplanet.evaluation.alptekintalan.model.Truck;
import com.digitalplanet.evaluation.alptekintalan.modelDto.CarDto;
import com.digitalplanet.evaluation.alptekintalan.modelDto.TruckDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface VehicleMapper {
    VehicleMapper INSTANCE = Mappers.getMapper(VehicleMapper.class);

    @Mapping(target = "cardtoid", source = "id")
    @Mapping(target = "cardtoname", source = "name")
    CarDto toCarDto(Car car);
    TruckDto toTruckDto(Truck truck);
    Car toCar(CarDto carDto);
    Truck toTruck(TruckDto truckDto);

}
