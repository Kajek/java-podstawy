package com.company.javaZaawansowanaProgZadania.Zadanie10i11i12i13;

import java.time.LocalDate;
import java.util.function.Function;
import java.util.function.Supplier;

public class GenericProduct implements Product{

    private final Supplier<Double> priceSupplier;
    private final Function<LocalDate, Boolean> availibilityFunction;

    public GenericProduct(Supplier<Double> priceSupplier, Function<LocalDate, Boolean> availibilityFunction) {
        this.priceSupplier = priceSupplier;
        this.availibilityFunction = availibilityFunction;
    }

    @Override
    public Double getPrice() {
        return priceSupplier.get();
    }

    @Override
    public Boolean checkIfAvailableByDate(LocalDate localDate) {
        return availibilityFunction.apply(localDate);
    }

}
