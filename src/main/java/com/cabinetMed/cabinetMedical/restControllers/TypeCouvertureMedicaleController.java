package com.cabinetMed.cabinetMedical.restControllers;

import com.cabinetMed.cabinetMedical.DTOs.TypeCouvertureMedicaleCreateDto;
import com.cabinetMed.cabinetMedical.entities.TypeCouvertureMedicale;
import com.cabinetMed.cabinetMedical.exception.GlobalResponse;
import com.cabinetMed.cabinetMedical.services.TypeCouvertureMedicaleService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/couverture-medic")
public class TypeCouvertureMedicaleController {

    private final TypeCouvertureMedicaleService typeCouvertureMedicaleService;

    @PostMapping
    public ResponseEntity<GlobalResponse<TypeCouvertureMedicale>> create(@Valid @RequestBody TypeCouvertureMedicaleCreateDto request){
        return new ResponseEntity<>(new GlobalResponse<>(typeCouvertureMedicaleService.create(request)), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GlobalResponse<TypeCouvertureMedicale>> getById(@PathVariable Long id){
        return new ResponseEntity<>(new GlobalResponse<>(typeCouvertureMedicaleService.getById(id)),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<GlobalResponse<List<TypeCouvertureMedicale>>> getAll(){
        return new ResponseEntity<>(new GlobalResponse<>(typeCouvertureMedicaleService.getAll()),HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GlobalResponse<TypeCouvertureMedicale>> update(@PathVariable Long id, @RequestBody TypeCouvertureMedicale typeCouvertureMedicale){
        return new ResponseEntity<>(new GlobalResponse<>(typeCouvertureMedicaleService.update(id, typeCouvertureMedicale)), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        typeCouvertureMedicaleService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
