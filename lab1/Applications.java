// Class Mother
class Mother {
    int x = 10; // Member variable
   
    // Method to show a message
    void show() {
        System.out.println("Hello World from Mother class.");
    }
}

// Class Child that extends Mother and overrides the show() method
class Child extends Mother {
    // Overriding the show() method
    @Override
    void show() {
        System.out.println("Hello JUET from Child class.");
    }
}

// Class Application to test the overriding
public class Applications {
    public static void main(String[] args) {
        // Creating an object of Mother
        Mother m = new Mother();
        m.show(); // Calls the show() method of Mother class

        // Creating an object of Child
        Child ch = new Child();
        ch.show(); // Calls the overridden show() method of Child class

        // Demonstrating polymorphism
        Mother polymorphicReference = new Child();
        polymorphicReference.show(); // Calls the overridden show() method in Child
    }
}
