package com.cabinetMed.cabinetMedical.services;

import com.cabinetMed.cabinetMedical.entities.Analyse;
import com.cabinetMed.cabinetMedical.entities.Cabinet;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CabinetService {

    Cabinet saveCabinet(Cabinet cabinet);
    Cabinet updateCabinet(Cabinet cabinet);
    Cabinet getCabinetById(Long id);
    void deleteCabinet(Long id);
    List<Cabinet> cabinet();

}
