package com.adb.starwars.controller;

import com.adb.starwars.model.Species;
import com.adb.starwars.service.SpeciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/species")
public class SpeciesController {

    @Autowired
    private SpeciesService speciesService;

    @PostMapping
    public Species createSpecies(@RequestBody Species species) {
        return speciesService.createSpecies(species);
    }

    @GetMapping
    public List<Species> getAllSpecies() {
        return speciesService.getAllSpecies();
    }

    @GetMapping("/{name}")
    public Optional<Species> getSpeciesById(@PathVariable String name) {
        return speciesService.getSpeciesById(name);
    }

    @PutMapping("/{name}")
    public Species updateSpecies(@PathVariable String name, @RequestBody Species speciesDetails) {
        return speciesService.updateSpecies(name, speciesDetails);
    }

    @DeleteMapping("/{name}")
    public void deleteSpecies(@PathVariable String name) {
        speciesService.deleteSpecies(name);
    }
}
