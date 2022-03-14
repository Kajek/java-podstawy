package com.company.javaZaawansowanaProgZadania.Zadanie10i11i12i13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Basket {

    private final Map<Product, AtomicInteger> productList = new HashMap<>();

    public void addProduct(Product product, Integer quantity){
        if(productList.containsKey(product)){
            productList.get(product).getAndAdd(quantity);
        }else{
            productList.put(product, new AtomicInteger(quantity));
        }
    }
    public void removeProduct(Product product, Integer quantity){
        if(productList.containsKey(product) && productList.get(product).get() <= quantity){
            productList.remove(product);
        }else if(productList.containsKey(product)){
            productList.remove(product).getAndAdd(-quantity);
        }
    }

    public Map<Product, AtomicInteger> getProductList() {
        return new HashMap<>(productList);
    }
}




