package io.zipcoder.interfaces;


import java.util.Arrays;

public class Instructor extends Person implements Teacher{

    private Double numberOfHoursPerLearner;


    public Instructor(String name, Long id) {
        super(name, id);

        numberOfHoursPerLearner = 0.0;

    }

    public Double getNumberOfHoursPerLearner() {
        return numberOfHoursPerLearner;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {

        numberOfHoursPerLearner = numberOfHours + numberOfHoursPerLearner;

        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
            //we will try to teach all the learners in the array
            //must make sure that all the learners are being taught
        for(Learner learner : learners){
            learner.learn(numberOfHours/learners.length);
        }
        numberOfHoursPerLearner = numberOfHours/learners.length;
    }

}
