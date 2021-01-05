package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
            animals.add(new Dog("Buksi", true));
            animals.add(new Cat ("Cirmi", false));
        Owner ownerOne = new Owner(animals);
	        //Dog dog1 = new Dog("Buksi", true);
	        //Cat cat1 = new Cat ("Cirmi", false);
            //System.out.println(dog1.isMale());
        ownerOne.feed();
    }
}

//Create abstract Animal class
//Add name and isMale fields
//Create constructor
//Create getters and setters

//lista feltoltese egyszerre tobb elemmel: List<Animal> animals = new ArrayList<(Arrays.asList(new Cat("Cirmi", false), new Dog("Morzsa", true)));
//List<Animal> animals = new ArrayList<>(Arrays.asList(new Cat("Cirmi", false), new Dog("Morzsa", true)));