package com.example1.springbootexample.services;

import com.example1.springbootexample.entities.Sach;
import com.example1.springbootexample.repositories.SachRepository;
import org.springframework.stereotype.Service;

@Service
public class SachService {
    private final SachRepository sachRepository;
    public SachService(SachRepository sachRepository){
        this.sachRepository=sachRepository;
    }
    public Sach create(Sach sach){
        return sachRepository.save(sach);
    }
}
