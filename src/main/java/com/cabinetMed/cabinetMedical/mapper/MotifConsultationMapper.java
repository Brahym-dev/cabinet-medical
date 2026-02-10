package com.cabinetMed.cabinetMedical.mapper;

import com.cabinetMed.cabinetMedical.DTOs.MotifConsultationCreateDto;
import com.cabinetMed.cabinetMedical.DTOs.TypeCouvertureMedicaleCreateDto;
import com.cabinetMed.cabinetMedical.DTOs.TypeCouvertureMedicaleResponseDto;
import com.cabinetMed.cabinetMedical.entities.MotifConsultation;
import com.cabinetMed.cabinetMedical.entities.TypeCouvertureMedicale;

public class MotifConsultationMapper {

    public static MotifConsultation toEntity(MotifConsultationCreateDto request){
        return MotifConsultation.builder()
                .designation(request.designation())
                .build();
    }

//    public static MotifConsultationCreateDto toResponse(MotifConsultation motifConsultation){
//        return new MotifConsultation(
//                motifConsultation.getId(),
//                motifConsultation.getDesignation()
//        );
  //  }
}
