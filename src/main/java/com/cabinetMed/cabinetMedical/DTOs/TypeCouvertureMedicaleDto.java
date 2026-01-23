package com.cabinetMed.cabinetMedical.DTOs;

import com.cabinetMed.cabinetMedical.entities.Patient;
import com.cabinetMed.cabinetMedical.entities.TypeCouvertureMedicale;
import lombok.*;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TypeCouvertureMedicaleDto {
    private Long id;
    private String designation;
    private String abrege;
    private List<PatientDto> patientDtos;

    // Conversion Entity to DTO
    public static TypeCouvertureMedicaleDto fromEntity(TypeCouvertureMedicale entity) {
//        if (entity == null) return null;
//        TypeCouvertureMedicaleDto dto = new TypeCouvertureMedicaleDto();
//        dto.setId(entity.getId());
//        dto.setDesignation(entity.getDesignation());
//        if (entity.getPatients()!=null) {
//            dto.setPatientDtos(entity.getPatients()
//                    .stream()
//                    .map(PatientDto::fromEntity)
//                    .collect(Collectors.toList()));
//        }
//        dto.setAbrege(entity.getAbrege());
//        return dto;
        return null;
    }

    // Conversion DTO -> Entity
    public static TypeCouvertureMedicale toEntity(TypeCouvertureMedicaleDto dto) {
//        if (dto == null) return null;
//        TypeCouvertureMedicale entity = new TypeCouvertureMedicale();
//        entity.setId(dto.getId());
//        entity.setDesignation(dto.getDesignation());
//        if (dto.getPatientDtos()!=null){
//            entity.setPatients(dto.getPatientDtos()
//                    .stream()
//                    .map(PatientDto::toEntity)
//                    .collect(Collectors.toList()));
//        }
//        entity.setAbrege(dto.getAbrege());
//        return entity;
        return  null;
    }

}
