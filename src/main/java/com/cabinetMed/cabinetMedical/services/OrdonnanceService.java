package com.cabinetMed.cabinetMedical.services;

import com.cabinetMed.cabinetMedical.entities.Ordonnance;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface OrdonnanceService {

    Ordonnance saveOrdonnance(Ordonnance ordonnance);
    Ordonnance updateOrdonnance(Ordonnance ordonnance);
    Ordonnance getOrdonnanceById(Long id);
    void deleteOrdonnance(Long id);
    List<Ordonnance> ordonnances();

}
