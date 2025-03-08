package com.cabinetMed.cabinetMedical.DTOs;

import com.cabinetMed.cabinetMedical.entities.MotifConsultation;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MotifConsultationDto {
    private Long id;
    private String designation;

    public  static MotifConsultationDto fromEntity(MotifConsultation entity){
        if (entity == null) return null;

        MotifConsultationDto dto= new MotifConsultationDto();
        dto.setId(entity.getId());
        dto.setDesignation(entity.getDesignation());
        return dto;
    }

    public static MotifConsultation toEntity(MotifConsultationDto dto){
        if (dto==null) return null;
        MotifConsultation entity= new MotifConsultation();
        entity.setId(dto.getId());
        entity.setDesignation(dto.getDesignation());
        return entity;
    }
}
