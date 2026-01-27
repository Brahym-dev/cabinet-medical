package com.cabinetMed.cabinetMedical.servicesImpl;

import com.cabinetMed.cabinetMedical.DTOs.MedicamentCreateDto;
import com.cabinetMed.cabinetMedical.DTOs.MedicamentResponseDto;
import com.cabinetMed.cabinetMedical.DTOs.MedicamentUpdateDto;
import com.cabinetMed.cabinetMedical.entities.Document;
import com.cabinetMed.cabinetMedical.entities.Medicament;
import com.cabinetMed.cabinetMedical.exception.CustomResponseException;
import com.cabinetMed.cabinetMedical.mapper.MedicamentMapper;
import com.cabinetMed.cabinetMedical.repositories.MedicamentRepository;
import com.cabinetMed.cabinetMedical.services.MedicamentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MedicamentServiceImpl implements MedicamentService {

    private final MedicamentRepository medicamentRepository;


    @Override
    public MedicamentResponseDto create(MedicamentCreateDto request) {
        Medicament medicament = MedicamentMapper.toEntity(request);
        return MedicamentMapper.toResponse(medicamentRepository.save(medicament));
    }

    @Override
    public MedicamentResponseDto update(Long id, MedicamentUpdateDto request) {
        Medicament medicament = medicamentRepository.findById(id)
                .orElseThrow(()-> CustomResponseException.ResourceNotFound("Medicament avec id : " + id + " est introuvable"));
        MedicamentMapper.updateEntity(medicament, request);
        return MedicamentMapper.toResponse(medicamentRepository.save(medicament));
    }

    @Override
    public MedicamentResponseDto getById(Long id) {
        Medicament medicament = medicamentRepository.findById(id)
                .orElseThrow(()-> CustomResponseException.ResourceNotFound("Medicament avec id : " + id + " est introuvable"));
        return MedicamentMapper.toResponse(medicament);
    }

    @Override
    public List<MedicamentResponseDto> getAll() {
        return medicamentRepository.findAll()
                .stream()
                .map(MedicamentMapper::toResponse)
                .toList();
    }

    @Override
    public void delete(Long id) {
        Optional<Medicament> medicament = medicamentRepository.findById(id);
        medicament.ifPresent(value -> medicamentRepository.deleteById(value.getId()));
    }
}
