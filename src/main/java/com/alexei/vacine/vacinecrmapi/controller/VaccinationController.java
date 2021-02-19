package com.alexei.vacine.vacinecrmapi.controller;

import java.util.List;

import javax.validation.Valid;

import com.alexei.vacine.vacinecrmapi.model.Vaccination;
import com.alexei.vacine.vacinecrmapi.repository.VaccinationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/vaccination")
public class VaccinationController {

    @Autowired
    private VaccinationRepository vaccinationRepository;

    @GetMapping
    public List<Vaccination> listVaccination() {
        return vaccinationRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Vaccination add(@RequestBody @Valid Vaccination vaccination) {
        return vaccinationRepository.save(vaccination);
    }
    
}
