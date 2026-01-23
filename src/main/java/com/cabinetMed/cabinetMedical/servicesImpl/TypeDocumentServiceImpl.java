package com.cabinetMed.cabinetMedical.servicesImpl;

import com.cabinetMed.cabinetMedical.DTOs.CabinetCreateDto;
import com.cabinetMed.cabinetMedical.DTOs.CabinetResponseDto;
import com.cabinetMed.cabinetMedical.DTOs.TypeDocumentCreateDto;
import com.cabinetMed.cabinetMedical.DTOs.TypeDocumentResponseDto;
import com.cabinetMed.cabinetMedical.entities.Cabinet;
import com.cabinetMed.cabinetMedical.entities.TypeDocument;
import com.cabinetMed.cabinetMedical.exception.CustomResponseException;
import com.cabinetMed.cabinetMedical.mapper.CabinetMapper;
import com.cabinetMed.cabinetMedical.mapper.TypeDocumentMapper;
import com.cabinetMed.cabinetMedical.repositories.TypeDocumentRepository;
import com.cabinetMed.cabinetMedical.services.TypeDocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class TypeDocumentServiceImpl implements TypeDocumentService {

    private final TypeDocumentRepository typeDocumentRepository;

    @Override
    public TypeDocument create(TypeDocumentCreateDto request) {
        TypeDocument typeDocument = TypeDocumentMapper.toEntity(request);
        return typeDocumentRepository.save(typeDocument);
    }

    @Override
    public TypeDocument getTypeDocumentById(Long id) {
        return typeDocumentRepository.findById(id).orElseThrow(() -> CustomResponseException.ResourceNotFound(
                String.format("TypeDocument avec id " + id + " est introuvable .")));

    //update fields


    }

    @Override
    public List<TypeDocument> getAll() {
        return typeDocumentRepository.findAll();
    }

    @Override
    public TypeDocument update(Long id, TypeDocument request) {
        TypeDocument typeDocument = typeDocumentRepository.findById(id).orElseThrow(() -> CustomResponseException.ResourceNotFound(
                String.format("TypeDocument avec id " + id + " est introuvable .")));
        typeDocument.setDesignation(request.getDesignation());

        return typeDocumentRepository.save(typeDocument);
    }



    @Override
    public void delete(Long id) {
        Optional<TypeDocument> typeDocument = typeDocumentRepository.findById(id) ;
        typeDocument.ifPresent(value -> typeDocumentRepository.deleteById(value.getId()));
    }

}
