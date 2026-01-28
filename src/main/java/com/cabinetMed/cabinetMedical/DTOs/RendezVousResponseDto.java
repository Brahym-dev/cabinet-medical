package com.cabinetMed.cabinetMedical.DTOs;


import com.cabinetMed.cabinetMedical.enums.StatusRDV;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;

import java.time.LocalTime;
import java.util.Date;

public record RendezVousResponseDto(
        Long id,
        String titre,
        @NotNull(message = "Date rendez-vous est obligatoire")
        @FutureOrPresent(message = "Date RDV doit être supérieure ou egale à la date de système")
        Date dateRDV,
        LocalTime heureDebut,
        LocalTime heureFin,
        String observation,
        String status

){}

