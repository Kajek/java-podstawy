package com.company.practice.WorceProjektowePractice.Decorator.PizzaExample;

public class CheeseDecorator extends BasicPizzaDecorator{
    public CheeseDecorator(IPizza pizza) {
        super(pizza);
    }
    @Override
    public int getPrice() {
        return super.getPrice() + 4;
    }
}
