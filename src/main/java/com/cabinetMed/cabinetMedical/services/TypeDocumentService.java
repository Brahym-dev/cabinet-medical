package com.cabinetMed.cabinetMedical.services;

import com.cabinetMed.cabinetMedical.entities.TypeDocument;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface TypeDocumentService {

    TypeDocument saveTypeDocument(TypeDocument typeDocument);
    TypeDocument updateTypeDocument(TypeDocument typeDocument);
    TypeDocument getTypeDocumentById(Long id);
    void deleteTypeDocument(Long id);
    List<TypeDocument> typeDocuments();

}
