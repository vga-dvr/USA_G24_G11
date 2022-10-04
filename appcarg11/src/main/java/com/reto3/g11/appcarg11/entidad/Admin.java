package com.reto3.g11.appcarg11.entidad;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_admin;
    private String name_admin;
    private String email;
    private String password;
   /** @ManyToOne
    @JoinColumn(name="id_client");**/

}
