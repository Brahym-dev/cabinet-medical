package com.cabinetMed.cabinetMedical.services;

import com.cabinetMed.cabinetMedical.DTOs.MotifConsultationCreateDto;
import com.cabinetMed.cabinetMedical.DTOs.TypeCouvertureMedicaleCreateDto;
import com.cabinetMed.cabinetMedical.entities.MotifConsultation;
import com.cabinetMed.cabinetMedical.entities.TypeCouvertureMedicale;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface MotifConsultationService {

    MotifConsultation create(MotifConsultationCreateDto request);
    MotifConsultation update(Long id, MotifConsultation request);
    MotifConsultation getById(Long id);
    List<MotifConsultation> getAll();
    void delete(Long id);

}
