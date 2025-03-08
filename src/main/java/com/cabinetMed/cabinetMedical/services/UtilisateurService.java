package com.cabinetMed.cabinetMedical.services;

import com.cabinetMed.cabinetMedical.entities.Utilisateur;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UtilisateurService {

    Utilisateur saveUtilisateur(Utilisateur utilisateur);
    Utilisateur updateUtilisateur(Utilisateur utilisateur);
    Utilisateur getUtilisateurById(Long id);
    void deleteUtilisateur(Long id);
    List<Utilisateur> utilisateur();

}
