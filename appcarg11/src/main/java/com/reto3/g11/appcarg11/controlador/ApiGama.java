package com.reto3.g11.appcarg11.controlador;

import com.reto3.g11.appcarg11.entidad.Gama;
import com.reto3.g11.appcarg11.servicio.GamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/Gama")
@CrossOrigin(origins = "*")
public class ApiGama {
    @Autowired
    private GamaService service;

    @GetMapping("/all")
    public List<Gama> findAllGama(){
        return service.getGama();
    }

    @GetMapping("/{id}")
    public Gama getGama(@PathVariable long id){
        return service.getGama(id);
    }

    @PostMapping("/save")
    public ResponseEntity saveGama(@RequestBody Gama gama){
        service.saveGama(gama);
        return ResponseEntity.status(201).build();
    }

    @PutMapping("/update")
    public ResponseEntity updateGama(@RequestBody Gama gama){
        service.updateGama(gama);
        return ResponseEntity.status(201).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteGama(@PathVariable long id){
        service.deleteGama(id);
        return ResponseEntity.status(204).build();
    }
}
