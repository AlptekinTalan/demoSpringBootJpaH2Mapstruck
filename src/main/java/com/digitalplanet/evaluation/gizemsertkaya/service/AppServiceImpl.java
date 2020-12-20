package com.digitalplanet.evaluation.gizemsertkaya.service;

import com.digitalplanet.evaluation.gizemsertkaya.dao.CarRepository;
import com.digitalplanet.evaluation.gizemsertkaya.dao.TruckRepository;
import com.digitalplanet.evaluation.gizemsertkaya.mapper.VehicleMapper;
import com.digitalplanet.evaluation.gizemsertkaya.model.Car;
import com.digitalplanet.evaluation.gizemsertkaya.model.Truck;
import com.digitalplanet.evaluation.gizemsertkaya.modelDto.CarDto;
import com.digitalplanet.evaluation.gizemsertkaya.modelDto.TruckDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class AppServiceImpl implements AppService{

    private CarRepository carRepository;

    private TruckRepository truckRepository;

    @Autowired
    public void setOwnerRepository(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Autowired
    public void setPetRepository(TruckRepository truckRepository) {
        this.truckRepository = truckRepository;
    }

    public List<CarDto> findCars() {
        List<Car> cars = carRepository.findAll();
        List<CarDto> carDtos = new ArrayList<>();

        for (int i = 0; i < cars.size(); i++) {
            carDtos.add(VehicleMapper.INSTANCE.toCarDto(cars.get(i)));
        }
        return carDtos;
    }

    public CarDto findCarById(Long id) {
        Car car=carRepository.findById(id);
        CarDto carDto =  VehicleMapper.INSTANCE.toCarDto(car);
        return carDto;
    }

    public List<TruckDto> findTrucks() {
        List<Truck> trucks = truckRepository.findAll();
        List<TruckDto> truckDtos = new ArrayList<>();
        for (int i = 0; i < trucks.size(); i++) {
            truckDtos.add(VehicleMapper.INSTANCE.toTruckDto(trucks.get(i)));
        }
        return truckDtos;
    }

    public TruckDto findTruckById(Long id) {
        Truck truck=truckRepository.findById(id);
        TruckDto truckDto =  VehicleMapper.INSTANCE.toTruckDto(truck);
        return truckDto;
    }

    @Override
    public void createCar(CarDto carDto) {
        Car car = VehicleMapper.INSTANCE.toCar(carDto);
        carRepository.create(car);
        carDto.setId(car.getId());
    }

    @Override
    public void createTruck(TruckDto truckDto) {
        Truck truck = VehicleMapper.INSTANCE.toTruck(truckDto);
        truckRepository.create(truck);
    }

    @Override
    public void updateCar(CarDto carDto) {
        Car car = VehicleMapper.INSTANCE.toCar(carDto);
        carRepository.update(car);
    }

    @Override
    public void updateTruck(TruckDto truckDto) {
        Truck truck = VehicleMapper.INSTANCE.toTruck(truckDto);
        truckRepository.update(truck);
    }
}
