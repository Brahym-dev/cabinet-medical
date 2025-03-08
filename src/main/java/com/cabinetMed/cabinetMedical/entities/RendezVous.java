package com.cabinetMed.cabinetMedical.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class RendezVous {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private Date dateRDV;
    private LocalTime heureDebut;
    private LocalTime heureFin;
    private String observation;

    @ManyToOne
    private Patient patient;

}

