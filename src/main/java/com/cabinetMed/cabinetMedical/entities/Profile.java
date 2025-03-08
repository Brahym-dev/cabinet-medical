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
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String designation;


    @OneToMany(mappedBy = "profile" ,fetch = FetchType.LAZY)
    private List<Utilisateur> utilisateurs;

}
