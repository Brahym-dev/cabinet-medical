package com.cabinetMed.cabinetMedical.servicesImpl;

import com.cabinetMed.cabinetMedical.DTOs.MotifConsultationCreateDto;
import com.cabinetMed.cabinetMedical.DTOs.TypeCouvertureMedicaleCreateDto;
import com.cabinetMed.cabinetMedical.entities.MotifConsultation;
import com.cabinetMed.cabinetMedical.entities.TypeCouvertureMedicale;
import com.cabinetMed.cabinetMedical.exception.CustomResponseException;
import com.cabinetMed.cabinetMedical.mapper.MotifConsultationMapper;
import com.cabinetMed.cabinetMedical.mapper.TypeCouvertureMedicaleMapper;
import com.cabinetMed.cabinetMedical.repositories.MotifConsultationRepository;
import com.cabinetMed.cabinetMedical.repositories.TypeCouvertureMedicaleRepository;
import com.cabinetMed.cabinetMedical.services.MotifConsultationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class MotifConsultationServiceImpl implements MotifConsultationService {

    private final MotifConsultationRepository motifConsultationRepository;
    @Override
    public MotifConsultation create(MotifConsultationCreateDto request) {
        return motifConsultationRepository.save(MotifConsultationMapper.toEntity(request));
    }

    @Override
    public MotifConsultation update(Long id, MotifConsultation request) {
        MotifConsultation motifConsultation = motifConsultationRepository.findById(id)
                .orElseThrow(() -> CustomResponseException.ResourceNotFound(
                        String.format("MotifConsultation avec id " + id + " est introuvable .")));
        motifConsultation.setDesignation(request.getDesignation());
        return motifConsultationRepository.save(motifConsultation);
    }

    @Override
    public MotifConsultation getById(Long id) {
        return motifConsultationRepository.findById(id)
                .orElseThrow(() -> CustomResponseException.ResourceNotFound(
                        String.format("MotifConsultation avec id " + id + " est introuvable .")));
    }

    @Override
    public List<MotifConsultation> getAll() {
        return motifConsultationRepository.findAll();
    }
    //commentaire test git
    @Override
    public void delete(Long id) {
        Optional<MotifConsultation> motifConsultation = motifConsultationRepository.findById(id);
        motifConsultation.ifPresent(value->motifConsultationRepository.deleteById(value.getId()));
    }
}
