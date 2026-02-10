package com.cabinetMed.cabinetMedical.DTOs;

import jakarta.validation.constraints.NotNull;

public record MotifConsultationCreateDto(
        @NotNull(message = "Last name is required")
        String designation
){}
