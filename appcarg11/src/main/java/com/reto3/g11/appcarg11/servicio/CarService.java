package com.reto3.g11.appcarg11.servicio;

import com.reto3.g11.appcarg11.entidad.Car;
import com.reto3.g11.appcarg11.repositorio.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository repository;

    public List<Car> getCars(){
        return repository.findAll();
    }

    public Car saveCar(Car car){
        return repository.save(car);
    }
    public Car getCar(long id){
        return repository.findById(id).orElse(null);
    }
    public void deleteCar(long id_car){
        repository.deleteById(id_car);
    }
    public Car updateCar(Car carUpd){
        Car carOld = getCar(carUpd.getId_car());
        carOld.setName_car(carUpd.getName_car());
        carOld.setBrand(carUpd.getBrand());
        carOld.setYear(carUpd.getYear());
        carOld.setDescription(carUpd.getDescription());
        return repository.save(carOld);
    }

}
