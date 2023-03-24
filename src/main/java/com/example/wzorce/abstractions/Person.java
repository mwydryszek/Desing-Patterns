package com.example.wzorce.abstractions;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private Integer height;

//    private Person(PersonBuilder builder){
//        this.firstName = builder.firstName;
//        this.lastName = builder.lastName;
//        this.age = builder.age;
//        this.height = builder.height;
//    }

    private Person(String firstName, String lastName, int age, Integer height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
    }

    public static PersonBuilder builder(){
        return new PersonBuilder();
    }

    public static class PersonBuilder{

        private String firstName;
        private String lastName;
        private int age;
        private Integer height;

        public PersonBuilder firstName(String firstName)
        {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder lastName(String lastName)
        {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder age(int age)
        {
            this.age = age;
            return this;
        }

        public PersonBuilder height(Integer height)
        {
            this.height = height;
            return this;
        }

        public Person build(){
            return new Person(this.firstName, this.lastName, this.age, this.height);
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
