package com.adb.starwars.controller;


import com.adb.starwars.model.Character;
import com.adb.starwars.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/characters")
public class CharacterController {

    @Autowired
    private CharacterService characterService;

    @PostMapping
    public Character createCharacter(@RequestBody Character character) {
        return characterService.createCharacter(character);
    }

    @GetMapping
    public List<Character> getAllCharacters() {
        return characterService.getAllCharacters();
    }

    @GetMapping("/{name}")
    public Optional<Character> getCharacterById(@PathVariable String name) {
        return characterService.getCharacterById(name);
    }

    @PutMapping("/{name}")
    public Character updateCharacter(@PathVariable String name, @RequestBody Character characterDetails) {
        return characterService.updateCharacter(name, characterDetails);
    }

    @DeleteMapping("/{name}")
    public void deleteCharacter(@PathVariable String name) {
        characterService.deleteCharacter(name);
    }
}

