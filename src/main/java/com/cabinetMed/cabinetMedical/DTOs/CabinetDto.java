package com.cabinetMed.cabinetMedical.DTOs;


import com.cabinetMed.cabinetMedical.entities.Cabinet;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CabinetDto {
   private Long id;
    private String nomCabinet;
    private String nomMedecin;
    private String specialiteMedecin;
    private String adresseCabinet;
    private String numeroOrder;
    private String telephone;
    private String mobile;
    private String siteWeb;
    private String fax;
    private String email;
    private String nomCabinetArabe;
    private String nomMedecinArabe;
    private String specialiteMedecinArabe;
    private String adresseArabe;
    private String profilCabinet;
    private String ville;
    private String villeArabe;


 // Static method to convert Entity to DTO
 public static Cabinet dtoToEntity(CabinetDto cabinet) {
  return Cabinet.builder()
          .id(cabinet.getId())
          .nomCabinet(cabinet.getNomCabinet())
          .nomMedecin(cabinet.getNomMedecin())
          .specialiteMedecin(cabinet.getSpecialiteMedecin())
          .adresseCabinet(cabinet.getAdresseCabinet())
          .numeroOrder(cabinet.getNumeroOrder())
          .telephone(cabinet.getTelephone())
          .mobile(cabinet.getMobile())
          .siteWeb(cabinet.getSiteWeb())
          .fax(cabinet.getFax())
          .email(cabinet.getEmail())
          .nomCabinetArabe(cabinet.getNomCabinetArabe())
          .nomMedecinArabe(cabinet.getNomMedecinArabe())
          .specialiteMedecinArabe(cabinet.getSpecialiteMedecinArabe())
          .adresseArabe(cabinet.getAdresseArabe())
          .profilCabinet(cabinet.getProfilCabinet())
          .ville(cabinet.getVille())
          .villeArabe(cabinet.getVilleArabe())
          .build();
 }


 public static CabinetDto entityToDto(Cabinet cabinet) {
  return CabinetDto.builder()
          .id(cabinet.getId())
          .nomCabinet(cabinet.getNomCabinet())
          .nomMedecin(cabinet.getNomMedecin())
          .specialiteMedecin(cabinet.getSpecialiteMedecin())
          .adresseCabinet(cabinet.getAdresseCabinet())
          .numeroOrder(cabinet.getNumeroOrder())
          .telephone(cabinet.getTelephone())
          .mobile(cabinet.getMobile())
          .siteWeb(cabinet.getSiteWeb())
          .fax(cabinet.getFax())
          .email(cabinet.getEmail())
          .nomCabinetArabe(cabinet.getNomCabinetArabe())
          .nomMedecinArabe(cabinet.getNomMedecinArabe())
          .specialiteMedecinArabe(cabinet.getSpecialiteMedecinArabe())
          .adresseArabe(cabinet.getAdresseArabe())
          .profilCabinet(cabinet.getProfilCabinet())
          .ville(cabinet.getVille())
          .villeArabe(cabinet.getVilleArabe())
          .build();
 }
}