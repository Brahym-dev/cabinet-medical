package com.cabinetMed.cabinetMedical.DTOs;

import com.cabinetMed.cabinetMedical.DTOs.PatientDto;
import com.cabinetMed.cabinetMedical.entities.Patient;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
public record BilanCreateDto(
        Long id,
        @NotNull
        @JsonFormat(pattern = "yyyy-MM-dd")
        Date dateBilan,
        @NotNull(message = "Observation is required")
        String observation,
        @NotNull(message = "patient is required")
        Patient patientDto
) {
}
/*        if (bilan==null) return null;
        BilanDto bilanDto= new BilanDto();
         bilanDto.setId(bilan.getId());
         bilanDto.setDateBilan(bilan.getDateBilan());
         if (bilan.getPatient()!=null){
             bilanDto.setPatientDto(PatientDto.fromEntity(bilan.getPatient()));
         }
         if (bilan.getLigneBilans()!=null){
             bilanDto.setLigneBilanDtos(bilan.getLigneBilans()
                     .stream()
                     .map(LigneBilanDto::fromEntity)
                     .collect(Collectors.toList()));
         }
      public static Bilan entityToDto( BilanCreateDto dto) {
        if (dto == null) return null;
        Bilan bilan = new Bilan();
        bilan.setId(bilan.getId());
        bilan.setDateBilan(bilan.getDateBilan());
        if (dto.getPatientDto() != null) {
            bilan.setPatient(PatientDto.toEntity(dto.getPatientDto()));
        }
        if (dto.getLigneBilanDtos() != null) {
            bilan.setLigneBilans(dto.getLigneBilanDtos()
                    .stream()
                    .map(LigneBilanDto::toEntity)
                    .collect(Collectors.toList()));
        }*/