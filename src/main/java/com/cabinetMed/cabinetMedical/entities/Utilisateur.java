package com.cabinetMed.cabinetMedical.entities;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @ManyToOne
    private Profile profile;
}
