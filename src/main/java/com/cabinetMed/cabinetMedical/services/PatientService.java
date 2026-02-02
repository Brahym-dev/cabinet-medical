package com.cabinetMed.cabinetMedical.services;

import com.cabinetMed.cabinetMedical.DTOs.PatientCreateDto;
import com.cabinetMed.cabinetMedical.DTOs.PatientResponseShortDto;
import com.cabinetMed.cabinetMedical.entities.Patient;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PatientService {

    PatientResponseShortDto create(PatientCreateDto request);
    PatientResponseShortDto update(Long id,Patient patient);
    Patient getById(Long id);
    void delete(Long id);
    List<PatientResponseShortDto> patients();

}
