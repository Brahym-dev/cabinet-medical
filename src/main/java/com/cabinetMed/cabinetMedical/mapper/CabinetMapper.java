package com.cabinetMed.cabinetMedical.mapper;

import com.cabinetMed.cabinetMedical.DTOs.CabinetCreateDto;
import com.cabinetMed.cabinetMedical.DTOs.CabinetResponseDto;
import com.cabinetMed.cabinetMedical.entities.Cabinet;

public class CabinetMapper {
    public static Cabinet toEntity(CabinetCreateDto request){
        return Cabinet.builder()
                .nomCabinet(request.nomCabinet())
                .nomMedecin(request.nomMedecin())
                .specialiteMedecin(request.specialiteMedecin())
                .adresseCabinet(request.adresseCabinet())
                .numeroOrder(request.numeroOrder())
                .telephone(request.telephone())
                .mobile(request.mobile())
                .siteWeb(request.siteWeb())
                .fax(request.fax())
                .email(request.email())
                .nomCabinetArabe(request.nomCabinetArabe())
                .nomMedecinArabe(request.nomMedecinArabe())
                .specialiteMedecinArabe(request.specialiteMedecinArabe())
                .adresseArabe(request.adresseArabe())
                .profilCabinet(request.profilCabinet())
                .ville(request.ville())
                .villeArabe(request.villeArabe())
                .build();
    }

        public static CabinetResponseDto toResponse(Cabinet cabinet ){
                return new CabinetResponseDto(
                        cabinet.getId(),
                        cabinet.getNomCabinet(),
                        cabinet.getNomMedecin(),
                        cabinet.getSpecialiteMedecin(),
                        cabinet.getAdresseCabinet(),
                        cabinet.getNumeroOrder(),
                        cabinet.getTelephone(),
                        cabinet.getMobile(),
                        cabinet.getSiteWeb(),
                        cabinet.getFax(),
                        cabinet.getEmail(),
                        cabinet.getNomCabinetArabe(),
                        cabinet.getNomMedecinArabe(),
                        cabinet.getSpecialiteMedecinArabe(),
                        cabinet.getAdresseArabe(),
                        cabinet.getProfilCabinet(),
                        cabinet.getVille(),
                        cabinet.getVilleArabe()
                        );
        }
}
