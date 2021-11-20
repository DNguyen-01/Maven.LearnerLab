package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InstructorTest extends TestCase {

    private Instructor testInstructor;
    private String name;
    private Double id;
    private Learner testStudent, testStudent2;


    @Before
    public void setUp(){

        testInstructor = new Instructor("davey", 309L);
        testStudent = new Student("mikey",101L);
        testStudent2 = new Student("simba", 111L);

    }

    @Test
    public void instanceOf(){
        //given
        //when
        //then
        Assert.assertTrue(testInstructor instanceof Teacher);
        Assert.assertTrue(testInstructor instanceof Person);
    }

    @Test
    public void testTotalStudyTime(){
        //we're expecting the total study time to increase when the instructor teaches the student
        Double expected = 0.0;
        testInstructor.teach(testStudent, expected);
        Assert.assertEquals(expected,testInstructor.getNumberOfHoursPerLearner());
    }

    @Test
    public void testLecture(){
        Double expected = 0.0;
        Learner[] learners = new Learner[]{testStudent,testStudent2};
        testInstructor.lecture(learners,expected);
        for(Learner learner : learners){
            //for each student in the group
            Assert.assertEquals(learner.getTotalStudyTime(), expected);
            //assert that the students are all getting their total study time
        }
    }


}