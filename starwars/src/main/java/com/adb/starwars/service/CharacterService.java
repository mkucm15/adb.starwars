package com.adb.starwars.service;

import com.adb.starwars.model.Character;
import com.adb.starwars.model.Planet;
import com.adb.starwars.repo.CharacterRepository;
import com.adb.starwars.repo.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CharacterService {

    @Autowired
    private CharacterRepository characterRepository;
    @Autowired
    private PlanetRepository planetRepository;
   /*public Character createCharacter(Character character) {
      if (character.getHomeworld() != null) {
            Planet planet = planetRepository.findById(character.getHomeworld().getName()).orElseThrow(() -> new RuntimeException("Planet not found"));
           character.setHomeworld(planet);
        }
        return characterRepository.save(character);
    }*/
    public Character createCharacter(Character character) {
        return characterRepository.save(character);
    }

    public List<Character> getAllCharacters() {
        return characterRepository.findAll();
    }

    public Optional<Character> getCharacterById(String name) {
        return characterRepository.findById(name);
    }

    public Character updateCharacter(String name, Character characterDetails) {
        Character character = characterRepository.findById(name).orElseThrow();
        character.setHeight(characterDetails.getHeight());
        character.setMass(characterDetails.getMass());
        character.setHairColor(characterDetails.getHairColor());
        character.setSkinColor(characterDetails.getSkinColor());
        character.setEyeColor(characterDetails.getEyeColor());
        character.setBirthYear(characterDetails.getBirthYear());
        character.setGender(characterDetails.getGender());
       //character.setHomeworld(characterDetails.getHomeworld());
       // character.setSpecies(characterDetails.getSpecies());
        return characterRepository.save(character);
    }

    public void deleteCharacter(String name) {
        characterRepository.deleteById(name);
    }
}
