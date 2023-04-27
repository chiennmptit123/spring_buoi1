package com.example1.springbootexample.repositories;
import com.example1.springbootexample.entities.Sach;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SachRepository extends CrudRepository<Sach, Integer> {
    
}

