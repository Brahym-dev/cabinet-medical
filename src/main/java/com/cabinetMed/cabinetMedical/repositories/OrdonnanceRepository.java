package com.cabinetMed.cabinetMedical.repositories;

import com.cabinetMed.cabinetMedical.entities.Analyse;
import com.cabinetMed.cabinetMedical.entities.Ordonnance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdonnanceRepository extends JpaRepository<Ordonnance,Long> {
}
