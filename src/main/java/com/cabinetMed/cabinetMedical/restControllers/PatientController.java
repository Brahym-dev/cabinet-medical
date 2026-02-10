package com.cabinetMed.cabinetMedical.restControllers;

import com.cabinetMed.cabinetMedical.DTOs.DocumentResponseDto;
import com.cabinetMed.cabinetMedical.DTOs.DocumentUpdateDto;
import com.cabinetMed.cabinetMedical.DTOs.PatientCreateDto;
import com.cabinetMed.cabinetMedical.DTOs.PatientResponseShortDto;
import com.cabinetMed.cabinetMedical.entities.Patient;
import com.cabinetMed.cabinetMedical.exception.GlobalResponse;
import com.cabinetMed.cabinetMedical.services.PatientService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/{id}")
    public ResponseEntity<GlobalResponse<PatientResponseShortDto>> getById(@PathVariable Long id){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(new GlobalResponse<>(patientService.getById(id)));
    }

    @GetMapping
    public ResponseEntity<GlobalResponse<List<PatientResponseShortDto>>> getAll(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(new GlobalResponse<>(patientService.getAll()));
    }

    @PutMapping("/{id}")
    public ResponseEntity<GlobalResponse<PatientResponseShortDto>> update(@PathVariable Long id, @RequestBody Patient request){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(new GlobalResponse<>(patientService.update(id, request)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        patientService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
