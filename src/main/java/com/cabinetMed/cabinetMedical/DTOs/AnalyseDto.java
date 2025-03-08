package com.cabinetMed.cabinetMedical.DTOs;

import com.cabinetMed.cabinetMedical.entities.Analyse;

import lombok.*;

import java.util.List;
import java.util.stream.Collectors;


@NoArgsConstructor
@AllArgsConstructor

@Builder
public class AnalyseDto {
    private Long id;
    private String designation;
    private String abrege;
    private List<LigneBilanDto> ligneBilanDtos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getAbrege() {
        return abrege;
    }

    public void setAbrege(String abrege) {
        this.abrege = abrege;
    }

    public List<LigneBilanDto> getLigneBilanDtos() {
        return ligneBilanDtos;
    }

    public void setLigneBilanDtos(List<LigneBilanDto> ligneBilanDtos) {
        this.ligneBilanDtos = ligneBilanDtos;
    }

    public static Analyse entityFromDTO(AnalyseDto analyseDto) {
        Analyse analyse = new Analyse();
        analyse.setId(analyseDto.getId());
        analyse.setDesignation(analyseDto.getDesignation());
        analyse.setAbrege(analyseDto.getAbrege());
        if (analyseDto.getLigneBilanDtos() != null) {
            analyse.setLigneBilans(analyseDto.ligneBilanDtos
                    .stream()
                    .map(LigneBilanDto::toEntity)
                    .collect(Collectors.toList()));
        }
        return analyse;
    }


    public static AnalyseDto entityToDto(Analyse analyse){
        AnalyseDto dto =new AnalyseDto();
        dto.setDesignation(analyse.getDesignation());
        dto.setAbrege(analyse.getAbrege());
        if (analyse.getLigneBilans() != null) {
            dto.setLigneBilanDtos(analyse.getLigneBilans()
                    .stream()
                    .map(LigneBilanDto::fromEntity)
                    .collect(Collectors.toList()));
        }
        return dto;
    }


}
