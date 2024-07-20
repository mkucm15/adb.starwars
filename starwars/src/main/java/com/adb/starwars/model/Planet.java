package com.adb.starwars.model;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Node
public class Planet {
    @Id
    private String name;
    private String climate;
    private String diameter;
    private String gravity;

    @Property("orbital_period")
    private String orbitalPeriod;

    private String population;

    @Property("rotation_period")
    private String rotationPeriod;

    @Property("surface_water")
    private String surfaceWater;

    private String terrain;
}

