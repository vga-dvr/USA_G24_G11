package com.reto3.g11.appcarg11.servicio;

import com.reto3.g11.appcarg11.entidad.Admin;
import com.reto3.g11.appcarg11.repositorio.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminService {
    @Autowired
    private AdminRepository repository;

    public List<Admin> getAdmints(){

        return repository.findAll();
    }
    public Admin saveAdmin (Admin admin){

        return repository.save(admin);
    }
    public Admin getAdmin(long id){

        return repository.findById(id).orElse(null);
    }
    public Admin updateAdmin(Admin adminUpd){
        Admin adminOld = getAdmin(adminUpd.getId_admin());
        adminOld.setName_admin(adminUpd.getName_admin());
        adminOld.setEmail(adminUpd.getEmail());
        adminOld.setPassword(adminUpd.getPassword());
        return repository.save(adminOld);
    }

    public void deleteAdmin(long id){

        repository.deleteById(id);
    }
}
