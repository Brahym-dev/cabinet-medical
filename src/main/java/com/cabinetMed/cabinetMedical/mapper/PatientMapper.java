package com.cabinetMed.cabinetMedical.mapper;

import com.cabinetMed.cabinetMedical.DTOs.PatientResponseShortDto;
import com.cabinetMed.cabinetMedical.entities.Patient;

public class PatientMapper {

    public static PatientResponseShortDto toResponseShort(Patient patient){
        return new PatientResponseShortDto(
                patient.getId(),
                patient.getNom(),
                patient.getPrenom(),
                patient.getAdresse(),
                patient.getTelephone(),
                patient.getEmail()
        );
    }
}