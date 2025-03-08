package com.cabinetMed.cabinetMedical.DTOs;

import com.cabinetMed.cabinetMedical.entities.Profile;
import com.cabinetMed.cabinetMedical.entities.Utilisateur;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class ProfileDto {
    private Long id;
    private String designation;
    private List<UtilisateurDto> utilisateurDtos;

    // Convert Entity to DTO
    public static ProfileDto fromEntity(Profile entity) {

        return ProfileDto.builder()
                .id(entity.getId())
                .designation(entity.getDesignation())
                .build();
    }

    // Convert DTO to Entity
    public static Profile toEntity(ProfileDto dto) {
        return Profile.builder()
                .id(dto.getId())
                .designation(dto.getDesignation())
                .build();
    }

}

