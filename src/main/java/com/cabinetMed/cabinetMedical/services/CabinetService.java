package com.cabinetMed.cabinetMedical.services;

import com.cabinetMed.cabinetMedical.DTOs.CabinetCreateDto;
import com.cabinetMed.cabinetMedical.DTOs.CabinetResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;
public interface CabinetService {


    CabinetResponseDto create(CabinetCreateDto request);
    CabinetResponseDto update(Long id, CabinetCreateDto cabinet);
    CabinetResponseDto getById(Long id);
    List<CabinetResponseDto> getAll();
    void delete(Long id);


}
