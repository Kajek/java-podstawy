package com.company.practice.WorceProjektowePractice.Decorator.PizzaExample;

public class BasicPizzaDecorator implements IPizza{

    private IPizza pizza;

    public BasicPizzaDecorator(IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getPrice() {
        return this.pizza.getPrice();
    }
}
