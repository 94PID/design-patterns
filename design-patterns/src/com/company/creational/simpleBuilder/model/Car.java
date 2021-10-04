package com.company.creational.simpleBuilder.model;

public class Car {

    String make;
    String model;
    int horsepower;
    String color;

    public Car(String make, String model, int horsepower, String color) {
        this.make = make;
        this.model = model;
        this.horsepower = horsepower;
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", horsepower=" + horsepower +
                ", color='" + color + '\'' +
                '}';
    }

    public static class Builder {

        String make;
        String model;
        int horsepower;
        String color;


        public String getMake() {
            return this.make;
        }

        public Builder setMake(String make) {
            this.make = make;
            return this;
        }

        public String getModel() {
            return model;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public int getHorsepower() {
            return horsepower;
        }

        public Builder setHorsepower(int horsepower) {
            this.horsepower = horsepower;
            return this;
        }

        public String getColor() {
            return color;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(make, model, horsepower, color);
        }
    }

}
