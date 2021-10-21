package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Address {
    private String sity;
//    private String country;

    public Address(String sity) {
        this.sity = sity;
    }
}
