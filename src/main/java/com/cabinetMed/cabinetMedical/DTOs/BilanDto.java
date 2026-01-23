package com.cabinetMed.cabinetMedical.DTOs;

import com.cabinetMed.cabinetMedical.entities.Bilan;
import com.cabinetMed.cabinetMedical.entities.LigneBilan;
import com.cabinetMed.cabinetMedical.entities.Patient;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class BilanDto {
    private Long id;
    private Date dateBilan;
    private String observation;

    private PatientDto patientDto;
    private List<LigneBilanDto> ligneBilanDtos;

    public static BilanDto EntityToDto(Bilan bilan){
//        if (bilan==null) return null;
//        BilanDto bilanDto= new BilanDto();
//         bilanDto.setId(bilan.getId());
//         bilanDto.setDateBilan(bilan.getDateBilan());
//         if (bilan.getPatient()!=null){
//             bilanDto.setPatientDto(PatientDto.fromEntity(bilan.getPatient()));
//         }
//         if (bilan.getLigneBilans()!=null){
//             bilanDto.setLigneBilanDtos(bilan.getLigneBilans()
//                     .stream()
//                     .map(LigneBilanDto::fromEntity)
//                     .collect(Collectors.toList()));
//         }

        return null;
    }

    public static Bilan entityToDto( BilanDto dto) {
//        if (dto == null) return null;
//        Bilan bilan = new Bilan();
//        bilan.setId(bilan.getId());
//        bilan.setDateBilan(bilan.getDateBilan());
//        if (dto.getPatientDto() != null) {
//            bilan.setPatient(PatientDto.toEntity(dto.getPatientDto()));
//        }
//        if (dto.getLigneBilanDtos() != null) {
//            bilan.setLigneBilans(dto.getLigneBilanDtos()
//                    .stream()
//                    .map(LigneBilanDto::toEntity)
//                    .collect(Collectors.toList()));
//        }
        return null;
    }
}
