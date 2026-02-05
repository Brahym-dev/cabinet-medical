package com.cabinetMed.cabinetMedical.services;

import com.cabinetMed.cabinetMedical.DTOs.TypeCouvertureMedicaleCreateDto;
import com.cabinetMed.cabinetMedical.entities.TypeCouvertureMedicale;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface TypeCouvertureMedicaleService {

    TypeCouvertureMedicale create(TypeCouvertureMedicaleCreateDto request);
    TypeCouvertureMedicale update(Long id, TypeCouvertureMedicale request);
    TypeCouvertureMedicale getById(Long id);
    List<TypeCouvertureMedicale> getAll();
    void delete(Long id);


}