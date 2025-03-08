package com.cabinetMed.cabinetMedical.services;

import com.cabinetMed.cabinetMedical.entities.LigneOrdonnance;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface LigneOrdonnanceService {

    LigneOrdonnance saveLigneOrdonnance(LigneOrdonnance ligneOrdonnance);
    LigneOrdonnance updateLigneOrdonnance(LigneOrdonnance ligneOrdonnance);
    LigneOrdonnance getLigneOrdonnanceById(Long id);
    void deleteLigneOrdonnance(Long id);
    List<LigneOrdonnance> ligneOrdonnances();

}
