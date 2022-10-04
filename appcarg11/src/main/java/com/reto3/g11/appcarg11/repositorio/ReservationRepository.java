package com.reto3.g11.appcarg11.repositorio;

import com.reto3.g11.appcarg11.entidad.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
