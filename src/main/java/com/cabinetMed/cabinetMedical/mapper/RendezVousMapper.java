package com.cabinetMed.cabinetMedical.mapper;

import com.cabinetMed.cabinetMedical.DTOs.*;
import com.cabinetMed.cabinetMedical.entities.RendezVous;
import com.cabinetMed.cabinetMedical.enums.StatusRDV;

public class RendezVousMapper {
    public static RendezVous toEntity(RendezVousCreateDto request) {
        return RendezVous.builder()
                .titre(request.titre())
                .dateRDV(request.dateRDV())
                .heureDebut(request.heureDebut())
                .heureFin(request.heureFin())
                .observation(request.observation())
                .status(StatusRDV.PLANIFIE)
                .build();
    }


    public static RendezVousResponseDto toResponse(RendezVous rdv){
        return new RendezVousResponseDto(
                rdv.getId(),
                rdv.getTitre(),
                rdv.getDateRDV(),
                rdv.getHeureDebut(),
                rdv.getHeureFin(),
                rdv.getObservation(),
                rdv.getStatus().toString(),
                PatientMapper.toResponseShort(rdv.getPatient())

        );
    }

}
