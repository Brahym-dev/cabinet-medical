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
public class Radiologie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dateRadio;
    private String motifRadio;
    private String objetRadio;
    private String observation;

    @ManyToOne
    private Patient patient;

    @OneToMany(mappedBy = "radiologie",fetch = FetchType.LAZY)
    private List<LigneRadiologie> ligneRadiologies;


}
