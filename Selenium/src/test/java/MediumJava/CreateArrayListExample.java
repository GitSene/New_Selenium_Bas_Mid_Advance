package MediumJava;

import java.util.ArrayList;

public class CreateArrayListExample {

    public static void main(String[] args) {
    	
        // Creating an ArrayList of String
        ArrayList<String> animals = new ArrayList<String>();

        // Adding new elements to the ArrayList
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Wolf");

        System.out.println(animals);

        // Adding an element at a particular index in an ArrayList
        animals.add(4, "Elephant");
        System.out.println(animals);

    }
}