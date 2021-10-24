package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Address {
    private String city;
    private String country;

    public Address(String city) {
        this.city = city;
        this.country = country;
    }
}
