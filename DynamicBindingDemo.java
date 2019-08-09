package OOPS;

 class Animal {
    Animal(){
        System.out.println("Animal class");
    }
    public void speak(){
        System.out.println("Animal Vpoice");
    }
}

class Dog extends Animal{
    Dog(){
        System.out.println("Dog class");
    }
    public void speak(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    Cat(){
        System.out.println("Cat class");
    }
    public void speak(){
        System.out.println("Cat meows");
    }
}

class Elephant extends Animal{
    Elephant(){
        System.out.println("Elephant class");
    }
    public void speak(){
        System.out.println("Elephant trumphets");
    }
}

public class DynamicBindingDemo{
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.speak();;
        Dog dog=new Dog();
        dog.speak();
    }
}
