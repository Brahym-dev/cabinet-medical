package com.cabinetMed.cabinetMedical.DTOs;


import com.cabinetMed.cabinetMedical.entities.RendezVous;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.Date;

public record RendezVousCreateDto(
     Long id,
    String titre,
    Date dateRDV,
    LocalTime heureDebut,
    LocalTime heureFin,
    String observation
){}
