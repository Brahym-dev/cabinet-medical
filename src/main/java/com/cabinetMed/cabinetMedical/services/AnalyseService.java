package com.cabinetMed.cabinetMedical.services;

import com.cabinetMed.cabinetMedical.DTOs.AnalyseCreateDto;
import com.cabinetMed.cabinetMedical.entities.Analyse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AnalyseService {

    Analyse saveAnalyse(AnalyseCreateDto analyseCreateDto);

    Analyse updateAnalyse(Long id, AnalyseCreateDto analyse);

    Analyse getAnalyseById(Long id);

    void deleteAnalyse(Long id);

    List<Analyse> analyses();

}
