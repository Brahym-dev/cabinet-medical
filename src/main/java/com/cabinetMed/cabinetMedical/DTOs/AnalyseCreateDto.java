package com.cabinetMed.cabinetMedical.DTOs;

import com.cabinetMed.cabinetMedical.entities.Analyse;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;
import java.util.stream.Collectors;

@Builder
public record AnalyseCreateDto(
        @NotNull(message = "designation is required")
        String designation,
        @NotNull(message = "abrege is required")
        String abrege) {
}