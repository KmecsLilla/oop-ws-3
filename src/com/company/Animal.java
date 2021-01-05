package com.company;

public abstract class Animal {

    private String name;
    private boolean isMale;

    public Animal(String name, boolean isMale) {
        this.name = name;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public void feed() {
        System.out.println("niam niam");
        speak();
    }

    protected abstract void speak();
}

//Add feed() method which prints (niam niam) and after calls speek()

//Create Cat and Dog class which implements Animal and its speek() method by printing “Wuff” and “Meow

//Create Owner class
//Add a field named animals with type: List<Animal>
