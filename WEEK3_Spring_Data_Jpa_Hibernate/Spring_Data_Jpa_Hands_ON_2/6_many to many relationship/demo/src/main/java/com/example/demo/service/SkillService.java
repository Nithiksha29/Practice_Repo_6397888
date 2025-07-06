// SkillService.java
package com.example.demo.service;
import com.example.demo.model.Skill;
import com.example.demo.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService {

    @Autowired
    private SkillRepository skillRepository;

    public Skill get(int id) {
        return skillRepository.findById(id).orElse(null);
    }
}
