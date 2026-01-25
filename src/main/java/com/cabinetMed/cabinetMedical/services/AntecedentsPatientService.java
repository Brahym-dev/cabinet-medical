package com.cabinetMed.cabinetMedical.services;

import com.cabinetMed.cabinetMedical.DTOs.AntecedentsPatientCreate;
import com.cabinetMed.cabinetMedical.entities.Analyse;
import com.cabinetMed.cabinetMedical.entities.AntecedentsPatient;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AntecedentsPatientService {

    AntecedentsPatient saveAntecedentsPatient(AntecedentsPatientCreate antecedentsPatientCreate);

    AntecedentsPatient updateAntecedentsPatient(AntecedentsPatientCreate antecedentsPatientCreate, Long antecedentsPatientId);

    AntecedentsPatient getAntecedentsPatientById(Long id);

    void deleteAntecedentsPatient(Long id);

    List<AntecedentsPatient> antecedentsPatients();

}
