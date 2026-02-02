package com.cabinetMed.cabinetMedical.services;

import com.cabinetMed.cabinetMedical.DTOs.PatientResponseShortDto;
import com.cabinetMed.cabinetMedical.entities.Patient;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PatientService {

    Patient savePatient(PatientResponseShortDto patient);
    Patient updatePatient(Patient patient);
    Patient getPatientById(Long id);
    void deletePatient(Long id);
    List<Patient> patients();

}
