package com.cabinetMed.cabinetMedical.mapper;

import com.cabinetMed.cabinetMedical.DTOs.AntecedentsPatientCreate;
import com.cabinetMed.cabinetMedical.entities.AntecedentsPatient;

public class AntecedentsPatientMapper {
    public static AntecedentsPatientCreate fromEntity(AntecedentsPatient entity) {
        if (entity == null) return null;
        return new AntecedentsPatientCreate(entity.getTypeAntecedent(), entity.getDesignation());
    }

    public static AntecedentsPatient toEntity(AntecedentsPatientCreate dto) {
        if (dto == null) return null;
        return AntecedentsPatient.builder()
                .typeAntecedent(dto.typeAntecedent())
                .designation(dto.designation())
                .build();
    }
}
