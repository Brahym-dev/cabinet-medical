package com.cabinetMed.cabinetMedical.DTOs;



import lombok.*;

import java.util.Date;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PatientDto {
    private Long id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String adresse;
    private String telephone;
    private String email;
    private String groupeSanguin;
    private String situationFamiliale;
    private String numeroAssurance;
    private int sexe;
    private String profession;
    private double solde;
    private String cnie;
    private String notes;
    private String antecedentFamiliaux;
    private String antecedentsChurirgicaux;
    private String antecedentsMedicaux;
    private String antecedentAutres;


    private List<ConsultationDto> consultationDtos;

    private List<RendezVousCreateDto> rendezVousDtos;

    private List<BilanDto> bilanDtos;

    private TypeCouvertureMedicaleDto typeCouvertureMedicaleDto;

    private List<RadiologieDto> radiologieDtos;

    private List<DocumentUpdateDto> documentDtos;


//    // Convert Entity to DTO
//    public static Patient toEntity(PatientDto dto) {
//        if (dto == null) return null;
//        Patient entity = new Patient();
//        entity.setId(dto.getId());
//        entity.setNom(dto.getNom());
//        entity.setPrenom(dto.getPrenom());
//        entity.setDateNaissance(dto.getDateNaissance());
//        entity.setAdresse(dto.getAdresse());
//        entity.setTelephone(dto.getTelephone());
//        entity.setEmail(dto.getEmail());
//        entity.setGroupeSanguin(dto.getGroupeSanguin());
//        entity.setSituationFamiliale(dto.getSituationFamiliale());
//        entity.setNumeroAssurance(dto.getNumeroAssurance());
//        entity.setSexe(dto.getSexe());
//        entity.setProfession(dto.getProfession());
//        entity.setSolde(dto.getSolde());
//        entity.setCnie(dto.getCnie());
//        entity.setNotes(dto.getNotes());
//        entity.setAntecedentFamiliaux(dto.getAntecedentFamiliaux());
//        entity.setAntecedentsChurirgicaux(dto.getAntecedentsChurirgicaux());
//        entity.setAntecedentsMedicaux(dto.getAntecedentsMedicaux());
//        entity.setAntecedentAutres(dto.getAntecedentAutres());
//
//        if (dto.getConsultationDtos()!=null){
//            entity.setConsultations(dto.getConsultationDtos()
//                    .stream().map(ConsultationDto::toEntity)
//                    .collect(Collectors.toList()));
//        }
//
//        if(dto.getRendezVousDtos()!=null){
//            entity.setRendezVous(dto.getRendezVousDtos().stream()
//                    .map(RendezVousDto::toEntity)
//                    .collect(Collectors.toList()));
//        }
//
//        if(dto.getTypeCouvertureMedicaleDto()!=null){
//            entity.setTypeCouvertureMedicale(TypeCouvertureMedicaleDto.toEntity(dto.getTypeCouvertureMedicaleDto()));
//        }
//
//        if (dto.getRadiologieDtos()!=null){
//            entity.setRadiologies(dto.getRadiologieDtos()
//                    .stream().map(RadiologieDto::toEntity)
//                    .toList());
//        }
//        if (dto.getDocumentDtos()!=null){
//            entity.setDocuments(dto.getDocumentDtos()
//                    .stream().map(DocumentUpdateDto::dtoToEntity)
//                    .toList());
//        }
//        return entity;
//    }
//
//    // Conversion Entity to DTO
//    public static PatientDto fromEntity(Patient entity) {
//        if (entity == null) return null;
//        PatientDto dto = new PatientDto();
//
//        dto.setId(entity.getId());
//        dto.setNom(entity.getNom());
//        dto.setPrenom(entity.getPrenom());
//        dto.setDateNaissance(entity.getDateNaissance());
//        dto.setAdresse(entity.getAdresse());
//        dto.setTelephone(entity.getTelephone());
//        dto.setEmail(entity.getEmail());
//        dto.setGroupeSanguin(entity.getGroupeSanguin());
//        dto.setSituationFamiliale(entity.getSituationFamiliale());
//        dto.setNumeroAssurance(entity.getNumeroAssurance());
//        dto.setSexe(entity.getSexe());
//        dto.setProfession(entity.getProfession());
//        dto.setSolde(entity.getSolde());
//        dto.setCnie(entity.getCnie());
//        dto.setNotes(entity.getNotes());
//        dto.setAntecedentFamiliaux(entity.getAntecedentFamiliaux());
//        dto.setAntecedentsChurirgicaux(entity.getAntecedentsChurirgicaux());
//        dto.setAntecedentsMedicaux(entity.getAntecedentsMedicaux());
//        dto.setAntecedentAutres(entity.getAntecedentAutres());
//
//        if (entity.getConsultations()!=null){
//            dto.setConsultationDtos(entity.getConsultations()
//                    .stream().map(ConsultationDto::fromEntity)
//                    .collect(Collectors.toList()));
//        }
//
//        if(entity.getRendezVous()!=null){
//            dto.setRendezVousDtos(entity.getRendezVous().stream()
//                    .map(RendezVousDto::fromEntity)
//                    .collect(Collectors.toList()));
//        }
//
//        if(entity.getTypeCouvertureMedicale()!=null){
//            dto.setTypeCouvertureMedicaleDto(TypeCouvertureMedicaleDto.fromEntity(entity.getTypeCouvertureMedicale()));
//        }
//
//        if (entity.getRadiologies()!=null){
//            dto.setRadiologieDtos(entity.getRadiologies()
//                    .stream().map(RadiologieDto::fromEntity)
//                    .toList());
//        }
//        if (entity.getDocuments()!=null){
//            dto.setDocumentDtos(entity.getDocuments()
//                    .stream().map(DocumentUpdateDto::entityToDto)
//                    .toList());
//        }
//        return dto;
//    }
}
