package com.alexei.vacine.vacinecrmapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alexei.vacine.vacinecrmapi.model.Vaccination;


@Repository
public interface VaccinationRepository extends JpaRepository<Vaccination, Long> {
    
}
