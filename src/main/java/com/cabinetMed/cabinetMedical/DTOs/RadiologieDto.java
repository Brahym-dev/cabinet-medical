package com.cabinetMed.cabinetMedical.DTOs;


import com.cabinetMed.cabinetMedical.entities.Radiologie;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@Builder
public class RadiologieDto {
     private Long id;

    private Date dateRadio;
    private String motifRadio;
    private String objetRadio;
    private String observation;



    // Convert Entity to DTO
    public static RadiologieDto fromEntity(Radiologie entity) {
        if (entity == null) {
            return null;
        }
        return RadiologieDto.builder()
                .id(entity.getId())
                .dateRadio(entity.getDateRadio())
                .motifRadio(entity.getMotifRadio())
                .objetRadio(entity.getObjetRadio())
                .observation(entity.getObservation())
                .build();
    }

    // Convert DTO to Entity
    public static Radiologie toEntity(RadiologieDto dto) {
        if (dto == null) {
            return null;
        }
        return Radiologie.builder()
                .id(dto.getId())
                .dateRadio(dto.getDateRadio())
                .motifRadio(dto.getMotifRadio())
                .objetRadio(dto.getObjetRadio())
                .observation(dto.getObservation())
                .build();
    }
}
