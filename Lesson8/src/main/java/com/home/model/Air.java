package com.home.model;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

// ВОЗДУШНЫЙ
@Getter
@SuperBuilder
public class Air extends Transport {

    private int wingspan;     // размах крыльев (м)
    private int minLength;    // минимальная длина полосы для взлета

    protected String checkAccess(boolean check) { // проверка присутствия
        String presence = !check ? "No" : "Yes";
        return presence;
    }
}
