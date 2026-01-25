package com.cabinetMed.cabinetMedical.DTOs;

import jakarta.validation.constraints.NotNull;

public record AntecedentsPatientCreate(
        @NotNull(message = "type is required")
        String typeAntecedent,
        @NotNull(message = "designation is required")
        String designation
) {
}
