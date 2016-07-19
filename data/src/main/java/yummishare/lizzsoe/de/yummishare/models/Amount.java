package yummishare.lizzsoe.de.yummishare.models;

import org.apache.commons.lang3.builder.EqualsBuilder;

/**
 * Created by Giggi on 18.07.2016.
 */
public class Amount {

    private float amount = 0;
    private Unit unit = Unit.GRAMM;

    public Amount(float amount, Unit unit) {
        this.amount = amount;
        this.unit = unit;
    }

    public float getAmount(){
        return this.amount;
    }

    public void addAmount(float amount){
        this.amount += amount;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(obj == null || !(obj instanceof Amount)) return false;

        Amount other = (Amount) obj;

        EqualsBuilder builder = new EqualsBuilder();
        builder.append(amount, other.amount);
        builder.append(unit.toString(), other.unit.toString());

        return builder.build();
    }

    @Override
    public String toString() {
        return amount + " " + unit;
    }
}
