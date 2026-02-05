package com.cabinetMed.cabinetMedical.mapper;

import com.cabinetMed.cabinetMedical.DTOs.TypeCouvertureMedicaleCreateDto;
import com.cabinetMed.cabinetMedical.DTOs.TypeCouvertureMedicaleResponseDto;
import com.cabinetMed.cabinetMedical.entities.TypeCouvertureMedicale;

public class TypeCouvertureMedicaleMapper {

    public static TypeCouvertureMedicale toEntity(TypeCouvertureMedicaleCreateDto request){
        return TypeCouvertureMedicale.builder()
                .designation(request.designation())
                .abrege(request.abrege())
                .build();
    }

    public static TypeCouvertureMedicaleResponseDto toResponse(TypeCouvertureMedicale typeCouvertureMedicale){
        return new TypeCouvertureMedicaleResponseDto(
                typeCouvertureMedicale.getId(),
                typeCouvertureMedicale.getDesignation(),
                typeCouvertureMedicale.getAbrege()
        );
    }
}
