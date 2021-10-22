package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Person {
    public static final String MALE = "male";
    public static final String FEMALE = "female";

    private String name;
    private int age;
    private String sex = FEMALE;
    private Address address;

    public Person(String name, int i, String male, Address krichev) {

    }
}
