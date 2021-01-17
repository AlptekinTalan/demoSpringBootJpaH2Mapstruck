package com.digitalplanet.evaluation.alptekintalan.web;

import com.digitalplanet.evaluation.alptekintalan.modelDto.CarDto;
import com.digitalplanet.evaluation.alptekintalan.modelDto.TruckDto;
import com.digitalplanet.evaluation.alptekintalan.modelDto.VehicleDto;
import com.digitalplanet.evaluation.alptekintalan.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:3000")
@Controller
public class AppController {

    @Autowired
    private AppService appService;

    @RequestMapping("/")
    @ResponseBody
    public String welcome() {
        return "Welcome to Alptekin Talan demo project";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/car/list")
    public ResponseEntity<List<CarDto>> getCars() {
        List<CarDto> cars = appService.findCars();
        return ResponseEntity.ok(cars);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/truck/list")
    public ResponseEntity<List<TruckDto>> getTrucks() {
        List<TruckDto> trucks = appService.findTrucks();
        return ResponseEntity.ok(trucks);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/vehicle/list")
    public ResponseEntity<List<VehicleDto>> getVehicles() {

        List<CarDto> cars = appService.findCars();
        List<TruckDto> trucks = appService.findTrucks();


        List<VehicleDto> vehicleDtos = cars.stream()
                .map(VehicleDto::mapForCarDTO)
                .collect(Collectors.toList());

        List<VehicleDto> collect = trucks.stream()
                .map(VehicleDto::mapForTruckDto)
                .collect(Collectors.toList());

        vehicleDtos.addAll(collect);

        vehicleDtos.forEach(System.out::println);

        return ResponseEntity.ok(vehicleDtos);
    }

    @RequestMapping(value = "/car/add", method = RequestMethod.POST)
    public ResponseEntity<CarDto> createCar(@RequestBody CarDto carDto) {
        appService.createCar(carDto);
        return ResponseEntity.ok(carDto);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/car/{id}")
    public ResponseEntity<CarDto> getCarById(@PathVariable("id") Long id) {
        CarDto carDto = appService.findCarById(id);
        return ResponseEntity.ok(carDto);
    }

    @RequestMapping(value = "/car/update", method = RequestMethod.POST)
    public ResponseEntity<CarDto> createUpdate(@RequestBody CarDto carDto) {
        appService.updateCar(carDto);
        return ResponseEntity.ok(carDto);
    }

    @RequestMapping(value = "/truck/add", method = RequestMethod.POST)
    public ResponseEntity<TruckDto> createCar(@RequestBody TruckDto truckDto) {
        appService.createTruck(truckDto);
        return ResponseEntity.ok(truckDto);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/truck/{id}")
    public ResponseEntity<TruckDto> getTruckById(@PathVariable("id") Long id) {
        TruckDto truckDto = appService.findTruckById(id);
        return ResponseEntity.ok(truckDto);
    }

    @RequestMapping(value = "/truck/update", method = RequestMethod.POST)
    public ResponseEntity<TruckDto> createUpdate(@RequestBody TruckDto truckDto) {
        appService.updateTruck(truckDto);
        return ResponseEntity.ok(truckDto);
    }
}
