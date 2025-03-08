package com.cabinetMed.cabinetMedical.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dateConsultation;
    private String diagnostique;
    private String observation;
    private String resultat;
    private String antecedentFamiliaux;
    private String antecedentsChurirgicaux;
    private String antecedentsMedicaux;
    private double poids;
    private double taille;
    private double temperature;
    private String frequenceCardiaque;
    private String glycemie;
    private double pressionArterielle;
    private double montantConsultation;
    private double montantTotal;

    @OneToMany(mappedBy = "consultation", fetch = FetchType.LAZY)
    private List<Versement> versements;

    @ManyToOne
    private MotifConsultation motifConsultation;

    @ManyToOne
    private Patient patient;

    @OneToMany(mappedBy = "consultation", fetch = FetchType.LAZY)
    private List<Ordonnance> ordonnances;
}
