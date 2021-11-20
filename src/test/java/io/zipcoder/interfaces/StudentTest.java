package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class StudentTest extends TestCase {

    private Student exampleStudent;
    private String expectedName = "davey";
    private final Long expectedId = 309L;

    @Before
    public void setUp(){
        exampleStudent = new Student("davey", 309L);
    }


    @Test
    public void testStudentInstanceOf(){
        //we are testing that the student is an -instanceof- a learner
        //when
        //then
        Assert.assertTrue(exampleStudent instanceof Learner);
        Assert.assertTrue(exampleStudent instanceof Person);

    }

    @Test
    public void testLearningHours(){
        //given
        //when
        Double expected = 5.0;
        exampleStudent.learn(expected);
        Double actual = exampleStudent.getTotalStudyTime();
        //then
        Assert.assertEquals(expected, actual);
    }
}