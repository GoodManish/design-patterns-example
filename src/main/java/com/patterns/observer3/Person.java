package com.patterns.observer3;

 //Concrete Observer(Person) implementations.
public class Person implements Observer {
    private String personName;

    public Person(String personName, Subject subject) {
        this.personName = personName;
        subject.register(this);
    }

    public String getPersonName() {
        return personName;
    }

    @Override
    public void update(String availablity) {
        System.out.println("Hey "+this.personName+", product is "+availablity+" now.");
    }

    @Override
    public String toString() {
        return personName ;
    }
}
