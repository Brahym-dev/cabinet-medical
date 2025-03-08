package com.cabinetMed.cabinetMedical.services;

import com.cabinetMed.cabinetMedical.entities.Radiologie;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface RadiologieService {

    Radiologie saveRadiologie(Radiologie radiologie);
    Radiologie updateRadiologie(Radiologie radiologie);
    Radiologie getRadiologieById(Long id);
    void deleteRadiologie(Long id);
    List<Radiologie> radiologies();

}
