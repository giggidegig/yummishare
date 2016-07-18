package yummishare.lizzsoe.de.yummishare.models;

/**
 * Beschreibung von Mengenangaben
 */
public enum Unit {
    GRAMM("Gramm"),
    KILO("Kilo"),

    MILLILITER("Milliliter"),
    LITER("Liter"),

    STUECK_ANZAHL("Anzahl");

    private String unitDescription;

    private Unit(String unitDescription){
        this.unitDescription = unitDescription;
    }

    @Override
    public String toString() {
        return unitDescription;
    }
}