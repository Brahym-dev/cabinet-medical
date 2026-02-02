package com.cabinetMed.cabinetMedical.servicesImpl;

import com.cabinetMed.cabinetMedical.DTOs.PatientCreateDto;
import com.cabinetMed.cabinetMedical.DTOs.PatientResponseShortDto;
import com.cabinetMed.cabinetMedical.entities.Patient;
import com.cabinetMed.cabinetMedical.exception.CustomResponseException;
import com.cabinetMed.cabinetMedical.mapper.PatientMapper;
import com.cabinetMed.cabinetMedical.repositories.PatientRepository;
import com.cabinetMed.cabinetMedical.services.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {

    private  PatientRepository patientRepository;

    @Override
    public PatientResponseShortDto create(PatientCreateDto request) {
        Patient patient = PatientMapper.toEntity(request);
        return PatientMapper.toResponseShort(patientRepository.save(patient));
    }

    @Override
    public PatientResponseShortDto update(Long id, Patient request) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(()-> CustomResponseException.ResourceNotFound("Patient avec id : " + id + " est introuvable"));
        return PatientMapper.toResponseShort(patientRepository.save(patient));
    }

    @Override
    public Patient getById(Long id) {
        return patientRepository.findById(id)
                .orElseThrow(()-> CustomResponseException.ResourceNotFound("Patient avec id : " + id + " est introuvable"));
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<PatientResponseShortDto> patients() {
        return List.of();
    }
}
