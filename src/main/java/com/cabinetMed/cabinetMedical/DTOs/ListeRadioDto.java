package com.cabinetMed.cabinetMedical.DTOs;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ListeRadioDto {
    private Long id;
    private String designation;
    private String abdege;

}
