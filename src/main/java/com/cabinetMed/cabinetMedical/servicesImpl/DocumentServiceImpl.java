package com.cabinetMed.cabinetMedical.servicesImpl;

import com.cabinetMed.cabinetMedical.DTOs.DocumentCreateDto;
import com.cabinetMed.cabinetMedical.DTOs.DocumentResponseDto;
import com.cabinetMed.cabinetMedical.DTOs.DocumentUpdateDto;
import com.cabinetMed.cabinetMedical.entities.Document;
import com.cabinetMed.cabinetMedical.entities.TypeDocument;
import com.cabinetMed.cabinetMedical.exception.CustomResponseException;
import com.cabinetMed.cabinetMedical.mapper.DocumentMapper;
import com.cabinetMed.cabinetMedical.repositories.DocumentRepository;
import com.cabinetMed.cabinetMedical.repositories.TypeDocumentRepository;
import com.cabinetMed.cabinetMedical.services.DocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DocumentServiceImpl implements DocumentService {


    private final DocumentRepository documentRepository;
    private final TypeDocumentRepository typeDocumentRepository;



    @Override
    public DocumentResponseDto create(DocumentCreateDto request) {
        TypeDocument typeDocument = typeDocumentRepository
                .findById(request.typeDocumentId())
                .orElseThrow(() -> CustomResponseException.ResourceNotFound(
                        String.format("Type Document avec id " + request.typeDocumentId() + " est introuvable .")));
        Document document = DocumentMapper.toEntity(request, typeDocument);

        Document documentSaved = documentRepository.save(document);
        return DocumentMapper.toResponse(documentSaved);
    };

    @Override
    public DocumentResponseDto getById(Long id) {
        Document document = documentRepository.findById(id)
                .orElseThrow(()-> CustomResponseException.ResourceNotFound("Document avec id " + id + "est introuvable"));
        return DocumentMapper.toResponse(document);

    }

    @Override
    public List<DocumentResponseDto> getAll() {
       // return documentRepository.findAll();
        return documentRepository.findAll()
                .stream()
                .map(DocumentMapper::toResponse)
                .toList();
    }

    @Override
    public DocumentResponseDto update(Long id, DocumentUpdateDto request) {
        Document document = documentRepository.findById(id)
                .orElseThrow(()-> CustomResponseException.ResourceNotFound("Document avec id " + id + "est introuvable"));

        TypeDocument typeDocument = typeDocumentRepository.findById(request.typeDocumentId())
                .orElseThrow(()-> CustomResponseException.ResourceNotFound("Type Document avec id " + request.typeDocumentId() + "est introuvable"));

        //Mise à jour des champs
        DocumentMapper.updateEntity(document, request, typeDocument);
        return DocumentMapper.toResponse(documentRepository.save(document));
    }

    @Override
    public void delete(Long id) {
        Optional<Document> document = documentRepository.findById(id) ;
        document.ifPresent(value -> documentRepository.deleteById(value.getId()));
    }


}
