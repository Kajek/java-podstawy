package com.company.javaZaawansowanaProgZadania.Zadanie10i11i12i13;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class OrderService {


    public Double getTotalCost(Basket basket){

        return basket.getProductList().entrySet().stream()
                .map(p -> p.getKey().getPrice() * p.getValue().doubleValue())
                .reduce(0.0,Double::sum);


    }
}
