package com.cabinetMed.cabinetMedical.servicesImpl;

import com.cabinetMed.cabinetMedical.DTOs.RendezVousCreateDto;
import com.cabinetMed.cabinetMedical.DTOs.RendezVousResponseDto;
import com.cabinetMed.cabinetMedical.entities.Patient;
import com.cabinetMed.cabinetMedical.entities.RendezVous;
import com.cabinetMed.cabinetMedical.enums.StatusRDV;
import com.cabinetMed.cabinetMedical.exception.CustomResponseException;
import com.cabinetMed.cabinetMedical.mapper.RendezVousMapper;
import com.cabinetMed.cabinetMedical.repositories.PatientRepository;
import com.cabinetMed.cabinetMedical.repositories.RendezVousRepository;
import com.cabinetMed.cabinetMedical.services.RendezVousService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RendezVousServiceImpl implements RendezVousService {

    private final RendezVousRepository rendezVousRepository;
    private final PatientRepository patientRepository;

    @Override
    public RendezVousResponseDto create(RendezVousCreateDto request, Long id) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(()-> CustomResponseException.ResourceNotFound("Patient avec id : " + id + " est introuvable"));
        RendezVous rendezVous = RendezVousMapper.toEntity(request);
        rendezVous.setPatient(patient);
        //rendezVous.setStatus(StatusRDV.PENDING);
        return RendezVousMapper.toResponse(rendezVousRepository.save(rendezVous));
    }

    @Override
    public RendezVousResponseDto update(Long id, RendezVous rendezVous) {
        return null;
    }

    @Override
    public RendezVousResponseDto getById(Long id) {
        return null;
    }

    @Override
    public List<RendezVousResponseDto> getAll() {
        return List.of();
    }

    @Override
    public void delete(Long id) {

    }
}
