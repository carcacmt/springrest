/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto2.sa.reto2g8.service;

import com.reto2.sa.reto2g8.entity.Rol;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.reto2.sa.reto2g8.repository.RolRepository;

/**
 *
 * @author DELL
 */
@Service
public class RolService {
      @Autowired
    private RolRepository repository;
    
    public Rol savePersonal(Rol personal){
       return repository.save(personal);
    }
    
    public List<Rol> getPersonals(){
        return repository.findAll();
    }
    
    public Rol getPersonalById(int id){
        return repository.findById(id).orElse(null);
    }
    

}
