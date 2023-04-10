package Exemplo1;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Animal originalDog = new Dog("Fido", 3);
        Animal clonedDog = originalDog.clone();
        
        Animal originalCat = new Cat("Whiskers", 5);
        Animal clonedCat = originalCat.clone();
        
        System.out.println(originalDog.getName() + " cachorro original"); // Output: Fido
        System.out.println(clonedDog.getName() + " cachorro clonado"); // Output: Fido

        System.out.println(originalCat.getName() + " gato original"); // Output: Fido
        System.out.println(clonedCat.getName() + " gato clonado"); // Output: Rufus

        
        originalDog.makeSound(); // Output: Woof!
        clonedDog.makeSound(); // Output: Woof!
        
        originalCat.makeSound(); // Output: Meow!
        clonedCat.makeSound(); // Output: Meow!
    }
}