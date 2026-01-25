package com.cabinetMed.cabinetMedical.servicesImpl;


import com.cabinetMed.cabinetMedical.DTOs.AntecedentsPatientCreate;
import com.cabinetMed.cabinetMedical.entities.AntecedentsPatient;
import com.cabinetMed.cabinetMedical.exception.CustomResponseException;
import com.cabinetMed.cabinetMedical.mapper.AntecedentsPatientMapper;
import com.cabinetMed.cabinetMedical.repositories.AntecedentsPatientRepository;
import com.cabinetMed.cabinetMedical.services.AntecedentsPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AntecedentsPatientServiceImpl implements AntecedentsPatientService {
    @Autowired
    private AntecedentsPatientRepository antecedentsPatientRepository;


    @Override
    public AntecedentsPatient saveAntecedentsPatient(AntecedentsPatientCreate antecedentsPatientCreate) {
        AntecedentsPatient antecedentsPatient = new AntecedentsPatient();
        antecedentsPatient = AntecedentsPatientMapper.toEntity(antecedentsPatientCreate);
        return antecedentsPatientRepository.save(antecedentsPatient);
    }

    @Override
    public AntecedentsPatient updateAntecedentsPatient(AntecedentsPatientCreate antecedentsPatientCreate, Long antecedentsPatientId) {
        AntecedentsPatient antecedentsPatient = antecedentsPatientRepository.findById(antecedentsPatientId).orElse(null);
        antecedentsPatient = AntecedentsPatientMapper.toEntity(antecedentsPatientCreate);
        return antecedentsPatientRepository.save(antecedentsPatient);
    }

    @Override
    public AntecedentsPatient getAntecedentsPatientById(Long id) {
        return antecedentsPatientRepository.findById(id).orElseThrow(
                () -> CustomResponseException.ResourceNotFound(
                        String.format("Antecedent Patient with id " + id + " not found")));


    }

    @Override
    public void deleteAntecedentsPatient(Long id) {
        antecedentsPatientRepository.deleteById(id);
    }

    @Override
    public List<AntecedentsPatient> antecedentsPatients() {
        return antecedentsPatientRepository.findAll();
    }
}
