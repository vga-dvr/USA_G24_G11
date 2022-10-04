package com.reto3.g11.appcarg11.entidad;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="car")

public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_car;
    private String name_car;
    private String brand;
    private String year;
    private String description;
}
