package io.zipcoder.pets;

public class Cat extends Pets implements Comparable<Pets>{

    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "meow meow!";
    }

}
