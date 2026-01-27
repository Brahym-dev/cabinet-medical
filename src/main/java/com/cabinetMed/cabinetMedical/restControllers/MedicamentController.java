package com.cabinetMed.cabinetMedical.restControllers;

import com.cabinetMed.cabinetMedical.DTOs.MedicamentCreateDto;
import com.cabinetMed.cabinetMedical.DTOs.MedicamentResponseDto;
import com.cabinetMed.cabinetMedical.entities.Medicament;
import com.cabinetMed.cabinetMedical.exception.GlobalResponse;
import com.cabinetMed.cabinetMedical.services.MedicamentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
