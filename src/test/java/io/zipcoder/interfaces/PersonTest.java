package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest extends TestCase {

   private Person testPerson;
   private String expectedName = "Mikey";
   private final Long expectedId = 6969L;

    @Before
    public void setUp(){ //before each test, run this

        testPerson = new Person(expectedName, expectedId);

   }

   @Test
    public void testGetName() {
        //given
        //when
        String expectedName = "Mikey";
        String actualName = testPerson.getName();

        //then
        assertEquals(expectedName, actualName);

    }


    @Test
    public void testGetId() {
        //given

        //when
        Long actual = testPerson.getId();
        //then
        assertEquals(expectedId, actual);
    }


    @Test
    public void testSetName() {
        //given
        testPerson.setName("davey");
        //when
        String actual = testPerson.getName();
        //then
        assertEquals("davey", actual);
    }
}