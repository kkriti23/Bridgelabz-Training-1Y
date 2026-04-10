package OOPS;

import java.util.Objects;

public class Animal {
    private int age;
    private String colour;

    public Animal(){

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(colour, animal.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, colour);
    }
}
