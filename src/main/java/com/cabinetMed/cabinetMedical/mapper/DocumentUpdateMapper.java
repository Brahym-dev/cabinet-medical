package com.cabinetMed.cabinetMedical.mapper;

import com.cabinetMed.cabinetMedical.DTOs.DocumentCreateDto;
import com.cabinetMed.cabinetMedical.DTOs.DocumentResponseDto;
import com.cabinetMed.cabinetMedical.DTOs.DocumentUpdateDto;
import com.cabinetMed.cabinetMedical.entities.Document;
import com.cabinetMed.cabinetMedical.entities.TypeDocument;

public class DocumentUpdateMapper {
    public void  updateEntity(Document document, DocumentUpdateDto dto, TypeDocument typeDocument) {
        {
            document.setEntete(dto.entete());
            document.setCorps(dto.corps());
            document.setPied(dto.pied());
            document.setDateDocument(dto.dateDocument());
            document.setObjetDocument(dto.objetDocument());
            document.setTypeDocument(typeDocument);
        }
    }
}
