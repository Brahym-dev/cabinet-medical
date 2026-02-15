package com.cabinetMed.cabinetMedical.services;

import com.cabinetMed.cabinetMedical.DTOs.BilanCreateDto;
import com.cabinetMed.cabinetMedical.entities.Bilan;
import jakarta.validation.Valid;

import java.util.List;

public interface BilanService {

    BilanCreateDto saveBilan(BilanCreateDto bilan);

    BilanCreateDto getBilanById(Long id);

    void deleteBilan(Long id);

    List<BilanCreateDto> getAllBilans();

    BilanCreateDto updateBilan(@Valid BilanCreateDto bilan, Long id);
}
