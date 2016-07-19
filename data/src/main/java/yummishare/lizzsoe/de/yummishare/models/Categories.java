package yummishare.lizzsoe.de.yummishare.models;

/**
 * Unterteilung der Rezepte in Kategorien
 */
public enum Categories implements NoGoAttribute {
    FRUEHSTUECK("Frühstück"),
    VORSPEISE("Vorspeise"),
    HAUPTSPEISE("Hauptspeise"),
    NACHSPEISE("Nachspeiße"),
    SNAKS("Snacks");

    private final String category;

    private Categories(String categorie){
        this.category = categorie;
    }

    @Override
    public NoGoAttribute getNoGoAttribute() { return this; }

    @Override
    public String toString() { return category; }
}
