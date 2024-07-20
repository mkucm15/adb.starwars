package com.adb.starwars.controller;


import com.adb.starwars.model.Film;
import com.adb.starwars.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/films")
public class FilmController {

    @Autowired
    private FilmService filmService;

    @PostMapping
    public Film createFilm(@RequestBody Film film) {
        return filmService.createFilm(film);
    }

    @GetMapping
    public List<Film> getAllFilms() {
        return filmService.getAllFilms();
    }

    @GetMapping("/{title}")
    public Optional<Film> getFilmById(@PathVariable String title) {
        return filmService.getFilmById(title);
    }

    @PutMapping("/{title}")
    public Film updateFilm(@PathVariable String title, @RequestBody Film filmDetails) {
        return filmService.updateFilm(title, filmDetails);
    }

    @DeleteMapping("/{title}")
    public void deleteFilm(@PathVariable String title) {
        filmService.deleteFilm(title);
    }
}

