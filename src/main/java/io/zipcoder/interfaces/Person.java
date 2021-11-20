package io.zipcoder.interfaces;


public class Person {

    private String name;
    private final Long id;



    public Person(String name, Long id){

        this.name = name;
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
