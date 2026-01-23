package com.cabinetMed.cabinetMedical.exception;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import java.util.List;


@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NoResourceFoundException.class)
        public ResponseEntity<GlobalResponse<?>> handleNoResourceException(NoResourceFoundException ex) {
        var errors = List.of(new GlobalResponse.ErrorItem("Resource is not found."));
        return new ResponseEntity<>(new GlobalResponse<>(errors),HttpStatus.NOT_FOUND);
    }

    //Violation de validation (ex: @NotNull)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<GlobalResponse<?>> handleValidationException(MethodArgumentNotValidException ex) {
        var errors = ex.getBindingResult().getFieldErrors().stream()
                .map(err -> new GlobalResponse.ErrorItem(err.getField() + " " + err.getDefaultMessage()))
                .toList();
        return new ResponseEntity<>(new GlobalResponse<>(errors),HttpStatus.BAD_REQUEST);
    }

    /* Mauvais type de paramètre (PathVariable / RequestParam) */
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<GlobalResponse<?>> handleTypeMismatch(MethodArgumentTypeMismatchException ex, HttpServletRequest request) {
        var errors = List.of(new GlobalResponse.ErrorItem("Mauvais type de paramètre : " + request.getRequestURI()));
        return new ResponseEntity<>(new GlobalResponse<>(errors),HttpStatus.BAD_REQUEST);

    }

    /* Erreur JSON / type / date */
//    @ExceptionHandler(HttpMessageNotReadableException.class)
//    public ResponseEntity<GlobalResponse> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,HttpServletRequest request) {
//        String message = "Format de données invalide (date ou type incorrect)";
//
//        if (ex.getCause() instanceof InvalidFormatException) {
//            message = "Format invalide pour le champ : "
//                    + ((InvalidFormatException) ex.getCause())
//                    .getPath().get(0).getFieldName();
//        }
//        var errors = List.of(new GlobalResponse.ErrorItem(message));
//        return new ResponseEntity<>(new GlobalResponse<>(errors),HttpStatus.BAD_REQUEST);
//    }

    //exception personnalisée
    @ExceptionHandler(CustomResponseException.class)
    public ResponseEntity<GlobalResponse<?>> handleCustomResponseException(CustomResponseException ex) {
        var errors = List.of(new GlobalResponse.ErrorItem(ex.getMessage()));
        return new ResponseEntity<>(new GlobalResponse<>(errors),HttpStatus.resolve(ex.getCode()));
    }

}
