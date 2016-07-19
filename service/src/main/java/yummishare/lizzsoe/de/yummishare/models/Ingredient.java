package yummishare.lizzsoe.de.yummishare.models;

import org.apache.commons.lang3.builder.EqualsBuilder;

import java.util.List;

/**
 *  Modellierung einer Zutat
 */
public class Ingredient {

    private final String name;
    private String description;
    private List<String> synonyms;

    private String picture;
    private LifeStyle lifestyle = LifeStyle.FLEISCH;

    public Ingredient(final String name){
        this.name = name;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public List<String> getSynonyms() { return synonyms; }
    public String getPicture() { return picture; }
    public LifeStyle getLifestyle() { return lifestyle;}

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSynonyms(List<String> synonyms) {
        this.synonyms = synonyms;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setLifestyle(LifeStyle lifestyle) {
        this.lifestyle = lifestyle;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(obj == null || !(obj instanceof Ingredient)) return false;

        Ingredient other = (Ingredient) obj;

        EqualsBuilder builder = new EqualsBuilder();
        builder.append(name.trim().toLowerCase() , other.name.trim().toLowerCase());
        builder.append(lifestyle.toString(), other.lifestyle.toString());

        return builder.build() || synonyms.contains(other.name);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("**********Ingredient**********");
        builder.append("Name: " + this.name);
        builder.append("Beschreibung: " + this.description);
        builder.append("Synonyme: " + this.synonyms.toString());
        builder.append("Lifestyle: " + this.lifestyle);

        return builder.toString();
    }
}