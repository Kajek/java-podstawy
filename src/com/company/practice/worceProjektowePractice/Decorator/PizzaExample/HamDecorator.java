package com.company.practice.worceProjektowePractice.Decorator.PizzaExample;

public class HamDecorator extends BasicPizzaDecorator{

    public HamDecorator(IPizza pizza) {
        super(pizza);
    }
    @Override
    public int getPrice() {
        return super.getPrice() +3;
    }
}
