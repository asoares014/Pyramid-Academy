package com.genspark.SpringBootAssignment.Entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_employees")
public class Employee {

    @Id
    @Column(name = "e_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    public Employee() {

    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
