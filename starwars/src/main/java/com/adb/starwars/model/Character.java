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
public class Character {

    @Id
    private String name;

    @Property("birth_year")
    private String birthYear;

    @Property("eye_color")
    private String eyeColor;

    private String gender;

    @Property("hair_color")
    private String hairColor;

    private String height;
    private String mass;

    @Property("skin_color")
    private String skinColor;

   // @Relationship(type ="from", direction = Relationship.Direction.OUTGOING)
    //@Property("name")
    //private Planet homeworld;

    //@Relationship(type = "HOMEWORLD", direction = Relationship.Direction.OUTGOING)
   @Property("homeworld")
   private String homeworld;

   // @Relationship(type = "from", direction = Relationship.Direction.OUTGOING)
    @Property("species")
    private String species;

}
