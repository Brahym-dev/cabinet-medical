package com.cabinetMed.cabinetMedical.repositories;

import com.cabinetMed.cabinetMedical.entities.Bilan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BilanRepository extends JpaRepository<Bilan,Long> {
}
