package com.cabinetMed.cabinetMedical.restControllers;

import com.cabinetMed.cabinetMedical.DTOs.BilanCreateDto;
import com.cabinetMed.cabinetMedical.exception.GlobalResponse;
import com.cabinetMed.cabinetMedical.services.BilanService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bilan")
@RequiredArgsConstructor
public class BilanController {

    BilanService bilanService;

    @PostMapping
    public ResponseEntity<GlobalResponse<BilanCreateDto>> createBilan(@RequestBody @Valid BilanCreateDto bilan) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new GlobalResponse<>(bilanService.saveBilan(bilan)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<GlobalResponse<BilanCreateDto>> getBilan(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(new GlobalResponse<>(bilanService.getBilanById(id)));
    }

    @GetMapping
    public ResponseEntity<GlobalResponse<List<BilanCreateDto>>> getAllBilan() {
        return ResponseEntity.status(HttpStatus.OK).body(new GlobalResponse<>(bilanService.getAllBilans()));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteBilan(@PathVariable Long id) {
        bilanService.deleteBilan(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<GlobalResponse<BilanCreateDto>> updateBilan(@RequestBody @Valid BilanCreateDto bilan, @PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(new GlobalResponse<>(bilanService.updateBilan(bilan, id)));
    }

}
