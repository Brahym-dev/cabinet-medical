package com.cabinetMed.cabinetMedical.entities;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class LigneRadiologie{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String observation;

    @ManyToOne
    private Radiologie radiologie;

    @ManyToOne
    private Radio radio;


}
