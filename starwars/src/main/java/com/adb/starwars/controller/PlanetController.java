package com.adb.starwars.controller;



import com.adb.starwars.model.Planet;
import com.adb.starwars.service.PlanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/planets")
public class PlanetController {

    @Autowired
    private PlanetService planetService;

    @PostMapping
    public Planet createPlanet(@RequestBody Planet planet) {
        return planetService.createPlanet(planet);
    }

    @GetMapping
    public List<Planet> getAllPlanets() {
        return planetService.getAllPlanets();
    }

    @GetMapping("/{name}")
    public Optional<Planet> getPlanetById(@PathVariable String name) {
        return planetService.getPlanetById(name);
    }

    @PutMapping("/{name}")
    public Planet updatePlanet(@PathVariable String name, @RequestBody Planet planetDetails) {
        return planetService.updatePlanet(name, planetDetails);
    }

    @DeleteMapping("/{name}")
    public void deletePlanet(@PathVariable String name) {
        planetService.deletePlanet(name);
    }
}
