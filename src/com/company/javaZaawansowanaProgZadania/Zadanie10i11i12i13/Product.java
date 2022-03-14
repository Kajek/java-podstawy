package com.company.javaZaawansowanaProgZadania.Zadanie10i11i12i13;

import java.time.LocalDate;

public interface Product {

    Double getPrice();
    Boolean checkIfAvailableByDate(LocalDate localDate);
}
