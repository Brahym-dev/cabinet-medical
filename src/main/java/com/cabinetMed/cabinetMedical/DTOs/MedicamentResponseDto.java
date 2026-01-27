package com.cabinetMed.cabinetMedical.DTOs;

public record MedicamentResponseDto(
        Long id,
        String nomCommercial,
        String nomDCI,
        String forme,
        String dossage,
        String remboursement,
        String type,
        String laboratoire,
        double prix
) {
}
