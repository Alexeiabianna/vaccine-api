package com.alexei.vacine.vacinecrmapi.controller;

import java.util.List;

import javax.validation.Valid;

import com.alexei.vacine.vacinecrmapi.model.People;
import com.alexei.vacine.vacinecrmapi.repository.PeopleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class PeopleController {

    @Autowired
    private PeopleRepository peopleRepository;

    @GetMapping
    public List<People> listPeople() {
        return peopleRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public People add(@Valid @RequestBody People people) {
        return peopleRepository.save(people);
    }
}
