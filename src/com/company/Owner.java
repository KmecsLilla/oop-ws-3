package com.company;

import java.util.ArrayList;
import java.util.List;

public class Owner {

    List<Animal> animals = new ArrayList<>();

    public Owner(List<Animal> animals) {
        this.animals = animals;
    }

    public void feed() {
        for (Animal actualAnimal : animals) {
            actualAnimal.feed();
        }
    }
}


//Create the constructor(List<Animal> animals)
//Create a feed method which calls all the animal-s feed() method

//Hozzatok létre egy main classt, és abban egy main metódust.
//Példányosítsátok az Ownert, akinek legyen egy kutyája és egy macskája, majd hívjátok meg a feed metódust az owneren