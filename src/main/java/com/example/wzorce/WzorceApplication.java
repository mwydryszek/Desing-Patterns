package com.example.wzorce;

import com.example.wzorce.abstractions.Person;
import com.example.wzorce.prototype.PersonV2;
import com.example.wzorce.singleton.Repository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WzorceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WzorceApplication.class, args);

        Repository.getInstance().print();

        Person person = Person.builder()
                .firstName("Mateusz")
                .lastName("Wydryszek")
                        .build();

        System.out.println(person);

        PersonV2 personV2 = new PersonV2("Mateusz", "Wydryszek", 22);

        PersonV2 otherPerson = (PersonV2) personV2.clone();

        System.out.println("Person " + personV2);
        System.out.println("Clone person " + otherPerson);

        System.out.println(personV2 == otherPerson);


    }

}
