package com.cabinetMed.cabinetMedical.services;

import com.cabinetMed.cabinetMedical.entities.Bilan;

import java.util.List;

public interface BilanService {

    Bilan saveBilan(Bilan bilan);
    Bilan updateBilan(Bilan bilan);
    Bilan getBilanById(Long id);
    void deleteBilan(Long id);
    List<Bilan> bilan();

}
