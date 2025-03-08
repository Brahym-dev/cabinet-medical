package com.cabinetMed.cabinetMedical.services;

import com.cabinetMed.cabinetMedical.entities.Consultation;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ConsultationService {

    Consultation saveConsultation(Consultation consultation);
    Consultation updateConsultation(Consultation consultation);
    Consultation getConsultationById(Long id);
    void deleteConsultation(Long id);
    List<Consultation> consultations();

}
