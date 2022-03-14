package com.company.practice.zaawansownaProgPractice.zadanie20;

public abstract class D3Shape extends Shape implements Fillable{

    private double stateOfWater;
    abstract double  calculateVolume();

    @Override
    public void fill(double amountOfWater) {
        double volume = calculateVolume();
        if(stateOfWater + amountOfWater > volume){
            System.out.println("Za dużo wody");
            stateOfWater = volume;
        }else if(stateOfWater + amountOfWater < volume){
            stateOfWater += amountOfWater;
            System.out.println("Za mało wody, pozostło: " + (volume - stateOfWater) + "miejsca" );
        }else{
            stateOfWater = volume;
            System.out.println("Pełna bryła");
        }
    }
}
