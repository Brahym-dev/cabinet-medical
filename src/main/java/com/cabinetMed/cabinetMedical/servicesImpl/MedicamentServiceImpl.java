package com.cabinetMed.cabinetMedical.servicesImpl;

import com.cabinetMed.cabinetMedical.DTOs.MedicamentCreateDto;
import com.cabinetMed.cabinetMedical.DTOs.MedicamentResponseDto;
import com.cabinetMed.cabinetMedical.entities.Medicament;
import com.cabinetMed.cabinetMedical.mapper.MedicamentMapper;
import com.cabinetMed.cabinetMedical.repositories.MedicamentRepository;
import com.cabinetMed.cabinetMedical.services.MedicamentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public MedicamentResponseDto update(Medicament medicament) {
        return null;
    }

    @Override
    public MedicamentResponseDto getById(Long id) {
        return null;
    }

    @Override
    public List<MedicamentResponseDto> getAll() {
        return List.of();
    }

    @Override
    public void delete(Long id) {

    }
}
