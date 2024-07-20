package com.adb.starwars.controller;
import com.adb.starwars.model.Starship;
import com.adb.starwars.service.StarshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/starships")
public class StarshipController {

    @Autowired
    private StarshipService starshipService;

    @PostMapping
    public Starship createStarship(@RequestBody Starship starship) {
        return starshipService.createStarship(starship);
    }

    @GetMapping
    public List<Starship> getAllStarships() {
        return starshipService.getAllStarships();
    }

    @GetMapping("/{name}")
    public Optional<Starship> getStarshipById(@PathVariable String name) {
        return starshipService.getStarshipById(name);
    }

    @PutMapping("/{name}")
    public Starship updateStarship(@PathVariable String name, @RequestBody Starship starshipDetails) {
        return starshipService.updateStarship(name, starshipDetails);
    }

    @DeleteMapping("/{name}")
    public void deleteStarship(@PathVariable String name) {
        starshipService.deleteStarship(name);
    }
}
