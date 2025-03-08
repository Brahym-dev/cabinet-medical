package com.cabinetMed.cabinetMedical.DTOs;

import com.cabinetMed.cabinetMedical.entities.LigneBilan;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class LigneBilanDto {
    private Long id;
    private String observation;


    // Convert Entity to DTO
    public static LigneBilanDto fromEntity(LigneBilan entity) {
       /* if (entity == null) {
            return null;
        }
        return LigneBilanDto.builder()
                .id(entity.getId())
                .observation(entity.getObservation())
                .build();*/
        return null;
    }

    // Convert DTO to Entity
    public static LigneBilan toEntity(LigneBilanDto dto) {
        /*if (dto == null) {
            return null;
        }
        return LigneBilan.builder()
                .id(dto.getId())
                .observation(dto.getObservation())
                .build();*/
        return null;
    }


}
