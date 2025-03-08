package com.cabinetMed.cabinetMedical.services;

import com.cabinetMed.cabinetMedical.entities.Analyse;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AnalyseService {

    Analyse saveAnalyse(Analyse analyse);
    Analyse updateAnalyse(Analyse analyse);
    Analyse getAnalyseById(Long id);
    void deleteAnalyse(Long id);
    List<Analyse> analyses();

}
