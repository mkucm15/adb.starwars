package com.adb.starwars.repo;

import com.adb.starwars.model.Starship;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StarshipRepository extends Neo4jRepository<Starship, String> {
}
