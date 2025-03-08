package com.cabinetMed.cabinetMedical.entities;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class LigneBilan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String observation;

    @ManyToOne
    private Bilan bilan;

    @ManyToOne
    private Analyse analyse;


}
