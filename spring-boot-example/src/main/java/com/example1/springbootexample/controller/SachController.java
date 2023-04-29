package com.example1.springbootexample.controller;

import com.example1.springbootexample.entities.Sach;
import com.example1.springbootexample.requests.CreateSachInput;
import com.example1.springbootexample.requests.UpdateSachInput;
import com.example1.springbootexample.services.SachService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;


@RestController
public class SachController {
    public SachService sachService;
    public SachController(SachService sachService){
        this.sachService=sachService;
    }

    @PostMapping("/sach")
    public ResponseEntity<Sach> createSach(@RequestBody CreateSachInput createSachInput) {
        Sach sachCreated = sachService.create(createSachInput.toSach());

        return new ResponseEntity<>(sachCreated, HttpStatus.CREATED);
    }

    @GetMapping("/sach")
    public ResponseEntity<List<Sach>> allSach() {
        List<Sach> sach = sachService.findAll();

        return new ResponseEntity<>(sach, HttpStatus.OK);
    }
// search 1 id
//    @GetMapping("/sach/{id}")
//    public ResponseEntity<Sach> oneSach(@PathVariable int id) {
//        Optional<Sach> optionalSach = sachService.findById(id);
//
//        if (optionalSach.isPresent()) {
//            return new ResponseEntity<>(optionalSach.get(), HttpStatus.OK);
//        }
//
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
    @PatchMapping("/sach/{id}")
    public ResponseEntity<Sach> updateSach(@PathVariable int id, @RequestBody UpdateSachInput updateSachInput) {

        Optional<Sach> optionalSach = sachService.findById(id);

        if (optionalSach.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        Sach sachToUpdate = optionalSach.get();

        sachToUpdate.setDescription(updateSachInput.description());
        sachToUpdate.setDueDate(updateSachInput.dueDate());

        Sach sachUpdated = sachService.update(sachToUpdate);

        return new ResponseEntity<>(sachUpdated, HttpStatus.OK);
    }
    @DeleteMapping("/sach/{id}")
    public ResponseEntity<Void> deleteSach(@PathVariable int id) {
        sachService.delete(id);

        return ResponseEntity.noContent().build();
    }



}
