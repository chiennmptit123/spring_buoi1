package com.example1.springbootexample.controller;

import com.example1.springbootexample.entities.Sach;
import com.example1.springbootexample.requests.CreateSachInput;
import com.example1.springbootexample.services.SachService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SachController {
    public SachService sachService;
    public SachController(SachService sachService){
        this.sachService=sachService;
    }

    @PostMapping("/sach")
    public ResponseEntity<Sach> createTask(@RequestBody CreateSachInput createSachInput) {

        System.out.println("11111111111111111111111111");
        Sach sachCreated = sachService.create(createSachInput.toSach());

        return new ResponseEntity<>(sachCreated, HttpStatus.CREATED);
    }

}
