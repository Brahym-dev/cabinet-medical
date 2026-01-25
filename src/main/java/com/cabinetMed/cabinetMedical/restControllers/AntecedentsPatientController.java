package com.cabinetMed.cabinetMedical.restControllers;

import com.cabinetMed.cabinetMedical.DTOs.AntecedentsPatientCreate;
import com.cabinetMed.cabinetMedical.entities.AntecedentsPatient;
import com.cabinetMed.cabinetMedical.entities.TypeDocument;
import com.cabinetMed.cabinetMedical.exception.GlobalResponse;
import com.cabinetMed.cabinetMedical.services.AntecedentsPatientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/antecedentPatient")
public class AntecedentsPatientController {

    @Autowired
    private AntecedentsPatientService antecedentsPatientService;

    @PostMapping
    public ResponseEntity<AntecedentsPatient> createAntecedentsPatient(@RequestBody @Valid AntecedentsPatientCreate antecedentsPatientCreate) {
        AntecedentsPatient antecedentsPatient = antecedentsPatientService.saveAntecedentsPatient(antecedentsPatientCreate);
        return new ResponseEntity<>(antecedentsPatient, HttpStatus.CREATED);
    }

    @PutMapping("/{antecedentId}")
    public AntecedentsPatient updateAntecedentsPatient(@RequestBody AntecedentsPatientCreate antecedentsPatientCreate,
                                                       @PathVariable Long antecedentId) {
        return antecedentsPatientService.updateAntecedentsPatient(antecedentsPatientCreate, antecedentId);
    }

    @GetMapping("/{antecedentId}")
    public ResponseEntity<GlobalResponse<AntecedentsPatient>> getAntecedentsPatient(@PathVariable Long antecedentId) {
        System.out.println("hello test git");
        return new ResponseEntity<>(new
                GlobalResponse<>(antecedentsPatientService.getAntecedentsPatientById(antecedentId)), HttpStatus.OK);
    }


    @GetMapping
    public ResponseEntity<GlobalResponse<List<AntecedentsPatient>>> getAllAntecedentsPatient() {
        return new ResponseEntity<>(new GlobalResponse<>(antecedentsPatientService.antecedentsPatients()), HttpStatus.OK);
    }

    @DeleteMapping("/{antecedentId}")
    public void deleteAntecedentsPatient(@PathVariable Long antecedentId) {
        antecedentsPatientService.deleteAntecedentsPatient(antecedentId);
    }

}
