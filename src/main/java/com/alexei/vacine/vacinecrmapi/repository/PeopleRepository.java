package com.alexei.vacine.vacinecrmapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alexei.vacine.vacinecrmapi.model.People;

@Repository
public interface PeopleRepository extends JpaRepository<People, Long> {
    
}
