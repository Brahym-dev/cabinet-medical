package com.cabinetMed.cabinetMedical.DTOs;

import jakarta.validation.constraints.NotNull;

public record CabinetCreateDto(
    @NotNull(message = "obligatoire.")
    String nomCabinet,

    @NotNull(message = "obligatoire.")
    String nomMedecin,
    String specialiteMedecin,

    @NotNull(message = "obligatoire.")
    String adresseCabinet,

    String numeroOrder,
    String telephone,
    String mobile,
    String siteWeb,
    String fax,
    String email,
    String nomCabinetArabe,
    String nomMedecinArabe,
    String specialiteMedecinArabe,
    String adresseArabe,
    String profilCabinet,
    String ville,
    String villeArabe
){}
