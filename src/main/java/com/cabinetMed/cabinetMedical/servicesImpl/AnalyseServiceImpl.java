package com.cabinetMed.cabinetMedical.servicesImpl;

import com.cabinetMed.cabinetMedical.DTOs.AnalyseCreateDto;
import com.cabinetMed.cabinetMedical.entities.Analyse;
import com.cabinetMed.cabinetMedical.exception.CustomResponseException;
import com.cabinetMed.cabinetMedical.exception.GlobalResponse;
import com.cabinetMed.cabinetMedical.mapper.AnalyseMapper;
import com.cabinetMed.cabinetMedical.repositories.AnalyseRepository;
import com.cabinetMed.cabinetMedical.services.AnalyseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AnalyseServiceImpl implements AnalyseService {

    private final AnalyseRepository analyseRepository;

    @Override
    public Analyse saveAnalyse(AnalyseCreateDto analyseCreateDto) {
        Analyse analyse = AnalyseMapper.toEntity(analyseCreateDto);
        return analyseRepository.save(analyse);

    }

    @Override
    public Analyse updateAnalyse(Long id, AnalyseCreateDto request) {
        Analyse analyse = getAnalyseById(id);
        analyse = AnalyseMapper.toEntity(request);
        return analyseRepository.save(analyse);
    }

    @Override
    public Analyse getAnalyseById(Long id) {
        return analyseRepository.findById(id).orElseThrow(() ->
                CustomResponseException.ResourceNotFound(
                        String.format("Analyse avec id " + id + " est introuvable .")));
    }

    @Override
    public void deleteAnalyse(Long id) {
        Optional<Analyse> analyse = analyseRepository.findById(id);
        if (analyse.isPresent()) {
            analyseRepository.delete(analyse.get());
        }
    }

    @Override
    public List<Analyse> analyses() {
        return analyseRepository.findAll();
    }
}
