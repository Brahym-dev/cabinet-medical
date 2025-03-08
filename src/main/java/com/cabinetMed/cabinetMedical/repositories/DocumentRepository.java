package com.cabinetMed.cabinetMedical.repositories;


import com.cabinetMed.cabinetMedical.entities.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends JpaRepository<Document,Long> {
}
