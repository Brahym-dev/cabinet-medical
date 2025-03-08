package com.cabinetMed.cabinetMedical.services;

import com.cabinetMed.cabinetMedical.entities.Medicament;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface MedicamentService {

    Medicament saveMedicament(Medicament medicament);
    Medicament updateMedicament(Medicament medicament);
    Medicament getMedicamentById(Long id);
    void deleteMedicament(Long id);
    List<Medicament> medicaments();

}
