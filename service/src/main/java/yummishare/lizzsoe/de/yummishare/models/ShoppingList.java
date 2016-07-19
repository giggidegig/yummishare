package yummishare.lizzsoe.de.yummishare.models;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;

/**
 * Moddeliert eine Einkaufsliste
 */
public class ShoppingList {

    private final User user;
    private HashMap<Ingredient, Amount> ingredientList = new HashMap<>();
    private Calendar timeStamp = new GregorianCalendar();

    public ShoppingList(final User user){
        this.user = user;
    }

    public User getUser() { return user; }
    public HashMap<Ingredient, Amount> getIngredientList() { return ingredientList; }
    public Calendar getTimeStamp() { return timeStamp; }

    public void addIngedient(Ingredient ingredient, Amount amount){
        this.ingredientList.put(ingredient, amount);
    }

    public void setTimeStamp(Calendar timeStamp){
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("**********ShoppingList**********\n");
        builder.append("Benutzer: " + user.getName() + "\n\n");
        return super.toString();
    }
}