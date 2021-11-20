package io.zipcoder.interfaces;


//the interface is the tables of contents
//you go into the specific "classes" to read the contents
public interface Teacher {

    void teach(Learner learner, double numberOfHours);

    void lecture(Learner[] learners, double numberOfHours);


}
