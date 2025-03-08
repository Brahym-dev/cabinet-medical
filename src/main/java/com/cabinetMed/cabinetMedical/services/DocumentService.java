package com.cabinetMed.cabinetMedical.services;

import com.cabinetMed.cabinetMedical.entities.Document;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface DocumentService {

    Document saveDocument(Document document);
    Document updateDocument(Document document);
    Document getDocumentById(Long id);
    void deleteDocument(Long id);
    List<Document> documents();

}
