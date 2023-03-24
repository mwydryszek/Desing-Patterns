package com.example.wzorce.prototype;

public class PersonV2 implements Prototype{

    private final String firstName;
    private final String lastName;
    private int age;

    public PersonV2(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public PersonV2(PersonV2 personV2) {
        this.firstName = personV2.firstName;
        this.lastName = personV2.lastName;
        this.age = personV2.age;
    }



    @Override
    public Prototype clone() {
        return new PersonV2(this);
        //return new PersonV2(this.firstName, this.lastName, this.age);
    }

    @Override
    public String toString() {
        return "PersonV2{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
