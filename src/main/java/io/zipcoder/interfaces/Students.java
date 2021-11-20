package io.zipcoder.interfaces;

public final class Students extends People {

    private static Students INSTANCE = null;


    private Students(){
        INSTANCE = new Students();
        INSTANCE.add(new Person("john", 10L));
        INSTANCE.add(new Person("Cay", 20L));
        INSTANCE.add(new Person("Carnell", 30L));
        INSTANCE.add(new Person("JR", 40L));
        INSTANCE.add(new Person("Paul", 50L));
        INSTANCE.add(new Person("Amanda", 60L));
        INSTANCE.add(new Person("Jacob", 70L));
        INSTANCE.add(new Person("Keerthana", 80L));
        INSTANCE.add(new Person("Tra", 90L));

    }

    public static Students getINSTANCE() {

        if (INSTANCE == null) {

            INSTANCE = new Students();

        }
        return INSTANCE;
    }



}
