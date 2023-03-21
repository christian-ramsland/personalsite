package com.ramsland.backend.controller;

import com.ramsland.backend.dto.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class DummyController {

    @GetMapping("/printBilly")
    public ResponseEntity<Student> getBilly() {
        Student billy = new Student(0,"Billy",4);
        return new ResponseEntity<>(billy, HttpStatus.OK);
    }
}
