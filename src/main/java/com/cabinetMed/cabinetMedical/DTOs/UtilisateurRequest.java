package com.cabinetMed.cabinetMedical.DTOs;

import com.cabinetMed.cabinetMedical.entities.Profile;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;

public class UtilisateurRequest {
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
}
