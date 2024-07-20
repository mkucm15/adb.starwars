package com.adb.starwars.service;

import com.adb.starwars.model.Species;
import com.adb.starwars.repo.SpeciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpeciesService {

    @Autowired
    private SpeciesRepository speciesRepository;

    public Species createSpecies(Species species) {
        return speciesRepository.save(species);
    }

    public List<Species> getAllSpecies() {
        return speciesRepository.findAll();
    }

    public Optional<Species> getSpeciesById(String name) {
        return speciesRepository.findById(name);
    }

    public Species updateSpecies(String name, Species speciesDetails) {
        Species species = speciesRepository.findById(name).orElseThrow();
        species.setClassification(speciesDetails.getClassification());
        species.setDesignation(speciesDetails.getDesignation());
        species.setAverageHeight(speciesDetails.getAverageHeight());
        species.setSkinColors(speciesDetails.getSkinColors());
        species.setHairColors(speciesDetails.getHairColors());
        species.setEyeColors(speciesDetails.getEyeColors());
        species.setAverageLifespan(speciesDetails.getAverageLifespan());
        species.setLanguage(speciesDetails.getLanguage());
        species.setHomeworld(speciesDetails.getHomeworld());
        return speciesRepository.save(species);
    }

    public void deleteSpecies(String name) {
        speciesRepository.deleteById(name);
    }
}

