package com.cabinetMed.cabinetMedical.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Versement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dateVersement;
    private Date heureVersement;
    private float montant;
    private String observation;

    @ManyToOne
   private Consultation consultation;

}

