package com.alexei.vacine.vacinecrmapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Vaccination {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;

    @NotBlank(message = "{nameVacine.not.blank}")
    private String nameVacine;

    @NotBlank(message = "{date.not.blank}")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String date;

    @NotBlank(message = "{emailPeople.not.blank}")
    @Email(message = "{emailPeople.not.valid}")
    @Column(unique = true)
    private String emailPeople;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameVacine() {
        return nameVacine;
    }

    public void setNameVacine(String nameVacine) {
        this.nameVacine = nameVacine;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmailPeople() {
        return emailPeople;
    }

    public void setEmailPeople(String emailPeople) {
        this.emailPeople = emailPeople;
    }

    public Vaccination() {
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        result = prime * result + ((emailPeople == null) ? 0 : emailPeople.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nameVacine == null) ? 0 : nameVacine.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vaccination other = (Vaccination) obj;
        if (date == null) {
            if (other.date != null)
                return false;
        } else if (!date.equals(other.date))
            return false;
        if (emailPeople == null) {
            if (other.emailPeople != null)
                return false;
        } else if (!emailPeople.equals(other.emailPeople))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nameVacine == null) {
            if (other.nameVacine != null)
                return false;
        } else if (!nameVacine.equals(other.nameVacine))
            return false;
        return true;
    }

}
