package com.cabinetMed.cabinetMedical.repositories;

import com.cabinetMed.cabinetMedical.entities.Analyse;
import com.cabinetMed.cabinetMedical.entities.Radio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RadioRepository extends JpaRepository<Radio,Long> {
}
