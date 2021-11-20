package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class PeopleTest {

    private People people  ;
    private Person person1;
    private Person person2;


    @Before
    public void setUp(){

        people = new People();
        person1 = new Person("dave", 111L);
        person2 = new Person("anna", 112L);

    }


    @Test
    public void testAdd(){
        //given
        //when
        people.add(person1);
        //then
        Assert.assertTrue(people.contains(person1));
    }

    @Test
    public void testRemove(){
        //given
        //when
        people.add(person2); //add the person to the array
        people.remove(person2); //remove the person
        //then
        Assert.assertFalse(people.contains(person2)); //check if the person is still there
    }


    @Test
    public void testFindByID(){
        //given
        //when
        Person actual = people.findByID(person1.getId());
        //then
        Assert.assertEquals(person1,actual);
        Assert.assertNull(people.findByID(29L));

    }


}
