package com.cabinetMed.cabinetMedical.DTOs;

import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record DocumentResponseDto(
        Long id,
        String entete,
        String corps,
        String pied,
        Date dateDocument,
        String objetDocument,

        Long typeDocumentId,
        String typeDocumentDesignation
) {
}
