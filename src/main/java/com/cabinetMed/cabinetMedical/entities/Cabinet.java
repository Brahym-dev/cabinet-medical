package com.cabinetMed.cabinetMedical.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Cabinet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomCabinet;
    private String nomMedecin;
    private String specialiteMedecin;
    private String adresseCabinet;
    private String numeroOrder;
    private String telephone;
    private String mobile;
    private String siteWeb;
    private String fax;
    private String email;
    private String nomCabinetArabe;
    private String nomMedecinArabe;
    private String specialiteMedecinArabe;
    private String adresseArabe;
    private String profilCabinet;
    private String ville;
    private String villeArabe;
}
