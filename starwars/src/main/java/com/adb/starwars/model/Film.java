package com.adb.starwars.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Node
public class Film {

    @Id
    private String title;

    @Property("episode_id")
    private int episodeId;

    @Property("opening_crawl")
    private String openingCrawl;

    private String director;
    private String producer;

    @Property("release_date")
    private ZonedDateTime releaseDate;

    @Relationship(type = "CHARACTERS")
    private List<Character> characters;

    @Relationship(type = "PLANETS")
    private List<Planet> planets;

    @Relationship(type = "SPECIES")
    private List<Species> species;

    @Relationship(type = "STARSHIPS")
    private List<Starship> starships;


    // Getters and Setters
}
