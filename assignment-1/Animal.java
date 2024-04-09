class Animal {
    void makeSound() {
    System.out.println("animal sound");
  }
}

class Dog extends Animal {
    void makeSound() {
    System.out.println("Woof!");
  }
}

class Cat extends Animal {
    void makeSound() {
    System.out.println("Meow!");
  }
}

public class Main {
  public static void main(String[] args) {
    Animal animal1 = new Dog();
    Animal animal2 = new Cat();
    animal1.makeSound();  
    animal2.makeSound();
  }
}