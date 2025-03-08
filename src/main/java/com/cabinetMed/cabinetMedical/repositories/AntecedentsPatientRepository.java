package com.cabinetMed.cabinetMedical.repositories;

import com.cabinetMed.cabinetMedical.entities.AntecedentsPatient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AntecedentsPatientRepository extends JpaRepository<AntecedentsPatient,Long> {
}
