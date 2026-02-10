package com.cabinetMed.cabinetMedical.restControllers;

import com.cabinetMed.cabinetMedical.DTOs.MotifConsultationCreateDto;
import com.cabinetMed.cabinetMedical.entities.MotifConsultation;
import com.cabinetMed.cabinetMedical.exception.GlobalResponse;
import com.cabinetMed.cabinetMedical.services.MotifConsultationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/motifs-consultation")
public class MotifConsultationController {
    private final MotifConsultationService motifConsultationService;

    @PostMapping
    public ResponseEntity<GlobalResponse<MotifConsultation>> create(@Valid @RequestBody MotifConsultationCreateDto request){
        return new ResponseEntity<>(new GlobalResponse<>(motifConsultationService.create(request)), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GlobalResponse<MotifConsultation>> getById(@PathVariable Long id){
        return new ResponseEntity<>(new GlobalResponse<>(motifConsultationService.getById(id)),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<GlobalResponse<List<MotifConsultation>>> getAll(){
        return new ResponseEntity<>(new GlobalResponse<>(motifConsultationService.getAll()),HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GlobalResponse<MotifConsultation>> update(@PathVariable Long id, @RequestBody MotifConsultation motifConsultation){
        return new ResponseEntity<>(new GlobalResponse<>(motifConsultationService.update(id, motifConsultation)), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        motifConsultationService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
