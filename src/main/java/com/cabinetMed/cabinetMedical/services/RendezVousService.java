package com.cabinetMed.cabinetMedical.services;

import com.cabinetMed.cabinetMedical.entities.RendezVous;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface RendezVousService {

    RendezVous saveRendezVous(RendezVous rendezVous);
    RendezVous updateRendezVous(RendezVous rendezVous);
    RendezVous getRendezVousById(Long id);
    void deleteRendezVous(Long id);
    List<RendezVous> rendezVouss();

}
