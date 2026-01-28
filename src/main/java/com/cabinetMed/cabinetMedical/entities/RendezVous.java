package com.cabinetMed.cabinetMedical.entities;

import com.cabinetMed.cabinetMedical.enums.StatusRDV;
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

    @Temporal(TemporalType.DATE)
    private Date dateRDV;
    private LocalTime heureDebut;
    private LocalTime heureFin;
    private String observation;
    @Enumerated(EnumType.STRING)
    private StatusRDV status;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

}

