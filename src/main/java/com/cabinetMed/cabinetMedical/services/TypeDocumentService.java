package com.cabinetMed.cabinetMedical.services;

import com.cabinetMed.cabinetMedical.DTOs.TypeDocumentCreateDto;
import com.cabinetMed.cabinetMedical.DTOs.TypeDocumentResponseDto;
import com.cabinetMed.cabinetMedical.entities.TypeDocument;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TypeDocumentService {

    TypeDocument create(TypeDocumentCreateDto request);
    TypeDocument update(Long id, TypeDocument typeDocument);
    TypeDocument getTypeDocumentById(Long id);
    List<TypeDocument> getAll();
    void delete(Long id);


}
