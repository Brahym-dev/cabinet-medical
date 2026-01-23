package com.cabinetMed.cabinetMedical.servicesImpl;

import com.cabinetMed.cabinetMedical.DTOs.PatientDto;
import com.cabinetMed.cabinetMedical.entities.Patient;
import com.cabinetMed.cabinetMedical.repositories.PatientRepository;
import com.cabinetMed.cabinetMedical.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private  PatientRepository patientRepository;

    @Override
    public Patient savePatient(PatientDto patientDto) {
        //Patient patient=PatientDto.toEntity(patientDto);
        return null;//patientRepository.save(patient);
    }

    @Override
    public Patient updatePatient(Patient patient) {
        return null;
    }

    @Override
    public Patient getPatientById(Long id) {
        return null;
    }

    @Override
    public void deletePatient(Long id) {

    }

    @Override
    public List<Patient> patients() {
        return List.of();
    }
}
