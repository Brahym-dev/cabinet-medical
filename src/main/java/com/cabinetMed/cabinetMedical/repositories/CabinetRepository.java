package com.cabinetMed.cabinetMedical.repositories;


import com.cabinetMed.cabinetMedical.entities.Cabinet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CabinetRepository extends JpaRepository<Cabinet,Long> {
}
