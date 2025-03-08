package com.cabinetMed.cabinetMedical.repositories;

import com.cabinetMed.cabinetMedical.entities.Analyse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnalyseRepository extends JpaRepository<Analyse ,Long> {
}
