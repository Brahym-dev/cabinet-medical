package com.cabinetMed.cabinetMedical.DTOs;



import com.cabinetMed.cabinetMedical.entities.Consultation;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Builder
public class ConsultationDto {
    private Long id;
    private Date dateConsultation;
    private String diagnostique;
    private String observation;
    private String resultat;
    private String antecedentFamiliaux;
    private String antecedentsChurirgicaux;
    private String antecedentsMedicaux;
    private double poids;
    private double taille;
    private double temperature;
    private String frequenceCardiaque;
    private String glycemie;
    private double pressionArterielle;
    private double montantConsultation;
    private double montantTotal;


    // Static method to convert Entity to DTO
    public static ConsultationDto fromEntity(Consultation consultation) {
        return ConsultationDto.builder()
                .id(consultation.getId())
                .dateConsultation(consultation.getDateConsultation())
                .diagnostique(consultation.getDiagnostique())
                .observation(consultation.getObservation())
                .resultat(consultation.getResultat())
                .antecedentFamiliaux(consultation.getAntecedentFamiliaux())
                .antecedentsChurirgicaux(consultation.getAntecedentsChurirgicaux())
                .antecedentsMedicaux(consultation.getAntecedentsMedicaux())
                .poids(consultation.getPoids())
                .taille(consultation.getTaille())
                .temperature(consultation.getTemperature())
                .frequenceCardiaque(consultation.getFrequenceCardiaque())
                .glycemie(consultation.getGlycemie())
                .pressionArterielle(consultation.getPressionArterielle())
                .montantConsultation(consultation.getMontantConsultation())
                .montantTotal(consultation.getMontantTotal())
                .build();
    }



    public static Consultation toEntity(ConsultationDto dto) {
        return Consultation.builder()
                .id(dto.getId())
                .dateConsultation(dto.getDateConsultation())
                .diagnostique(dto.getDiagnostique())
                .observation(dto.getObservation())
                .resultat(dto.getResultat())
                .antecedentFamiliaux(dto.getAntecedentFamiliaux())
                .antecedentsChurirgicaux(dto.getAntecedentsChurirgicaux())
                .antecedentsMedicaux(dto.getAntecedentsMedicaux())
                .poids(dto.getPoids())
                .taille(dto.getTaille())
                .temperature(dto.getTemperature())
                .frequenceCardiaque(dto.getFrequenceCardiaque())
                .glycemie(dto.getGlycemie())
                .pressionArterielle(dto.getPressionArterielle())
                .montantConsultation(dto.getMontantConsultation())
                .montantTotal(dto.getMontantTotal())
                .build();
    }
}

