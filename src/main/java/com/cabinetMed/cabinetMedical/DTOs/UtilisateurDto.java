package com.cabinetMed.cabinetMedical.DTOs;


import com.cabinetMed.cabinetMedical.entities.Utilisateur;
import com.cabinetMed.cabinetMedical.entities.Versement;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
public class UtilisateurDto {
    private Long id;
    private String nom;
    private String prenom;
    private String telephone;
    private String userName;
    private String password;
    private String typeUser;
    private String photoProfile;
    private String email;
    private String superAdmin;
    private String admin;




    // Convert Entity to DTO
    public static UtilisateurDto fromEntity(Utilisateur utilisateur) {
        if (utilisateur == null) {
            return null;
        }
        return UtilisateurDto.builder()
                .id(utilisateur.getId())
                .nom(utilisateur.getNom())
                .prenom(utilisateur.getPrenom())
                .telephone(utilisateur.getTelephone())
                .userName(utilisateur.getUserName())
                .password(utilisateur.getPassword())
                .typeUser(utilisateur.getTypeUser())
                .photoProfile(utilisateur.getPhotoProfile())
                .email(utilisateur.getEmail())
                .superAdmin(utilisateur.getSuperAdmin())
                .admin(utilisateur.getAdmin())
                .build();
    }

    // Convert DTO to Entity
    public static Utilisateur toEntity(UtilisateurDto dto) {
        if (dto == null) {
            return null;
        }
        return Utilisateur.builder()
                .id(dto.getId())
                .nom(dto.getNom())
                .prenom(dto.getPrenom())
                .telephone(dto.getTelephone())
                .userName(dto.getUserName())
                .password(dto.getPassword()) // Be careful with storing raw passwords
                .typeUser(dto.getTypeUser())
                .photoProfile(dto.getPhotoProfile())
                .email(dto.getEmail())
                .superAdmin(dto.getSuperAdmin())
                .admin(dto.getAdmin())
                .build();
    }
}