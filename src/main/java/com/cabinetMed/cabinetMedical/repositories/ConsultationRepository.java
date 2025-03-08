package com.cabinetMed.cabinetMedical.repositories;


import com.cabinetMed.cabinetMedical.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
