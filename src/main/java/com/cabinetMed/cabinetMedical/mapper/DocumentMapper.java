package com.cabinetMed.cabinetMedical.mapper;

import com.cabinetMed.cabinetMedical.DTOs.DocumentCreateDto;
import com.cabinetMed.cabinetMedical.DTOs.DocumentResponseDto;
import com.cabinetMed.cabinetMedical.DTOs.DocumentUpdateDto;
import com.cabinetMed.cabinetMedical.entities.Document;
import com.cabinetMed.cabinetMedical.entities.TypeDocument;

import java.util.Date;

public class DocumentMapper {
    public static Document toEntity(DocumentCreateDto request,  TypeDocument typeDocument){
        return Document.builder()
                .entete(request.entete())
                .corps(request.corps())
                .pied(request.pied())
                .dateDocument(request.dateDocument())
                .objetDocument(request.objetDocument())
                .typeDocument(typeDocument)
                .build();

    }

    public static void  updateEntity(Document document, DocumentUpdateDto dto, TypeDocument typeDocument) {

            document.setEntete(dto.entete());
            document.setCorps(dto.corps());
            document.setPied(dto.pied());
            document.setDateDocument(dto.dateDocument());
            document.setObjetDocument(dto.objetDocument());
            document.setTypeDocument(typeDocument);

    }

    public static DocumentResponseDto toResponse(Document document){
        return new DocumentResponseDto(
                document.getId(),
                document.getEntete(),
                document.getCorps(),
                document.getPied(),
                document.getDateDocument(),
                document.getObjetDocument(),
                document.getTypeDocument().getId(),
                document.getTypeDocument().getDesignation()
        );
    }

}
