package com.example.demo.model;

import jakarta.persistence.*;
        import java.util.List;

@Entity
@Table(name = "skill")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "skillList")
    private List<Employee> employeeList;

    // Getters, setters, toString()
}
