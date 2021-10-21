package model;

import static model.PersonUtills.createPersons;

public class Main {
    public static void main(String[] args) {
        Person[] persons = createPersons();
        PersonRegistry personRegistry = new PersonRegistry(persons);
        MilitaryOffice militaryOffice = new MilitaryOffice(personRegistry);
    }
}