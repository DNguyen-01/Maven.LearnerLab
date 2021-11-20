package io.zipcoder.interfaces;



public class Student extends Person implements Learner {

    private Double totalStudyTime;


    public Student(String name, Long id) {
        super(name, id);

        this.totalStudyTime = 0.0;

    }



    @Override
    public void learn(double numberOFHours) {

        totalStudyTime = numberOFHours + totalStudyTime;
    }

    @Override
    public Double getTotalStudyTime() {

        return totalStudyTime;
    }
}
