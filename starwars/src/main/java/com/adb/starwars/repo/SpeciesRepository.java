package com.adb.starwars.repo;


import com.adb.starwars.model.Species;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeciesRepository extends Neo4jRepository<Species, String> {
}

