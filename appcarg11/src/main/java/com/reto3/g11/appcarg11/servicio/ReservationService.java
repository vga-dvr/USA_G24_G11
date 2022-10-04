package com.reto3.g11.appcarg11.servicio;

import com.reto3.g11.appcarg11.entidad.Reservation;
import com.reto3.g11.appcarg11.repositorio.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository repository;

    public List<Reservation> getReservations(){
        return repository.findAll();
    }

    public Reservation saveReservation(Reservation reservation){

        return repository.save(reservation);
    }

    public Reservation getReservation(long id){

        return repository.findById(id).orElse(null);
    }

    public Reservation updateReservation(Reservation reservationUpd){
        Reservation reservationOld = getReservation(reservationUpd.getId_reservation());
        reservationOld.setStrat_date(reservationUpd.getStrat_date());
        reservationOld.setDeliver_date(reservationUpd.getDeliver_date());
        return repository.save(reservationOld);
    }

    public void deleteReservation(long id){

        repository.deleteById(id);
    }
}
