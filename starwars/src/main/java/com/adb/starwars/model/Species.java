package com.adb.starwars.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Node
public class Species {


    @Id
    private String name;

    @Property("average_height")
    private String averageHeight;

    @Property("average_lifespan")
    private String averageLifespan;

    private String classification;
    private String designation;

    @Property("eye_colors")
    private String eyeColors;

    @Property("hair_colors")
    private String hairColors;

    private String language;

    @Property("skin_colors")
    private String skinColors;

    @Relationship(type = "HOMEWORLD")
    private Planet homeworld;

    }

