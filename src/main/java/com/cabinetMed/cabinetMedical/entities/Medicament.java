package com.cabinetMed.cabinetMedical.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Medicament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomCommercial;
    private String nomDCI;
    private String forme;
    private String dossage;
    private String remboursement;
    private String type;
    private String laboratoire;
    private double prix;

//    @OneToMany(mappedBy = "medicament")
//    private List<LigneOrdonnance> ligneOrdonnances;

}
