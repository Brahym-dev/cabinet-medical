package com.cabinetMed.cabinetMedical.DTOs;

import com.cabinetMed.cabinetMedical.entities.TypeDocument;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

public record TypeDocumentCreateDto (

    @NotNull(message = "obligatoire.")
    String designation
){}
