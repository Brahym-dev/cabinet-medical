package com.cabinetMed.cabinetMedical.services;

import com.cabinetMed.cabinetMedical.entities.Radio;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface RadioService {

    Radio saveRadio(Radio radio);
    Radio updateRadio(Radio radio);
    Radio getRadioById(Long id);
    void deleteRadio(Long id);
    List<Radio> radios();

}
