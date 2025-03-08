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
public class TypeDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String designation;


    @OneToMany(mappedBy = "typeDocument" ,fetch = FetchType.LAZY)
    private List<Document> documents;
}
