package com.cabinetMed.cabinetMedical.restControllers;

import com.cabinetMed.cabinetMedical.DTOs.MedicamentCreateDto;
import com.cabinetMed.cabinetMedical.DTOs.MedicamentResponseDto;
import com.cabinetMed.cabinetMedical.DTOs.MedicamentUpdateDto;
import com.cabinetMed.cabinetMedical.entities.Medicament;
import com.cabinetMed.cabinetMedical.exception.GlobalResponse;
import com.cabinetMed.cabinetMedical.services.MedicamentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("api/medicaments")

public class MedicamentController {

    private final MedicamentService medicamentService;


    @PostMapping
    public ResponseEntity<GlobalResponse<MedicamentResponseDto>> create(@Valid @RequestBody MedicamentCreateDto request){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new GlobalResponse<>(medicamentService.create(request)));
    }

    @GetMapping
    public ResponseEntity<GlobalResponse<List<MedicamentResponseDto>>> getAll(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(new GlobalResponse<>(medicamentService.getAll()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<GlobalResponse<MedicamentResponseDto>> getById(@PathVariable Long id){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(new GlobalResponse<>(medicamentService.getById(id)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<GlobalResponse<MedicamentResponseDto>> update(@PathVariable Long id, @RequestBody MedicamentUpdateDto request){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(new GlobalResponse<>(medicamentService.update(id,request)));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        medicamentService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
