package com.cabinetMed.cabinetMedical.DTOs;

import com.cabinetMed.cabinetMedical.entities.LigneOrdonnance;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class LigneOrdonnanceDto {
    private Long id;

    private String dose;
    private String momentPrise;
    private int nbreFois;
    private int quantite;
    private int dureeTraitement;
    private String posologie;


    // Convert Entity to DTO
    public static LigneOrdonnanceDto fromEntity(LigneOrdonnance entity) {
        if (entity == null) {
            return null;
        }
        return LigneOrdonnanceDto.builder()
                .id(entity.getId())
                .dose(entity.getDose())
                .momentPrise(entity.getMomentPrise())
                .nbreFois(entity.getNbreFois())
                .quantite(entity.getQuantite())
                .dureeTraitement(entity.getDureeTraitement())
                .posologie(entity.getPosologie())
                .build();
    }

    // Convert DTO to Entity
    public static LigneOrdonnance toEntity(LigneOrdonnanceDto dto) {
        if (dto == null) {
            return null;
        }
        return LigneOrdonnance.builder()
                .id(dto.getId())
                .dose(dto.getDose())
                .momentPrise(dto.getMomentPrise())
                .nbreFois(dto.getNbreFois())
                .quantite(dto.getQuantite())
                .dureeTraitement(dto.getDureeTraitement())
                .posologie(dto.getPosologie())
                .build();
    }
}

