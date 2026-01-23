package com.cabinetMed.cabinetMedical.exception;

import lombok.Getter;

import java.util.List;

@Getter
public class GlobalResponse<T> {
    public final static String SUCCESS = "success";
    public final static String ERROR = "error";

    private final String status;
    private final T data;
    private final List<ErrorItem> errors;

    public record ErrorItem(String message){}

    //constructors

    //en cas d'erreur appeler ce constructeur
    public GlobalResponse(List<ErrorItem> errors){
        this.status = ERROR;
        this.errors = errors;
        this.data = null;
    }

    //en cas de succès (aucune erreur) appeler ce constructeur
    public GlobalResponse(T data){
        this.status = SUCCESS;
        this.errors = null;
        this.data = data;
    }
}
