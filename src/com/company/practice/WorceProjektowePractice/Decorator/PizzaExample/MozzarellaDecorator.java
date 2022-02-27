package com.company.practice.WorceProjektowePractice.Decorator.PizzaExample;

public class MozzarellaDecorator extends BasicPizzaDecorator{

    public MozzarellaDecorator(IPizza pizza) {
        super(pizza);
    }

    @Override
    public int getPrice(){
        return super.getPrice() +5;
    }
}
