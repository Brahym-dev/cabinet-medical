package com.cabinetMed.cabinetMedical.mapper;

import com.cabinetMed.cabinetMedical.DTOs.TypeDocumentCreateDto;
import com.cabinetMed.cabinetMedical.DTOs.TypeDocumentResponseDto;
import com.cabinetMed.cabinetMedical.entities.TypeDocument;

public class TypeDocumentMapper {

    public static TypeDocument toEntity(TypeDocumentCreateDto dto){
        return TypeDocument.builder()
                .designation(dto.designation())
                .build();
    }

    public static TypeDocumentResponseDto toResponse(TypeDocument typeDocument){
        return new TypeDocumentResponseDto(
                typeDocument.getId(),
                typeDocument.getDesignation()
        );
    }
}
