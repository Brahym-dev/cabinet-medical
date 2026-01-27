package com.cabinetMed.cabinetMedical.DTOs;

import com.cabinetMed.cabinetMedical.entities.Medicament;
import jakarta.validation.constraints.NotNull;
import lombok.*;

public record MedicamentCreateDto(
   @NotNull(message = "obligatoire.")
   String nomCommercial,
    String nomDCI,
    String forme,
    String dossage,
    String remboursement,
    String type,
    String laboratoire,
   double prix
){}

