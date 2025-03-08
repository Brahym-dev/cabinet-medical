package com.cabinetMed.cabinetMedical.services;

import com.cabinetMed.cabinetMedical.entities.LigneRadiologie;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface LigneRadiologieService {

    LigneRadiologie saveLigneRadiologie(LigneRadiologie ligneRadiologie);
    LigneRadiologie updateLigneRadiologie(LigneRadiologie ligneRadiologie);
    LigneRadiologie getLigneRadiologieById(Long id);
    void deleteLigneRadiologie(Long id);
    List<LigneRadiologie> ligneRadiologies();

}
