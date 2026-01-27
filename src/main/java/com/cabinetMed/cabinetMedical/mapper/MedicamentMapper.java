package com.cabinetMed.cabinetMedical.mapper;

import com.cabinetMed.cabinetMedical.DTOs.*;
import com.cabinetMed.cabinetMedical.entities.Medicament;

public class MedicamentMapper {
    // Convert Entity to DTO
    public static Medicament toEntity(MedicamentCreateDto request) {
        return Medicament.builder()
                .nomCommercial(request.nomCommercial())
                .nomDCI(request.nomDCI())
                .forme(request.forme())
                .dossage(request.dossage())
                .remboursement(request.remboursement())
                .type(request.type())
                .laboratoire(request.laboratoire())
                .prix(request.prix())
                .build();
    }
    public static void  updateEntity(Medicament medicament, MedicamentUpdateDto dto) {
            medicament.setNomCommercial(dto.nomCommercial());
            medicament.setNomDCI(dto.nomDCI());
            medicament.setForme(dto.forme());
            medicament.setDossage(dto.dossage());
            medicament.setRemboursement(dto.remboursement());
            medicament.setType(dto.type());
            medicament.setLaboratoire(dto.laboratoire());
            medicament.setPrix(dto.prix());
        }

    // Convert DTO to Entity
    public static MedicamentResponseDto toResponse(Medicament medicament){
        return new MedicamentResponseDto(

                medicament.getId(),
                medicament.getNomCommercial(),
                medicament.getNomDCI(),
                medicament.getForme(),
                medicament.getDossage(),
                medicament.getRemboursement(),
                medicament.getType(),
                medicament.getLaboratoire(),
                medicament.getPrix()
        );
    }
}