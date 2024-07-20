package com.adb.starwars.service;
import com.adb.starwars.model.Starship;
import com.adb.starwars.repo.StarshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StarshipService {

    @Autowired
    private StarshipRepository starshipRepository;

    public Starship createStarship(Starship starship) {
        return starshipRepository.save(starship);
    }

    public List<Starship> getAllStarships() {
        return starshipRepository.findAll();
    }

    public Optional<Starship> getStarshipById(String name) {
        return starshipRepository.findById(name);
    }

    public Starship updateStarship(String name, Starship starshipDetails) {
        Starship starship = starshipRepository.findById(name).orElseThrow();
        starship.setCrew(starshipDetails.getCrew());
        starship.setManufacturer(starshipDetails.getManufacturer());
        starship.setCostInCredits(starshipDetails.getCostInCredits());
        starship.setLength(starshipDetails.getLength());
        starship.setMaxAtmospheringSpeed(starshipDetails.getMaxAtmospheringSpeed());
        starship.setCrew(starshipDetails.getCrew());
        starship.setPassengers(starshipDetails.getPassengers());
        starship.setCargoCapacity(starshipDetails.getCargoCapacity());
        starship.setConsumables(starshipDetails.getConsumables());
        starship.setHyperdriveRating(starshipDetails.getHyperdriveRating());
        starship.setMGLT(starshipDetails.getMGLT());
        starship.setStarshipClass(starshipDetails.getStarshipClass());
        return starshipRepository.save(starship);
    }

    public void deleteStarship(String name) {
        starshipRepository.deleteById(name);
    }
}

