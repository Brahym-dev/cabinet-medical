package com.cabinetMed.cabinetMedical.services;

import com.cabinetMed.cabinetMedical.entities.Analyse;
import com.cabinetMed.cabinetMedical.entities.AntecedentsPatient;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AntecedentsPatientService {

    AntecedentsPatient saveAntecedentsPatient(AntecedentsPatient antecedentsPatient);
    AntecedentsPatient updateAntecedentsPatient(AntecedentsPatient antecedentsPatientnalyse);
    AntecedentsPatient getAntecedentsPatientById(Long id);
    void deleteAntecedentsPatient(Long id);
    List<AntecedentsPatient> antecedentsPatient();

}
