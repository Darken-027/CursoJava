package org.example.areglos;

public class Ingredients {
    private String name;
    private String amount;
    private UnitMeasurement nitMeasurement;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UnitMeasurement getNitMeasurement() {
        return nitMeasurement;
    }

    public void setNitMeasurement(UnitMeasurement nitMeasurement) {
        this.nitMeasurement = nitMeasurement;
    }
}
