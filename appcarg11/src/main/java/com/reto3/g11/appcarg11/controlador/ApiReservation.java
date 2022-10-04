package com.reto3.g11.appcarg11.controlador;

import com.reto3.g11.appcarg11.entidad.Reservation;
import com.reto3.g11.appcarg11.servicio.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Reservation")
@CrossOrigin(origins = "*")
public class ApiReservation {
    @Autowired
    private ReservationService service;

    @GetMapping("/all")
    public List<Reservation>findAllReservation(){
        return service.getReservations();
    }

    @GetMapping("/{id}")
    public Reservation getReservation(@PathVariable long id){
        return service.getReservation(id);
    }

    @PostMapping("/save")
    public ResponseEntity saveReservation(@RequestBody Reservation reservation){
        service.saveReservation(reservation);
        return ResponseEntity.status(201).build();
    }

    @PutMapping("/update")
    public ResponseEntity updateReservation(@RequestBody Reservation reservation){
        service.updateReservation(reservation);
        return ResponseEntity.status(201).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteReservation(@PathVariable long id){
        service.deleteReservation(id);
        return ResponseEntity.status(204).build();
    }
}
