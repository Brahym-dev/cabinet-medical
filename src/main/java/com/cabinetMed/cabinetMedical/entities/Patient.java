package com.cabinetMed.cabinetMedical.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;
import java.util.Date;
import java.util.List;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String adresse;
    private String telephone;
    private String email;
    private String groupeSanguin;
    private String situationFamiliale;
    private String numeroAssurance;
    private int sexe;
    private String profession;
    private double solde;
    private String cnie;
    private String notes;
    private String antecedentFamiliaux;
    private String antecedentsChurirgicaux;
    private String antecedentsMedicaux;
    private String antecedentAutres;

    @OneToMany(mappedBy = "patient" ,fetch = FetchType.LAZY)
    private Collection<RendezVous> rendezVous;

    @OneToMany(mappedBy = "patient" ,fetch = FetchType.LAZY)
    private Collection<Document> documents;

    @OneToMany(mappedBy = "patient" ,fetch = FetchType.LAZY)
    private List<Consultation> consultations;

    @OneToMany(mappedBy = "patient" ,fetch = FetchType.LAZY)
    private List<Bilan> bilans;

    @ManyToOne
    private  TypeCouvertureMedicale typeCouvertureMedicale;


    @OneToMany(mappedBy = "patient" ,fetch = FetchType.LAZY)
    private List<Radiologie> radiologies;


}