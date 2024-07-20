package com.adb.starwars.repo;



import com.adb.starwars.model.Film;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends Neo4jRepository<Film, String> {
}

