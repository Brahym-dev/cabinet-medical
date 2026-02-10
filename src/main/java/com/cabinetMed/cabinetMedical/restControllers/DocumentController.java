package com.cabinetMed.cabinetMedical.restControllers;

import com.cabinetMed.cabinetMedical.DTOs.*;
import com.cabinetMed.cabinetMedical.exception.GlobalResponse;
import com.cabinetMed.cabinetMedical.services.DocumentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/documents")
public class DocumentController {

    private final DocumentService documentService;
    @PostMapping
    public ResponseEntity<GlobalResponse<DocumentResponseDto>> create(@RequestBody @Valid DocumentCreateDto request){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new GlobalResponse<>(documentService.create(request)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<GlobalResponse<DocumentResponseDto>> getById(@PathVariable Long id){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(new GlobalResponse<>(documentService.getById(id)));
    }

    @GetMapping
    public ResponseEntity<GlobalResponse<List<DocumentResponseDto>>> getAll(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(new GlobalResponse<>(documentService.getAll()));
    }

    @PutMapping("/{id}")
    public ResponseEntity<GlobalResponse<DocumentResponseDto>> update(@PathVariable Long id, @RequestBody DocumentUpdateDto request){

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(new GlobalResponse<>(documentService.update(id, request)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        documentService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
