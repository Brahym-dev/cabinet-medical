package com.cabinetMed.cabinetMedical.mapper;

import com.cabinetMed.cabinetMedical.DTOs.BilanCreateDto;
import com.cabinetMed.cabinetMedical.DTOs.PatientDto;
import com.cabinetMed.cabinetMedical.entities.Bilan;

public class BilanMapper {
    public static Bilan toEntity(BilanCreateDto bilanCreateDto) {
        return Bilan.builder()
                .dateBilan(bilanCreateDto.dateBilan())
                .observation(bilanCreateDto.observation())
                .patient(bilanCreateDto.patientDto())
                .build();


    }

    public static BilanCreateDto fromEntity(Bilan bilan) {
        return new BilanCreateDto(bilan.getId(), bilan.getDateBilan(), bilan.getObservation(), bilan.getPatient());

    }
}
