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
public class Starship {

    @Id
    private String name;

    @Property("starship_class")
    private String starshipClass;

    @Property("manufacturer")
    private String manufacturer;

    @Property("cost_in_credits")
    private String costInCredits;

    @Property("length")
    private String length;

    @Property("crew")
    private String crew;

    @Property("passengers")
    private String passengers;

    @Property("max_atmosphering_speed")
    private String maxAtmospheringSpeed;

    @Property("hyperdrive_rating")
    private String hyperdriveRating;

    @Property("MGLT")
    private String MGLT;

    @Property("cargo_capacity")
    private String cargoCapacity;

    @Property("consumables")
    private String consumables;
}
