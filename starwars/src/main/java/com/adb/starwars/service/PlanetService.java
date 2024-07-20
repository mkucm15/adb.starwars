package com.adb.starwars.service;


import com.adb.starwars.model.Planet;
import com.adb.starwars.repo.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlanetService {

    @Autowired
    private PlanetRepository planetRepository;

    public Planet createPlanet(Planet planet) {
        return planetRepository.save(planet);
    }

    public List<Planet> getAllPlanets() {
        return planetRepository.findAll();
    }

    public Optional<Planet> getPlanetById(String name) {
        return planetRepository.findById(name);
    }

    public Planet updatePlanet(String name, Planet planetDetails) {
        Planet planet = planetRepository.findById(name).orElseThrow();
        planet.setRotationPeriod(planetDetails.getRotationPeriod());
        planet.setOrbitalPeriod(planetDetails.getOrbitalPeriod());
        planet.setDiameter(planetDetails.getDiameter());
        planet.setClimate(planetDetails.getClimate());
        planet.setGravity(planetDetails.getGravity());
        planet.setTerrain(planetDetails.getTerrain());
        planet.setSurfaceWater(planetDetails.getSurfaceWater());
        planet.setPopulation(planetDetails.getPopulation());
        return planetRepository.save(planet);
    }

    public void deletePlanet(String name) {
        planetRepository.deleteById(name);
    }
}
