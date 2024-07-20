package com.adb.starwars.repo;


import com.adb.starwars.model.Planet;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanetRepository extends Neo4jRepository<Planet, String> {
}

