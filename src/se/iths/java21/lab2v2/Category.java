package se.iths.java21.lab2v2;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Category {
    @JsonProperty("MEAT")
    MEAT("Meat"),
    @JsonProperty("VEGETABLES")
    VEGETABLES("be"),
    @JsonProperty("DRYGOODS")
    DRYGOODS("be2"),;

    private String name;

    @JsonValue
    public String getName() {
        return name;
    }

     Category(String name){
        this.name = name;
    }
}
