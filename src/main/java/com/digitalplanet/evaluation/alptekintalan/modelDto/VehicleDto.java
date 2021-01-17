package com.digitalplanet.evaluation.alptekintalan.modelDto;

import com.digitalplanet.evaluation.alptekintalan.model.Car;
import com.digitalplanet.evaluation.alptekintalan.model.Truck;

public class VehicleDto {
    private Long id;
    private String name;

    public VehicleDto(Long id,String name) {
        this.id = id;
        this.name=name;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "VehicleDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static VehicleDto mapForTruckDto(TruckDto truckDto) {
        return new VehicleDto(truckDto.getId(), truckDto.getName());
    }

    public static VehicleDto mapForCarDTO(CarDto carDto) {
        return new VehicleDto(carDto.getCardtoid(), carDto.getCardtoname());
    }
}
