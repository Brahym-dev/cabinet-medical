package com.cabinetMed.cabinetMedical.DTOs;

import com.cabinetMed.cabinetMedical.entities.Medicament;
import lombok.*;

@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MedicamentDto {
     private Long id;
    private String nomCommercial;
    private String nomDCI;
    private String forme;
    private String dossage;
    private String remboursement;
    private String type;
    private String laboratoire;
    private double prix;


    // Convert Entity to DTO
    public static MedicamentDto fromEntity(Medicament entity) {
        if (entity == null) return null;
        MedicamentDto dto= new MedicamentDto();

        dto.setId(entity.getId());
        dto.setNomCommercial(entity.getNomCommercial());
        dto.setNomDCI(entity.getNomDCI());
        dto.setForme(entity.getForme());
        dto.setDossage(entity.getDossage());
        dto.setRemboursement(entity.getRemboursement());
        dto.setType(entity.getType());
        dto.setLaboratoire(entity.getLaboratoire());
        dto.setPrix(entity.getPrix());
        return dto;
    }
    // Convert DTO to Entity
    public static Medicament toEntity(MedicamentDto dto) {
        if (dto == null) return null;
        Medicament entity = new Medicament();
        entity.setId(dto.getId());
        entity.setNomCommercial(dto.getNomCommercial());
        entity.setNomDCI(dto.getNomDCI());
        entity.setForme(dto.getForme());
        entity.setDossage(dto.getDossage());
        entity.setRemboursement(dto.getRemboursement());
        entity.setType(dto.getType());
        entity.setLaboratoire(dto.getLaboratoire());
        entity.setPrix(dto.getPrix());
        return entity;
    }
}
