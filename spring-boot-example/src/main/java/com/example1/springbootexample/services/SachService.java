package com.example1.springbootexample.services;

import com.example1.springbootexample.entities.Sach;
import com.example1.springbootexample.repositories.SachRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SachService {
    private final SachRepository sachRepository;
    public SachService(SachRepository sachRepository){
        this.sachRepository=sachRepository;
    }
    public Sach create(Sach sach){
        return sachRepository.save(sach);
    }
    public List<Sach> findAll() {
        List<Sach> sach = new ArrayList<>();
        sachRepository.findAll().forEach(sach::add);

        return sach;
    }
    public Optional<Sach> findById(int id) {
        return sachRepository.findById(id);
    }

    public Sach update(Sach sachToUpdate) {
        return sachRepository.save(sachToUpdate);
    }

    public void delete(int id) {
        sachRepository.deleteById(id);
    }

}
