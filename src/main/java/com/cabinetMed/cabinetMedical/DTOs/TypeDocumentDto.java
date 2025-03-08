package com.cabinetMed.cabinetMedical.DTOs;

import com.cabinetMed.cabinetMedical.entities.TypeDocument;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TypeDocumentDto {
    private Long id;
    private String designation;

    // Convert Entity to DTO
    public static TypeDocumentDto fromEntity(TypeDocument typeDocument) {

        return TypeDocumentDto.builder()
                .id(typeDocument.getId())
                .designation(typeDocument.getDesignation())
                .build();
    }

    // Convert DTO to Entity
    public static TypeDocument toEntity(TypeDocumentDto dto) {

        return TypeDocument.builder()
                .id(dto.getId())
                .designation(dto.getDesignation())
                .build();
    }
}
