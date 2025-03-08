package com.cabinetMed.cabinetMedical.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class TypeCouvertureMedicale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String designation;
    private String abrege;

    @OneToMany(mappedBy = "typeCouvertureMedicale" ,fetch = FetchType.LAZY)
    private List<Patient> patients;

}
