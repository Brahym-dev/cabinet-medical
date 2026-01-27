package com.cabinetMed.cabinetMedical.DTOs;

import jakarta.validation.constraints.NotNull;

public record MedicamentUpdateDto (
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
