package com.cabinetMed.cabinetMedical.entities;
import jakarta.persistence.*;
import lombok.*;


import java.util.List;

@AllArgsConstructor
@NoArgsConstructor

@Builder
@Entity
public class Analyse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String designation;
    private String abrege;
//comment
    @OneToMany(mappedBy = "analyse" ,fetch = FetchType.LAZY)
    private List<LigneBilan> ligneBilans;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getAbrege() {
        return abrege;
    }

    public void setAbrege(String abrege) {
        this.abrege = abrege;
    }

    public List<LigneBilan> getLigneBilans() {
        return ligneBilans;
    }

    public void setLigneBilans(List<LigneBilan> ligneBilans) {
        this.ligneBilans = ligneBilans;
    }
}
