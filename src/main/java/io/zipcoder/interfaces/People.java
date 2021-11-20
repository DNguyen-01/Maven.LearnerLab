package io.zipcoder.interfaces;

import java.util.List;

public class People {

    private List<Person> personList;

    public void add(Person person) {
        personList.add(person);

    }

    public Person findByID(Long id) {

        for (Person person : personList) {
            if (person.getId().equals(id)) {
                return person;
            }

        }
        return null;
    }

    public Boolean contains(Person person){

        return personList.contains(person);
    }

    public void remove(Person person){

        personList.remove(person);

    }

    public void remove(Long id){

        personList.removeIf(person -> person.getId().equals(id));
    }


}

