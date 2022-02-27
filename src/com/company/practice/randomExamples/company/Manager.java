package com.company.practice.randomExamples.company;

public class Manager extends Employee{

    private int bonus;

    public Manager(String name, int salary){
        super(name,salary);
    }
    public Manager(String name, int salary, int bonus){
        super(name, salary);
        this.bonus = bonus;
    }
    public void makeSpeech(){
        System.out.println("Enter motivational speech here");
    }

    @Override
    public int getSalary(){
        return super.getSalary() + getBonus();
    }
    public void makeSpeech(String additionalMessage){
        makeSpeech();
        System.out.println(additionalMessage);
    }

    public int getBonus() {
        return bonus;
    }
}
