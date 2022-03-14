package com.company.practice.worceProjektowePractice.Decorator.PizzaExample;

public class MozzarellaDecorator extends BasicPizzaDecorator{

    public MozzarellaDecorator(IPizza pizza) {
        super(pizza);
    }

    @Override
    public int getPrice(){
        return super.getPrice() +5;
    }
}
