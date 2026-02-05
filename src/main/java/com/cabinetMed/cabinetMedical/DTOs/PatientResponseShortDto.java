package com.cabinetMed.cabinetMedical.DTOs;

public record PatientResponseShortDto (
        Long id,
        String nom,
        String prenom,
        String adresse,
        String telephone,
        String email
){}
