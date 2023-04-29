package com.example1.springbootexample.entities;


import javax.persistence.*;
import java.util.Date;

@Table(name="sach")
@Entity
public class Sach {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(unique = false, length = 200, nullable = false)
    private String name;

    @Column(unique = false, length = 300, nullable = false)
    private String description;

    @Column(name = "due_date")
    private Date dueDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
// note enum
