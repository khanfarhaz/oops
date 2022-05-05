package com.atos.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.atos.model.Tmodel;
 
@Repository
public interface Trepo extends JpaRepository<Tmodel, Integer> {
 
}