package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class StudentsTest extends TestCase {

    @Test
    public void testInstanceOf(){
        //given
        //when
        Students expected = Students.getINSTANCE();
        //then
        Assert.assertNotNull(expected.findByID(10L));

    }

}