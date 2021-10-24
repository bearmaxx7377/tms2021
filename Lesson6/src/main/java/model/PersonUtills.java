package model;

import lombok.AllArgsConstructor;

import static model.Person.MALE;

@AllArgsConstructor
public class PersonUtills {
    public static Person[] createPersons() {
        Person[] people = new Person[5];
        {
            Person person = new Person("Андрей", 24, MALE, new Address("krichev"), "Pushkinskaya");
            people[0] = person;
        }
        {
            Person person = new Person("Игорь", 20, MALE, new Address("minsk"), "Velikaya");
            people[1] = person;
        }
        {
            Person person = new Person("Максим", 28, MALE, new Address("orsha"), "Leninskaya");
            people[2] = person;
        }
        {
            Person person = new Person("Александр", 23, MALE, new Address("grodno"), "Dekabristov");
            people[3] = person;
        }
        {
            Person person = new Person("Владимир", 19, MALE, new Address("vitebsk"), "Gogolya");
            people[4] = person;
        }
        return people;
    }
}
