package com.company.practice.worceProjektowePractice.Decorator.PizzaExample;

public class CheeseDecorator extends BasicPizzaDecorator{
    public CheeseDecorator(IPizza pizza) {
        super(pizza);
    }
    @Override
    public int getPrice() {
        return super.getPrice() + 4;
    }
}
