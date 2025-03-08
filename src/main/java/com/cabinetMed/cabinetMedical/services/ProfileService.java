package com.cabinetMed.cabinetMedical.services;

import com.cabinetMed.cabinetMedical.entities.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProfileService {

    Profile saveProfile(Profile profile);
    Profile updateProfile(Profile profile);
    Profile getProfileById(Long id);
    void deleteProfile(Long id);
    List<Profile> profiles();

}
