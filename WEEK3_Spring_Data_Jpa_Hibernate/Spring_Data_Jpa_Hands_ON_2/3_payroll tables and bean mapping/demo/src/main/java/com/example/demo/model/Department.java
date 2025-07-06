package com.example.demo.model;

import jakarta.persistence.*;
        import java.util.List;

@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "department")
    private List<Employee> employeeList;

    // Getters, setters, toString()
}
