package com.adb.starwars.service;


import com.adb.starwars.model.Film;
import com.adb.starwars.repo.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmService {

    @Autowired
    private FilmRepository filmRepository;

    public Film createFilm(Film film) {
        return filmRepository.save(film);
    }

    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }

    public Optional<Film> getFilmById(String title) {
        return filmRepository.findById(title);
    }

    public Film updateFilm(String title, Film filmDetails) {
        Film film = filmRepository.findById(title).orElseThrow();
        film.setEpisodeId(filmDetails.getEpisodeId());
        film.setOpeningCrawl(filmDetails.getOpeningCrawl());
        film.setDirector(filmDetails.getDirector());
        film.setProducer(filmDetails.getProducer());
        film.setReleaseDate(filmDetails.getReleaseDate());
        return filmRepository.save(film);
    }

    public void deleteFilm(String title) {
        filmRepository.deleteById(title);
    }
}
