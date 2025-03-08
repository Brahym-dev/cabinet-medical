package com.cabinetMed.cabinetMedical.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String entete;
    private String corps;
    private String pied;
    private Date dateDocument;
    private String objetDocument;

    @ManyToOne
    private Patient patient;

    @ManyToOne
    private TypeDocument typeDocument;


}

