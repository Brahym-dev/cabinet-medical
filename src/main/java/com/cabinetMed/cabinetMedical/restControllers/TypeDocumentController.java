package com.cabinetMed.cabinetMedical.restControllers;

import com.cabinetMed.cabinetMedical.DTOs.CabinetResponseDto;
import com.cabinetMed.cabinetMedical.DTOs.TypeDocumentCreateDto;
import com.cabinetMed.cabinetMedical.entities.TypeDocument;
import com.cabinetMed.cabinetMedical.exception.GlobalResponse;
import com.cabinetMed.cabinetMedical.services.TypeDocumentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/typeDocuments")
public class TypeDocumentController {

    private final TypeDocumentService typeDocumentService;

    @PostMapping
    public ResponseEntity<GlobalResponse<TypeDocument>> create(@Valid @RequestBody TypeDocumentCreateDto request){
        return new ResponseEntity<>(new GlobalResponse<>(typeDocumentService.create(request)), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GlobalResponse<TypeDocument>> getById(@PathVariable Long id){
        return new ResponseEntity<>(new GlobalResponse<>(typeDocumentService.getTypeDocumentById(id)),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<GlobalResponse<List<TypeDocument>>> getAll(){
        return new ResponseEntity<>(new GlobalResponse<>(typeDocumentService.getAll()),HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GlobalResponse<TypeDocument>> update(@PathVariable Long id, @RequestBody TypeDocument typeDocument){
        return new ResponseEntity<>(new GlobalResponse<>(typeDocumentService.update(id, typeDocument)), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        typeDocumentService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
