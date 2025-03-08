package com.cabinetMed.cabinetMedical.DTOs;

import com.cabinetMed.cabinetMedical.entities.Document;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


import java.util.Date;


@Getter
@Setter
@Builder
public class DocumentDto {
   private Long id;
    private String entete;
    private String corps;
    private String pied;
    private Date dateDocument;
    private String objetDocument;

    public static DocumentDto entityToDto(Document document){
             return DocumentDto.builder()
                     .id(document.getId())
                     .entete(document.getEntete())
                     .corps(document.getCorps())
                     .pied(document.getPied())
                     .dateDocument(document.getDateDocument())
                     .objetDocument(document.getObjetDocument())
                     .build();
    }

 public static Document  dtoToEntity(DocumentDto dto){
  return Document.builder()
          .id(dto.getId())
          .entete(dto.getEntete())
          .corps(dto.getCorps())
          .pied(dto.getPied())
          .dateDocument(dto.getDateDocument())
          .objetDocument(dto.getObjetDocument())
          .build();
 }
}
