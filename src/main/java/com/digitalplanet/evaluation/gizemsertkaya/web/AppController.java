package com.digitalplanet.evaluation.gizemsertkaya.web;

import com.digitalplanet.evaluation.gizemsertkaya.mapper.VehicleMapper;
import com.digitalplanet.evaluation.gizemsertkaya.model.Car;
import com.digitalplanet.evaluation.gizemsertkaya.model.Truck;
import com.digitalplanet.evaluation.gizemsertkaya.model.Vehicle;
import com.digitalplanet.evaluation.gizemsertkaya.modelDto.CarDto;
import com.digitalplanet.evaluation.gizemsertkaya.modelDto.TruckDto;
import com.digitalplanet.evaluation.gizemsertkaya.modelDto.VehicleDto;
import com.digitalplanet.evaluation.gizemsertkaya.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AppController {

    @Autowired
    private AppService appService;

    @RequestMapping("/")
    @ResponseBody
    public String welcome() {
        return "Welcome to Gizem Sertlaya com.digitalplanet.evaluation";
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

        List<VehicleDto> vehicles=new ArrayList<>();

        for (int i = 0; i < cars.size(); i++) {
            vehicles.add(new VehicleDto(cars.get(i).getId(),cars.get(i).getName()));
        }
        for (int i = 0; i < trucks.size(); i++) {
            vehicles.add(new VehicleDto(trucks.get(i).getId(),trucks.get(i).getName()));
        }
        return ResponseEntity.ok(vehicles);
    }

    @RequestMapping(value = "/car/add", method = RequestMethod.POST)
    public ResponseEntity<CarDto> createCar(@RequestBody CarDto carDto) {
        appService.createCar(carDto);
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

    @RequestMapping(value = "/truck/update", method = RequestMethod.POST)
    public ResponseEntity<TruckDto> createUpdate(@RequestBody TruckDto truckDto) {
        appService.updateTruck(truckDto);
        return ResponseEntity.ok(truckDto);
    }
}
