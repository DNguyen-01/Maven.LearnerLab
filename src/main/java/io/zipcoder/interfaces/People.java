package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {

    private final List<Person> personList;

    public People(){

        this.personList = new ArrayList<>();

    }

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

    public void remove(Long id) {

        personList.removeIf(person -> person.getId().equals(id));
        //originally a for(loop)
//        for (Person person : personList){
//            if(person.getId().equals(id))
//                remove(id);}
    }

    public void removeAll(){

        personList.clear();
    }

    public int count(){

        return personList.size();
    }

    public Object[] toArray(){
        //return an array of personList because personList is an Arraylist
        return personList.toArray();
    }

    public Iterator<Person> iterator(){

        return personList.iterator();

    }



}

