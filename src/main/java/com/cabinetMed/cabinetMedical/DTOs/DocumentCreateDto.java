package com.cabinetMed.cabinetMedical.DTOs;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record DocumentCreateDto(
        //@NotNull(message = "obligatoire.")
        @NotBlank(message = "obligatoire.")
        String entete,
        @NotBlank(message = "obligatoire.")
        @NotBlank(message = "obligatoire.")
        String corps,
        @NotBlank(message = "obligatoire.")
        @NotBlank
        String pied,

        @NotNull
        @JsonFormat(pattern = "yyyy-MM-dd")
        Date dateDocument,
        @NotBlank
        String objetDocument,

        @NotNull(message = "Type Document is required.")
        Long typeDocumentId

) {
}
