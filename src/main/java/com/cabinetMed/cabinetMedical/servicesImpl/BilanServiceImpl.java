package com.cabinetMed.cabinetMedical.servicesImpl;

import com.cabinetMed.cabinetMedical.DTOs.BilanCreateDto;
import com.cabinetMed.cabinetMedical.entities.Bilan;
import com.cabinetMed.cabinetMedical.exception.CustomResponseException;
import com.cabinetMed.cabinetMedical.mapper.BilanMapper;
import com.cabinetMed.cabinetMedical.repositories.BilanRepository;
import com.cabinetMed.cabinetMedical.services.BilanService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BilanServiceImpl implements BilanService {

    BilanRepository bilanRepository;

    @Override
    public BilanCreateDto saveBilan(BilanCreateDto bilanCreateDto) {
        Bilan bilan = bilanRepository.save(BilanMapper.toEntity(bilanCreateDto));
        BilanCreateDto bilanCreate = BilanMapper.fromEntity(bilan);
        return bilanCreate;
    }

    @Override
    public BilanCreateDto getBilanById(Long id) {

        var bilan = bilanRepository.findById(id).orElseThrow(() -> CustomResponseException.ResourceNotFound(
                String.format("Bilan " + id + " Not Found")));
        return BilanMapper.fromEntity(bilan);
    }

    @Override
    public void deleteBilan(Long id) {

    }

    @Override
    public List<BilanCreateDto> getAllBilans() {
        return bilanRepository.findAll()
                .stream()
                .map(BilanMapper::fromEntity)
                .toList();

    }

    @Override
    public BilanCreateDto updateBilan(BilanCreateDto bilanCreateDto, Long id) {
        Bilan bilan = bilanRepository.findById(id)
                .orElseThrow(() -> CustomResponseException.ResourceNotFound("Bilan " + id + " Not Found"));
        bilan = BilanMapper.toEntity(bilanCreateDto);
        return BilanMapper.fromEntity(bilanRepository.save(bilan));
    }
}