package com.example1.springbootexample.requests;

import com.example1.springbootexample.entities.Sach;

public record CreateSachInput(String name) {
    public Sach toSach(){
        Sach sach = new Sach();
        sach.setName(name);
        return sach;
    }
}
