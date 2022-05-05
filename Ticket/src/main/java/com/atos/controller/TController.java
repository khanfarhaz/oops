package com.atos.controller;
 
import java.util.List;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import com.atos.model.Tmodel;
import com.atos.service.Tservice;
 
@RestController
@RequestMapping(value = "/country")
public class TController {
 
    @Autowired
    private Tservice repo;
 
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<Tmodel> getCountry(@PathVariable Integer id) {
        return new ResponseEntity<Tmodel>(repo.findById(id), HttpStatus.OK);
    }
 
    @PostMapping(value = "/save")
    public ResponseEntity<Integer> newCountry(@RequestBody Tmodel Tmodel) {
        System.out.println("controller ::"+Tmodel);
        return new ResponseEntity<Integer>(repo.save(Tmodel), HttpStatus.OK);
    }
 
    @PatchMapping(value = "/update")
    public ResponseEntity<Integer> updateCountry(@RequestBody Tmodel Tmodel) {
        return new ResponseEntity<Integer>(repo.update(Tmodel), HttpStatus.OK);
    }
 
    
 
}