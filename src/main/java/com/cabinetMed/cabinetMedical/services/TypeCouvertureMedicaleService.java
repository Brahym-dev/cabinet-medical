package com.cabinetMed.cabinetMedical.services;

import com.cabinetMed.cabinetMedical.entities.TypeCouvertureMedicale;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface TypeCouvertureMedicaleService {

    TypeCouvertureMedicale saveTypeCouvertureMedicale(TypeCouvertureMedicale typeCouvertureMedicale);
    TypeCouvertureMedicale updateTypeCouvertureMedicale(TypeCouvertureMedicale typeCouvertureMedicale);
    TypeCouvertureMedicale getTypeCouvertureMedicaleById(Long id);
    void deleteTypeCouvertureMedicale(Long id);
    List<TypeCouvertureMedicale> typeCouvertureMedicales();

}
