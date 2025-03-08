package com.cabinetMed.cabinetMedical.services;

import com.cabinetMed.cabinetMedical.entities.LigneBilan;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface LigneBilanService {

    LigneBilan saveLigneBilan(LigneBilan LigneBilan);
    LigneBilan updateLigneBilan(LigneBilan LigneBilan);
    LigneBilan getLigneBilanById(Long id);
    void deleteLigneBilan(Long id);
    List<LigneBilan> LigneBilans();

}
