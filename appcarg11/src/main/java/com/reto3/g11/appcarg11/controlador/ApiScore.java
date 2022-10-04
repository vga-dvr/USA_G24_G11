package com.reto3.g11.appcarg11.controlador;

import com.reto3.g11.appcarg11.entidad.Message;
import com.reto3.g11.appcarg11.entidad.Score;
import com.reto3.g11.appcarg11.servicio.MessageService;
import com.reto3.g11.appcarg11.servicio.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Score")
@CrossOrigin(origins = "*")
public class ApiScore {
    @Autowired
    private ScoreService service;

    @GetMapping("/all")
    public List<Score> findAllScore(){
        return service.getScores();
    }

    @GetMapping("/{id}")
    public Score getScore(@PathVariable long id){
        return service.getScore(id);
    }

    @PostMapping("/save")
    public ResponseEntity saveScore(@RequestBody Score score){
        service.saveScore(score);
        return ResponseEntity.status(201).build();
    }

    @PutMapping("/update")
    public ResponseEntity updateScore(@RequestBody Score score){
        service.updateScore(score);
        return ResponseEntity.status(201).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteScore(@PathVariable long id){
        service.deleteScore(id);
        return ResponseEntity.status(204).build();
    }
}
