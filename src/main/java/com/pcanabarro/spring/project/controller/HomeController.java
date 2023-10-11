package com.pcanabarro.spring.project.controller;

import com.pcanabarro.spring.project.entities.Student;
import com.pcanabarro.spring.project.repos.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    private StudentRepository repo;

    @RequestMapping("/home")
    public String home() {
        Student st1 = new Student();
        Student st2 = new Student();
        st1.setId(1);
        st2.setId(2);
        st1.setName("Pedro");
        st2.setTestScore(100);
        System.out.println(st1.getName());

        repo.save(st1);
        repo.save(st2);
        System.out.println(repo.findAll());
        return repo.findAll().toString();
    }
}
