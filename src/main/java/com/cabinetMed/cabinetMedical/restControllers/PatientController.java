package com.cabinetMed.cabinetMedical.restControllers;

import com.cabinetMed.cabinetMedical.DTOs.PatientDto;
import com.cabinetMed.cabinetMedical.entities.Patient;
import com.cabinetMed.cabinetMedical.services.PatientService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientController {
    private final PatientService patientService;

    @PostMapping("patient")
    public Patient savePatient(@RequestBody PatientDto patientDto) {
        return patientService.savePatient(patientDto);
    }

}
