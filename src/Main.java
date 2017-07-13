import Subclass.Cat;
import Subclass.Dog;
import Subclass.Number;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Katty", 1);
        Dog dog = new Dog( "Lulu", 2 );
        Number number = new Number( 3 );

        System.out.println( "Any class can implement ToNumber interface!!!" );
        System.out.println( "Cat's number: " + cat.getNumber() );
        System.out.println( "Dog's number: " + dog.getNumber() );
        System.out.println( "Number's number: " + number.getNumber() );

        System.out.println("Cat and dog are animal, so they inherit name, age and print method "
                + "from Animal, however, they must be give the \nimplementation of method "
                + "print to can be instantiated");
        cat.print();
        dog.print();
    }
}
