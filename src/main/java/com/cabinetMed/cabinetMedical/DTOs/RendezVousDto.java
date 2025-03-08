package com.cabinetMed.cabinetMedical.DTOs;


import com.cabinetMed.cabinetMedical.entities.RendezVous;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.Date;
@Getter
@Setter
@Builder
public class RendezVousDto {
     private Long id;

    private String titre;
    private Date dateRDV;
    private LocalTime heureDebut;
    private LocalTime heureFin;
    private String observation;

    // Convert Entity to DTO
    public static RendezVousDto fromEntity(RendezVous entity) {

        return RendezVousDto.builder()
                .id(entity.getId())
                .titre(entity.getTitre())
                .dateRDV(entity.getDateRDV())
                .heureDebut(entity.getHeureDebut())
                .heureFin(entity.getHeureFin())
                .observation(entity.getObservation())
                .build();
    }

    // Convert DTO to Entity
    public static RendezVous toEntity(RendezVousDto dto) {

        return RendezVous.builder()
                .id(dto.getId())
                .titre(dto.getTitre())
                .dateRDV(dto.getDateRDV())
                .heureDebut(dto.getHeureDebut())
                .heureFin(dto.getHeureFin())
                .observation(dto.getObservation())
                .build();
    }
}
