package com.cabinetMed.cabinetMedical.mapper;

import com.cabinetMed.cabinetMedical.DTOs.PatientCreateDto;
import com.cabinetMed.cabinetMedical.DTOs.PatientResponseShortDto;
import com.cabinetMed.cabinetMedical.entities.Patient;

public class PatientMapper {
    public static Patient toEntity(PatientCreateDto request){
        return Patient.builder()
                .nom(request.nom())
                .prenom(request.prenom())
                .adresse(request.adresse())
                .telephone(request.telephone())
                .email(request.email())
                .dateNaissance(request.dateNaissance())
                .groupeSanguin(request.groupeSanguin())
                .situationFamiliale(request.situationFamiliale())
                .numeroAssurance(request.numeroAssurance())
                .sexe(request.sexe())
                .profession(request.profession())
                .solde(request.solde())
                .cnie(request.cnie())
                .notes(request.notes())
                .antecedentFamiliaux(request.antecedentFamiliaux())
                .antecedentsChurirgicaux(request.antecedentsChurirgicaux())
                .antecedentsMedicaux(request.antecedentsMedicaux())
                .antecedentAutres(request.antecedentAutres())
                .build();
    }

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