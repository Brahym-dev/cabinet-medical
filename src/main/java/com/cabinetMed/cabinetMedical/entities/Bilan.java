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
public class Bilan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dateBilan;
    private String observation;

    @ManyToOne
    private Patient patient;

    @OneToMany(mappedBy = "bilan",fetch = FetchType.LAZY)
    private List<LigneBilan> ligneBilans;


}
