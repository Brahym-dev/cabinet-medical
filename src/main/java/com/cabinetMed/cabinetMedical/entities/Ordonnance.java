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
public class Ordonnance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dateOrdonnance;
    private Date heureOrdonnance;
    private String observation;


    @ManyToOne
    private Consultation consultation;


    @OneToMany(mappedBy = "ordonnance")
    private List<LigneOrdonnance>  ligneOrdonnances;
}

