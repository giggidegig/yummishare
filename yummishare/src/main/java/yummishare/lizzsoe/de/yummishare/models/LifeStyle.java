package yummishare.lizzsoe.de.yummishare.models;

/**
 *  Beschreibt den Ernähungs LyfeStyle (Vegan | Vegetrisch etc. )
 */
public enum LifeStyle implements NoGoAttribute {
    VEGAN("Vegan"),
    VEGETARIER("Vegetarier"),
    FLEISCH("Fleisch");

    private final String lifeStyle;

    private LifeStyle(String lifeStyle){
        this.lifeStyle = lifeStyle;
    }

    @Override
    public NoGoAttribute getNoGoAttribute(){
        return this;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
