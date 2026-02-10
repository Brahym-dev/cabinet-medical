package com.cabinetMed.cabinetMedical.servicesImpl;

import com.cabinetMed.cabinetMedical.DTOs.PatientCreateDto;
import com.cabinetMed.cabinetMedical.DTOs.PatientResponseShortDto;
import com.cabinetMed.cabinetMedical.entities.Cabinet;
import com.cabinetMed.cabinetMedical.entities.Patient;
import com.cabinetMed.cabinetMedical.entities.TypeCouvertureMedicale;
import com.cabinetMed.cabinetMedical.exception.CustomResponseException;
import com.cabinetMed.cabinetMedical.mapper.CabinetMapper;
import com.cabinetMed.cabinetMedical.mapper.PatientMapper;
import com.cabinetMed.cabinetMedical.repositories.PatientRepository;
import com.cabinetMed.cabinetMedical.repositories.TypeCouvertureMedicaleRepository;
import com.cabinetMed.cabinetMedical.services.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;
    private final TypeCouvertureMedicaleRepository typeCouvertureMedicaleRepository;

    @Override
    public PatientResponseShortDto create(PatientCreateDto request) {
        System.out.println(request.typeCouvertureMedicaleId());
        TypeCouvertureMedicale typeCouvertureMedicale = typeCouvertureMedicaleRepository.findById(request.typeCouvertureMedicaleId())
                .orElseThrow(()-> CustomResponseException.ResourceNotFound("TypeCouvertureMedicale avec id : " + request.typeCouvertureMedicaleId() + " est introuvable"));
        Patient patient = PatientMapper.toEntity(request,typeCouvertureMedicale);
        return PatientMapper.toResponseShort(patientRepository.save(patient));
    }

    @Override
    public PatientResponseShortDto update(Long id, Patient request) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(()-> CustomResponseException.ResourceNotFound("Patient avec id : " + id + " est introuvable"));
        return PatientMapper.toResponseShort(patientRepository.save(request));
    }

    @Override
    public PatientResponseShortDto getById(Long id) {
        return PatientMapper.toResponseShort(patientRepository.findById(id)
                .orElseThrow(()-> CustomResponseException.ResourceNotFound("Patient avec id : " + id + " est introuvable")));
    }

    @Override
    public List<PatientResponseShortDto> getAll() {
        return patientRepository.findAll()
                .stream()
                .map(PatientMapper::toResponseShort)
                .toList();
    }

    @Override
    public void delete(Long id) {
        Optional<Patient> patient = patientRepository.findById(id);
        patient.ifPresent(value -> patientRepository.deleteById(value.getId()));
    }

}
