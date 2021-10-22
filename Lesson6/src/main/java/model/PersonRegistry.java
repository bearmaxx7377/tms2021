package model;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class PersonRegistry {
    private Person[] persons;

    public PersonRegistry(Person[] persons) {
    }
}
