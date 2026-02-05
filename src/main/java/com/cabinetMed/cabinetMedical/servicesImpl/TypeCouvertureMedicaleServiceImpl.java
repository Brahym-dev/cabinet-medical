package com.cabinetMed.cabinetMedical.servicesImpl;

import com.cabinetMed.cabinetMedical.DTOs.TypeCouvertureMedicaleCreateDto;
import com.cabinetMed.cabinetMedical.entities.TypeCouvertureMedicale;
import com.cabinetMed.cabinetMedical.exception.CustomResponseException;
import com.cabinetMed.cabinetMedical.mapper.TypeCouvertureMedicaleMapper;
import com.cabinetMed.cabinetMedical.repositories.TypeCouvertureMedicaleRepository;
import com.cabinetMed.cabinetMedical.services.TypeCouvertureMedicaleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TypeCouvertureMedicaleServiceImpl implements TypeCouvertureMedicaleService{

    private final TypeCouvertureMedicaleRepository typeCouvertureMedicaleRepository;
    @Override
    public TypeCouvertureMedicale create(TypeCouvertureMedicaleCreateDto request) {
        return typeCouvertureMedicaleRepository.save(TypeCouvertureMedicaleMapper.toEntity(request));
    }

    @Override
    public TypeCouvertureMedicale update(Long id, TypeCouvertureMedicale request) {
        TypeCouvertureMedicale typeCouvertureMedicale = typeCouvertureMedicaleRepository.findById(id)
                .orElseThrow(() -> CustomResponseException.ResourceNotFound(
                        String.format("TypeCouvertureMedicale avec id " + id + " est introuvable .")));
        typeCouvertureMedicale.setDesignation(request.getDesignation());
        typeCouvertureMedicale.setAbrege(request.getAbrege());
        return typeCouvertureMedicaleRepository.save(typeCouvertureMedicale);
    }

    @Override
    public TypeCouvertureMedicale getById(Long id) {
        return typeCouvertureMedicaleRepository.findById(id)
                .orElseThrow(() -> CustomResponseException.ResourceNotFound(
                        String.format("TypeCouvertureMedicale avec id " + id + " est introuvable .")));
    }

    @Override
    public List<TypeCouvertureMedicale> getAll() {
         return typeCouvertureMedicaleRepository.findAll();
    }
//commentaire test git
    @Override
    public void delete(Long id) {
        Optional<TypeCouvertureMedicale> typeCouvertureMedicale = typeCouvertureMedicaleRepository.findById(id);
        typeCouvertureMedicale.ifPresent(value->typeCouvertureMedicaleRepository.deleteById(value.getId()));
    }
}
