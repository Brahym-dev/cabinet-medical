package com.cabinetMed.cabinetMedical.entities;

import jakarta.persistence.*;
import lombok.*;


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
    @Column(nullable = false)
    private String designation;
    private String abrege;

//    @OneToMany(mappedBy = "typeCouvertureMedicale" ,fetch = FetchType.LAZY)
//    private List<Patient> patients;

}
