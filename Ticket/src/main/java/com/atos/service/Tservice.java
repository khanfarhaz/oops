package com.atos.service;
 
import java.util.List;

import java.util.Optional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.atos.model.Tmodel;
import com.atos.repository.Trepo;
 
@Service
public class Tservice {
 
    @Autowired
    private Trepo repo;
 
    public List<Tmodel> findAll() {
        return repo.findAll();
    }
 
    public Tmodel findById(int id) {
        Optional<Tmodel> country = repo.findById(id);
 
        if (country.isPresent()) {
            System.out.println(country);
        } else {
            country = null;
        }
        return country.get();
    }
 
    public int save(Tmodel Tmodel) {
        Optional<Tmodel> existsTmodel = repo.findById(Tmodel.getTicketID());
        int id = 0;
        if (existsTmodel.isPresent()) {
            id = -1;
        } else {
        	Tmodel Tmodel2 = repo.saveAndFlush(Tmodel);
            id = Tmodel2.getTicketID();
        }
        return id;
    }
 
    public int update(Tmodel Tmodel) {
        Optional<Tmodel> existsCountry = repo.findById(Tmodel.getTicketID());
        int id = 0;
        if (existsCountry.isPresent()) {
            repo.saveAndFlush(Tmodel);
            id = 1;
        } else {
            id = -1;
        }
        return id;
    }
 
    
}