package web.model;

public class Car {
    public String model;
    private String color;
    private String Number;

    public Car() {

    }

    public Car(String model, String color, String Number) {
        this.model = model;
        this.color = color;
        this.Number = Number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }
}