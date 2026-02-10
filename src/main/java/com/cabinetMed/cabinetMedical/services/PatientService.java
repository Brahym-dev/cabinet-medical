package com.cabinetMed.cabinetMedical.services;

import com.cabinetMed.cabinetMedical.DTOs.PatientCreateDto;
import com.cabinetMed.cabinetMedical.DTOs.PatientResponseShortDto;
import com.cabinetMed.cabinetMedical.entities.Patient;
import com.cabinetMed.cabinetMedical.entities.TypeCouvertureMedicale;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PatientService {

    PatientResponseShortDto create(PatientCreateDto request);
    PatientResponseShortDto update(Long id,Patient patient);
    PatientResponseShortDto getById(Long id);
    List<PatientResponseShortDto> getAll();
    void delete(Long id);


}
