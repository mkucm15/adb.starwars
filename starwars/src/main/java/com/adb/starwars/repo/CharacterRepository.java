package com.adb.starwars.repo;
import com.adb.starwars.model.Character;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends Neo4jRepository<Character, String> {
}
