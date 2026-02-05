package com.cabinetMed.cabinetMedical.restControllers;

import com.cabinetMed.cabinetMedical.DTOs.RendezVousCreateDto;
import com.cabinetMed.cabinetMedical.DTOs.RendezVousResponseDto;
import com.cabinetMed.cabinetMedical.entities.RendezVous;
import com.cabinetMed.cabinetMedical.exception.GlobalResponse;
import com.cabinetMed.cabinetMedical.services.RendezVousService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/rendez-vous")
public class RendezVousController {

    private final RendezVousService rendezVousService;

    @PostMapping("/{patient_id}")
    public ResponseEntity<GlobalResponse<RendezVousResponseDto>> create(@Valid @RequestBody RendezVousCreateDto request, @PathVariable Long patient_id){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new GlobalResponse<>(rendezVousService.create(request,patient_id)));
    }

    @GetMapping
    public ResponseEntity<GlobalResponse<List<RendezVousResponseDto>>> getAll(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(new GlobalResponse<>(rendezVousService.getAll()));
    }

}
