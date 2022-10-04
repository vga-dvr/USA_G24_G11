package com.reto3.g11.appcarg11.servicio;

import com.reto3.g11.appcarg11.entidad.Score;
import com.reto3.g11.appcarg11.repositorio.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {
    @Autowired
    private ScoreRepository repository;

    public List<Score> getScores (){

        return repository.findAll();
    }
    public Score saveScore(Score score){

        return repository.save(score);
    }
    public Score getScore(long id){

        return repository.findById(id).orElse(null);
    }
    public Score updateScore(Score scoreUpd){
        Score scoreOld = getScore(scoreUpd.getId_score());
        scoreOld.setScore(scoreUpd.getScore());;
        scoreOld.setMessage(scoreUpd.getMessage());
        return repository.save(scoreOld);
    }

    public void deleteScore(long id)
    {
        repository.deleteById(id);
    }
}
