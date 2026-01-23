package com.cabinetMed.cabinetMedical.DTOs;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record DocumentCreateDto(
        //@NotNull(message = "obligatoire.")
        @NotBlank
        String entete,
        //@NotNull(message = "obligatoire.")
        @NotBlank
        String corps,
        //@NotNull(message = "obligatoire.")
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
