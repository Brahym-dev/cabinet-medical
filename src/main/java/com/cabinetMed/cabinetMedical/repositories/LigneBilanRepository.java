package com.cabinetMed.cabinetMedical.repositories;


import com.cabinetMed.cabinetMedical.entities.LigneBilan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneBilanRepository extends JpaRepository<LigneBilan,Long> {
}
