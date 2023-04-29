package com.example1.springbootexample.requests;

import com.example1.springbootexample.entities.Sach;

public record CreateSachInput(String name, String description) {
    public Sach toSach(){
        Sach sach = new Sach();
        sach.setName(name);
        sach.setDescription(description);
        return sach;
    }
}
