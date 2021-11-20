package io.zipcoder.interfaces;


public class Person {

    private String name;
    private final Long id;


    public Person(String name, Long id){ //constructor is a way to initialize the object

        this.name = name; //instance variables that are being initialized
        this.id = id;

    }


    public String getName() {
        return name;
    }


    public Long getId() {

        return id;
    }


    public void setName(String name) {
        this.name = name;
    }


}
