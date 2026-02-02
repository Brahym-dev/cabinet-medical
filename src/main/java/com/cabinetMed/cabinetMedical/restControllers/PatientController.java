package com.cabinetMed.cabinetMedical.restControllers;

import com.cabinetMed.cabinetMedical.DTOs.PatientCreateDto;
import com.cabinetMed.cabinetMedical.DTOs.PatientResponseShortDto;
import com.cabinetMed.cabinetMedical.entities.Patient;
import com.cabinetMed.cabinetMedical.exception.GlobalResponse;
import com.cabinetMed.cabinetMedical.services.PatientService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/patients")
@RequiredArgsConstructor
public class PatientController {
    private final PatientService patientService;

    @PostMapping
    public ResponseEntity<GlobalResponse<PatientResponseShortDto>> create(@Valid @RequestBody PatientCreateDto request) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new GlobalResponse<>(patientService.create(request)));
    }

}
