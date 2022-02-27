package com.company.practice.zaawansowanaPratcice;

import javax.management.RuntimeErrorException;

public class BasketFullExeption extends Exception {

    public BasketFullExeption(String message) {
        super(message);
    }
}
