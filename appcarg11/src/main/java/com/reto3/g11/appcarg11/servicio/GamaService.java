package com.reto3.g11.appcarg11.servicio;

import com.reto3.g11.appcarg11.entidad.Gama;
import com.reto3.g11.appcarg11.repositorio.GamaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamaService {
    @Autowired
    private GamaRepository repository;

    public List<Gama> getGama(){
        return repository.findAll();
    }
    public Gama saveGama(Gama gama){
        return repository.save(gama);
    }
    public Gama getGama(long id){
        return repository.findById(id).orElse(null);
    }
    public Gama updateGama(Gama gamaUpd){
        Gama gamaOld = getGama(gamaUpd.getId_gama());
        gamaOld.setName_gama(gamaUpd.getName_gama());;
        gamaOld.setDescription_gama(gamaUpd.getDescription_gama());
        return repository.save(gamaOld);
    }

    public void deleteGama(long id){
        repository.deleteById(id);
    }

}
