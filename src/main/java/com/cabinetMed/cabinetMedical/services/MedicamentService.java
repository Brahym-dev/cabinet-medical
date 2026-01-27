package com.cabinetMed.cabinetMedical.services;

import com.cabinetMed.cabinetMedical.DTOs.MedicamentCreateDto;
import com.cabinetMed.cabinetMedical.DTOs.MedicamentResponseDto;
import com.cabinetMed.cabinetMedical.entities.Medicament;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface MedicamentService {

    MedicamentResponseDto create(MedicamentCreateDto request);
    MedicamentResponseDto update(Medicament medicament);
    MedicamentResponseDto getById(Long id);
    List<MedicamentResponseDto> getAll();
    void delete(Long id);
}
