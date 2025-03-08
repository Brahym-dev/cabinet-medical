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
public class Radio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String designation;
    private String abdege;

    @OneToMany(mappedBy = "radio",fetch = FetchType.LAZY)
    private List<LigneRadiologie> ligneRadiologies;

}
