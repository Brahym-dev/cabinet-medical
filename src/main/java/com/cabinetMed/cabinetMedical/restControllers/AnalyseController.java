package com.cabinetMed.cabinetMedical.restControllers;

import com.cabinetMed.cabinetMedical.DTOs.AnalyseCreateDto;
import com.cabinetMed.cabinetMedical.entities.Analyse;
import com.cabinetMed.cabinetMedical.exception.GlobalResponse;
import com.cabinetMed.cabinetMedical.services.AnalyseService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/analyse")
public class AnalyseController {

    private final AnalyseService analyseService;

    @PostMapping
    public ResponseEntity<GlobalResponse<Analyse>> createAnalyse(@Valid @RequestBody AnalyseCreateDto request) {
        return new ResponseEntity<>(new GlobalResponse<>(analyseService.saveAnalyse(request)), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    ResponseEntity<GlobalResponse<?>> getById(@PathVariable Long id) {
        return new ResponseEntity<>(new GlobalResponse<>(analyseService.getAnalyseById(id)), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<GlobalResponse<List<Analyse>>> getAllAnalyses() {
        return new ResponseEntity<>(new GlobalResponse<>(analyseService.analyses()), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    ResponseEntity<GlobalResponse<Analyse>> updateAnalyse(@PathVariable Long id, @Valid @RequestBody AnalyseCreateDto request) {
        return new ResponseEntity<>(new GlobalResponse<>(analyseService.updateAnalyse(id, request)), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<GlobalResponse<Void>> deleteAnalyse(@PathVariable Long id) {
        analyseService.deleteAnalyse(id);
        return ResponseEntity.noContent().build();
    }

}
