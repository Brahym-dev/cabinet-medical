package com.cabinetMed.cabinetMedical.DTOs;

public record CabinetResponseDto(
        Long id,
        String nomCabinet,
        String nomMedecin,
        String specialiteMedecin,
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
