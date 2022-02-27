package com.company.practice.WorceProjektowePractice.Decorator.PizzaExample;

public class PizzaMain {

    public static void main(String[] args) {

        IPizza pizza = new Pizza(20);
        System.out.println("cena podstawowej pizzy: " + pizza.getPrice());

        pizza = new HamDecorator(new CheeseDecorator(new CheeseDecorator(pizza)));
        System.out.println("cena pizzy + 2x ser i szynka: " + pizza.getPrice());

        pizza = new CheeseDecorator(new CheeseDecorator(new MozzarellaDecorator(new MozzarellaDecorator(pizza))));
        System.out.println("cena pizzy 4 sery: " + pizza.getPrice());
    }
}
