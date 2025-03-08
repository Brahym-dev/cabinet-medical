package com.cabinetMed.cabinetMedical.DTOs;

import com.cabinetMed.cabinetMedical.entities.AntecedentsPatient;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AntecedentsPatientDto {
    private Long id;
    private String typeAntecedent;
    private String designation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeAntecedent() {
        return typeAntecedent;
    }

    public void setTypeAntecedent(String typeAntecedent) {
        this.typeAntecedent = typeAntecedent;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public static AntecedentsPatientDto fromEntity(AntecedentsPatient entity){
        if (entity==null) return null;
        return AntecedentsPatientDto.builder()
                .id(entity.getId())
                .typeAntecedent(entity.getTypeAntecedent())
                .designation(entity.getDesignation())
                .build();
    }

    public static AntecedentsPatient toEntity(AntecedentsPatientDto dto){
        if (dto==null) return null;
        return AntecedentsPatient.builder()
                .id(dto.getId())
                .typeAntecedent(dto.getTypeAntecedent())
                .designation(dto.getDesignation())
                .build();
    }

}

