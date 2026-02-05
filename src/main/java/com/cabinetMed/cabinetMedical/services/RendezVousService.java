package com.cabinetMed.cabinetMedical.services;

import com.cabinetMed.cabinetMedical.DTOs.RendezVousCreateDto;
import com.cabinetMed.cabinetMedical.DTOs.RendezVousResponseDto;
import com.cabinetMed.cabinetMedical.entities.RendezVous;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface RendezVousService {

    RendezVousResponseDto create(RendezVousCreateDto request, Long id);
    RendezVousResponseDto update(Long id, RendezVous rendezVous);
    RendezVousResponseDto getById(Long id);
    List<RendezVousResponseDto> getAll();
    void delete(Long id);
}
