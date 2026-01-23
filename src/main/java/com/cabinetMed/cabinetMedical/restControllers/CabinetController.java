package com.cabinetMed.cabinetMedical.restControllers;

import com.cabinetMed.cabinetMedical.DTOs.CabinetCreateDto;
import com.cabinetMed.cabinetMedical.DTOs.CabinetResponseDto;
import com.cabinetMed.cabinetMedical.entities.Cabinet;
import com.cabinetMed.cabinetMedical.exception.GlobalResponse;
import com.cabinetMed.cabinetMedical.services.CabinetService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/cabinets")
@RequiredArgsConstructor
public class CabinetController {

    private final CabinetService cabinetService;

    @PostMapping
    public ResponseEntity<GlobalResponse<CabinetResponseDto>> create(@Valid @RequestBody CabinetCreateDto request){
        return new ResponseEntity<>(new GlobalResponse<>(cabinetService.create(request)), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GlobalResponse<CabinetResponseDto>> getById(@PathVariable Long id){
        return new ResponseEntity<>(new GlobalResponse<>(cabinetService.getById(id)), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<GlobalResponse<List<CabinetResponseDto>>> getAll(){
        return new ResponseEntity<>(new GlobalResponse<>(cabinetService.getAll()), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GlobalResponse<CabinetResponseDto>> update(
            @PathVariable Long id,
            @RequestBody @Valid CabinetCreateDto cabinet){
       return new ResponseEntity<>(new GlobalResponse<>(cabinetService.update(id, cabinet)), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CabinetResponseDto> delete(@PathVariable Long id){
        cabinetService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
