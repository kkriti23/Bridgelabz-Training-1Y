package OOPS;

public class Dog extends Animal{
    String breed;
    static void main() {

        Dog dog1 = new Dog();
        dog1.setAge(5);
        System.out.println(dog1.getAge());
        dog1.setColour("Black");
        System.out.println(dog1.getColour());
        dog1.breed="labrador";
        System.out.println(dog1.breed);

        Dog dog2 = new Dog();
        dog2.setAge(5);
        System.out.println(dog2.getAge());
        dog2.setColour("Black");
        System.out.println(dog2.getColour());
        dog2.breed="Pug";
        System.out.println(dog2.breed);

        //Animal dog3 =  new Animal(4,"Pug");

        System.out.println(dog1.getAge()==dog2.getAge());
        System.out.println(dog1.getColour().equals(dog2.getColour()));
    }
}
