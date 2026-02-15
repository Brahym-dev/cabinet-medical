package com.cabinetMed.cabinetMedical.mapper;

import com.cabinetMed.cabinetMedical.DTOs.AnalyseCreateDto;
import com.cabinetMed.cabinetMedical.entities.Analyse;

public class AnalyseMapper {
    public static Analyse toEntity(AnalyseCreateDto analyseDto) {
        Analyse analyse = new Analyse();
        analyse.setDesignation(analyseDto.designation());
        analyse.setAbrege(analyseDto.abrege());
        return analyse;
    }


    public static AnalyseCreateDto fromEntity(Analyse analyse) {
        return new AnalyseCreateDto(analyse.getDesignation(), analyse.getAbrege());
    }

}
