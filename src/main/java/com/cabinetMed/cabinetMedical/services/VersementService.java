package com.cabinetMed.cabinetMedical.services;

import com.cabinetMed.cabinetMedical.entities.Versement;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface VersementService {

    Versement saveVersement(Versement versement);
    Versement updateVersement(Versement versement);
    Versement getVersementById(Long id);
    void deleteVersement(Long id);
    List<Versement> versements();

}
