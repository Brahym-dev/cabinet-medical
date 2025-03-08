package com.cabinetMed.cabinetMedical.DTOs;
import com.cabinetMed.cabinetMedical.entities.Versement;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.Date;

@Data
@Builder
public class VersementDto {
    private Long id;
    private Date dateVersement;
    private Date heureVersement;
    private float montant;
    private String observation;

    // Convert Entity to DTO
    public static VersementDto fromEntity(Versement versement) {
        return VersementDto.builder()
                .id(versement.getId())
                .dateVersement(versement.getDateVersement())
                .heureVersement(versement.getHeureVersement())
                .montant(versement.getMontant())
                .observation(versement.getObservation())
                .build();
    }

    // Convert DTO to Entity
    public static Versement toEntity(VersementDto dto) {
        return Versement.builder()
                .id(dto.getId())
                .dateVersement(dto.getDateVersement())
                .heureVersement(dto.getHeureVersement())
                .montant(dto.getMontant())
                .observation(dto.getObservation())
                .build();
    }
}