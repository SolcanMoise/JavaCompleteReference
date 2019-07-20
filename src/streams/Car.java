package streams;

import java.util.Objects;

public class Car {

    private String makes;
    private String model;
    private String color;
    private String transmission;
    private int horsePower;
    private int price;

    Car setMakes(String makes) {
        this.makes = makes;
        return this;
    }

    Car setModel(String model) {
        this.model = model;
        return this;
    }

    Car setColor(String color) {
        this.color = color;
        return this;
    }

    Car setTransmission(String transmission) {
        this.transmission = transmission;
        return this;
    }

    public Car setHorsePower(int horsePower) {
        this.horsePower = horsePower;
        return this;
    }

    public Car setPrice(int price) {
        this.price = price;
        return this;
    }

    public String getMakes() {
        return makes;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getTransmission() {
        return transmission;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return horsePower == car.horsePower &&
                price == car.price &&
                makes.equals(car.makes) &&
                model.equals(car.model) &&
                color.equals(car.color) &&
                transmission.equals(car.transmission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(makes, model, color, transmission, horsePower, price);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("makes='").append(makes).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", transmission='").append(transmission).append('\'');
        sb.append(", horsePower=").append(horsePower);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
