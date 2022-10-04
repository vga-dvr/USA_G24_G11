package com.reto3.g11.appcarg11.repositorio;

import com.reto3.g11.appcarg11.entidad.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message,Long> {
}
