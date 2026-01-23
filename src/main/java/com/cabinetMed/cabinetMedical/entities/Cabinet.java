package com.cabinetMed.cabinetMedical.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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

    @Column(nullable = false, length = 100)
    private String nomCabinet;

    @Column(nullable = false, length = 100)
    private String nomMedecin;
    private String specialiteMedecin;

    @Column(nullable = false)
    private String adresseCabinet;

    @Column(nullable = false)
    private String numeroOrder;

    private String telephone;
    private String mobile;
    private String siteWeb;
    private String fax;

    @Column(nullable = false, unique = true)
    private String email;

    private String nomCabinetArabe;
    private String nomMedecinArabe;
    private String specialiteMedecinArabe;

    @Column(nullable = false)
    private String adresseArabe;

    private String profilCabinet;
    private String ville;
    private String villeArabe;
}
