package service;

import com.github.javafaker.Faker;
import model.Person;

import java.util.ArrayList;
import java.util.List;

public class PeopleService {
    public  List<Person> generateExampleData(){
        java.util.List<Person> peoples = new ArrayList();
        Faker faker = new Faker();
        for(int i=0; i< 100; i++){

            Person p = Person.builder()
                    .age(faker.number().numberBetween(20,65))
                    .name(faker.name().firstName())
                    .surname(faker.name().lastName())
                    .sex(faker.demographic().sex())
                    .build();

            peoples.add(p);
        }
        return peoples;
    }
}
