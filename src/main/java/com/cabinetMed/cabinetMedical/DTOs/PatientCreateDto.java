package com.cabinetMed.cabinetMedical.DTOs;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;

import java.util.Date;

public record PatientCreateDto (
    Long id,
    @NotBlank(message = "Nom est obligatoire.")
    String nom,
    @NotBlank(message = "obligatoire.")
    String prenom,
    @NotBlank(message = "obligatoire.")
    String adresse,
    String telephone,
    String email,
    @JsonFormat(pattern = "yyyy-MM-dd")
    Date dateNaissance,
    String groupeSanguin,
    String situationFamiliale,
    String numeroAssurance,
    int sexe,
    String profession,
    double solde,
    @NotBlank(message = "obligatoire.")
    String cnie,
    String notes,
    String antecedentFamiliaux,
    String antecedentsChurirgicaux,
    String antecedentsMedicaux,
    String antecedentAutres

){}
