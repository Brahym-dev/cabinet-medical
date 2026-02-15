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
public class Analyse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String designation;
    private String abrege;

    /*@OneToMany(mappedBy = "analyse" ,fetch = FetchType.LAZY)
    private List<LigneBilan> ligneBilans;*/

}
