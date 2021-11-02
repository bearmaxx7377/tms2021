package com.home.model;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

// ВОЗДУШНЫЙ
@Getter
@SuperBuilder
public class Air extends Transport {

    private int wingspan;     // размах крыльев (м)
    private int minLength;    // минимальная длина полосы для взлета

    public Air(int wingspan, int minLength) {
        super(wingspan, minLength);
    }

    protected String checkAccess(boolean check) { // проверка присутствия
        String presence = check ? "Yes" : "No";
        return presence;
    }
}
