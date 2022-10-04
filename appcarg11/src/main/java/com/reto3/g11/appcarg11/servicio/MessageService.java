package com.reto3.g11.appcarg11.servicio;

import com.reto3.g11.appcarg11.entidad.Message;
import com.reto3.g11.appcarg11.repositorio.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MessageService {
    @Autowired
    private MessageRepository repository;

    public List<Message> getMessages(){
        return repository.findAll();
    }
    public Message saveMessage(Message message){
        return repository.save(message);
    }
    public Message getMessage(long id){
        return repository.findById(id).orElse(null);
    }
    public Message updateMessage(Message messageUpd){
        Message messageOld = getMessage(messageUpd.getId_message());
        messageOld.setTexto(messageUpd.getTexto());
        return repository.save(messageOld);
    }

    public void deleteMessage(long id){
        repository.deleteById(id);
    }
}
