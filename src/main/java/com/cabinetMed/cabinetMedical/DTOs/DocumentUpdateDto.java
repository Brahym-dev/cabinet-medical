package com.cabinetMed.cabinetMedical.DTOs;

import com.cabinetMed.cabinetMedical.entities.Document;
import com.cabinetMed.cabinetMedical.entities.TypeDocument;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


import java.util.Date;


public record DocumentUpdateDto(
   @NotBlank
    String entete,
   @NotBlank
    String corps,
   @NotBlank
    String pied,
   @NotBlank
   @JsonFormat(pattern = "yyyy-MM-dd")
    Date dateDocument,
   @NotBlank
    String objetDocument,
   @NotNull
   Long typeDocumentId
){}
