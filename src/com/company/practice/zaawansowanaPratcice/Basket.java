package com.company.practice.zaawansowanaPratcice;

public class Basket {

    private int counter = 0;


    public void addToBasket() throws BasketFullExeption{
        if(counter > 10){
            throw new BasketFullExeption("Basket is full");
        }
        counter +=1;
    }
    public void removeFromBasket() throws BasketEmptyExeption{
        if (counter == 0){
            throw new BasketEmptyExeption("Basket is empty");
        }
        counter -= 1;
    }
}
