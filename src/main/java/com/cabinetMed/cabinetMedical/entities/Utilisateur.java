package com.cabinetMed.cabinetMedical.entities;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "patients")
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

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String prenom;

    @Column(nullable = true)
    private String telephone;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String password;

    private String typeUser;
    private String photoProfile;

    private String email;
    private String superAdmin;
    private String admin;

    @ManyToOne
    private Profile profile;
}
