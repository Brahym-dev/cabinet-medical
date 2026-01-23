package com.cabinetMed.cabinetMedical.servicesImpl;

import com.cabinetMed.cabinetMedical.DTOs.CabinetCreateDto;
import com.cabinetMed.cabinetMedical.DTOs.CabinetResponseDto;
import com.cabinetMed.cabinetMedical.entities.Cabinet;
import com.cabinetMed.cabinetMedical.exception.CustomResponseException;
import com.cabinetMed.cabinetMedical.mapper.CabinetMapper;
import com.cabinetMed.cabinetMedical.repositories.CabinetRepository;
import com.cabinetMed.cabinetMedical.services.CabinetService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CabinetServiceImpl implements CabinetService {

    private final CabinetRepository cabinetRepository;

    @Override
    public CabinetResponseDto create(CabinetCreateDto request) {
            Cabinet cabinet = CabinetMapper.toEntity(request);
            return CabinetMapper.toResponse(cabinetRepository.save(cabinet));
    }

    @Override
    public CabinetResponseDto getById(Long id) {
        Cabinet cabinet = cabinetRepository.findById(id)
                .orElseThrow(() -> CustomResponseException.ResourceNotFound("Cabinet avec id " + id + " est introuvable ."));
        return CabinetMapper.toResponse(cabinet);
    }

    @Override
    public List<CabinetResponseDto> getAll() {
        return cabinetRepository.findAll()
                .stream()
                .map(CabinetMapper::toResponse)
                .toList();
    }

    @Override
    public CabinetResponseDto update(Long id, CabinetCreateDto request) {
        Cabinet cabinet = cabinetRepository.findById(id)
                .orElseThrow(() -> CustomResponseException.ResourceNotFound(
                        String.format("Cabinet avec id " + id + " est introuvable .")));

        //Mise à jour des champs
        cabinet.setNomCabinet(request.nomCabinet());
        cabinet.setNomMedecin(request.nomMedecin());
        cabinet.setSpecialiteMedecin(request.specialiteMedecin());
        cabinet.setAdresseCabinet(request.adresseCabinet());
        cabinet.setNumeroOrder(request.numeroOrder());
        cabinet.setTelephone(request.telephone());
        cabinet.setMobile(request.mobile());
        cabinet.setSiteWeb(request.siteWeb());
        cabinet.setFax(request.fax());
        cabinet.setEmail(request.email());
        cabinet.setNomCabinetArabe(request.nomCabinetArabe());
        cabinet.setNomMedecinArabe(request.nomMedecinArabe());
        cabinet.setSpecialiteMedecinArabe(request.specialiteMedecinArabe());
        cabinet.setAdresseArabe(request.adresseArabe());
        cabinet.setProfilCabinet(request.profilCabinet());
        cabinet.setNomMedecin(request.ville());
        cabinet.setVilleArabe(request.villeArabe());

        Cabinet updateCabinet = cabinetRepository.save(cabinet);
        return CabinetMapper.toResponse(updateCabinet);
    }

    @Override
    public void delete(Long id) {
        Optional<Cabinet> cabinet = cabinetRepository.findById(id) ;
        cabinet.ifPresent(value -> cabinetRepository.deleteById(value.getId()));
    }

}
