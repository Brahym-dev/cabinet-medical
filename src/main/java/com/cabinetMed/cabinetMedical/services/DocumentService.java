package com.cabinetMed.cabinetMedical.services;

import com.cabinetMed.cabinetMedical.DTOs.DocumentCreateDto;
import com.cabinetMed.cabinetMedical.DTOs.DocumentResponseDto;
import com.cabinetMed.cabinetMedical.DTOs.DocumentUpdateDto;
import com.cabinetMed.cabinetMedical.entities.Document;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface DocumentService {

    DocumentResponseDto create(DocumentCreateDto request);
    DocumentResponseDto update(Long id, DocumentUpdateDto request);
    DocumentResponseDto getById(Long id);
    List<DocumentResponseDto> getAll();
    void delete(Long id);
}
