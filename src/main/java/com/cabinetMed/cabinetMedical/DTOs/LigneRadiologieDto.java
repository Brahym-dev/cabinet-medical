package com.cabinetMed.cabinetMedical.DTOs;

import com.cabinetMed.cabinetMedical.entities.LigneRadiologie;
import com.cabinetMed.cabinetMedical.entities.Radio;
import com.cabinetMed.cabinetMedical.entities.Radiologie;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class LigneRadiologieDto{
    private Long id;
    private String observation;


    // Convert Entity to DTO
    public static LigneRadiologieDto fromEntity(LigneRadiologie entity) {
        if (entity == null) {
            return null;
        }
        return LigneRadiologieDto.builder()
                .id(entity.getId())
                .observation(entity.getObservation())
                .build();
    }

    // Convert DTO to Entity
    public static LigneRadiologie toEntity(LigneRadiologieDto dto) {
        if (dto == null) {
            return null;
        }
        return LigneRadiologie.builder()
                .id(dto.getId())
                .observation(dto.getObservation())
                .build();
    }


}
