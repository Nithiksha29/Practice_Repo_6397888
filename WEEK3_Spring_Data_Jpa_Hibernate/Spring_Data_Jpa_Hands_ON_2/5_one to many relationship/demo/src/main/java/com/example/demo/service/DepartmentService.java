// DepartmentService.java
package com.example.demo.service;
import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department get(int id) {
        return departmentRepository.findById(id).orElse(null);
    }
}
