package com.cabinetMed.cabinetMedical.services;

import com.cabinetMed.cabinetMedical.entities.MotifConsultation;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface MotifConsultationService {

    MotifConsultation saveMotifConsultation(MotifConsultation motifConsultation);
    MotifConsultation updateMotifConsultation(MotifConsultation motifConsultation);
    MotifConsultation getMotifConsultationById(Long id);
    void deleteMotifConsultation(Long id);
    List<MotifConsultation> motifConsultations();

}
