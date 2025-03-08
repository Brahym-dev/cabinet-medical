package com.cabinetMed.cabinetMedical.DTOs;



import com.cabinetMed.cabinetMedical.entities.Ordonnance;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@Builder
public class OrdonnanceDto {
    private Long id;
    private Date dateOrdonnance;
    private Date heureOrdonnance;
    private String observation;


    // Convert Entity to DTO
    public static OrdonnanceDto fromEntity(Ordonnance entity) {
        if (entity == null) {
            return null;
        }
        return OrdonnanceDto.builder()
                .id(entity.getId())
                .dateOrdonnance(entity.getDateOrdonnance())
                .heureOrdonnance(entity.getHeureOrdonnance())
                .observation(entity.getObservation())
                .build();
    }

    // Convert DTO to Entity
    public static Ordonnance toEntity(OrdonnanceDto dto) {
        if (dto == null) {
            return null;
        }
        return Ordonnance.builder()
                .id(dto.getId())
                .dateOrdonnance(dto.getDateOrdonnance())
                .heureOrdonnance(dto.getHeureOrdonnance())
                .observation(dto.getObservation())
                .build();
    }
}

