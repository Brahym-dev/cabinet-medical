package com.cabinetMed.cabinetMedical.entities;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class LigneOrdonnance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dose;
    private String momentPrise;
    private int nbreFois;
    private int quantite;
    private int dureeTraitement;
    private String posologie;

    @ManyToOne
    private Ordonnance ordonnance;


    @ManyToOne
    private Medicament medicament;


}
