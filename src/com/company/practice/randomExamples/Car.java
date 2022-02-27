package com.company.practice.randomExamples;

public enum Car {

    FERRARI(500000, 550, false, 250 ),
    PORSCHE(750000, 430,true, 240),
    BMW (140000, 130, false, 180),
    OPEL(15000,110, false, 150),
    FIAT( 70000, 150, true, 160),
    TOYOTA( 250000, 230, true, 200);

    private int price;
    private int power;
    private boolean isBrandNew;
    private int maxSpeed;

    Car(int price, int power, boolean isBrandNew, int maxSpeed) {
        this.price = price;
        this.power = power;
        this.isBrandNew = isBrandNew;
        this.maxSpeed = maxSpeed;
    }

    public boolean isPremium(){
        return (price > 100000 && isBrandNew);
//        return price.compareTo() ewentualnie ale na bigdeciamlach musa byc ceny wtedy
    }
    public  boolean isRegular(){
        return !isPremium();
    }
    public boolean isFasterThan(Car car){
        return maxSpeed > car.getMaxSpeed();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPower() {
        return power;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isBrandNew() {
        return isBrandNew;
    }

    public void setBrandNew(boolean brandNew) {
        isBrandNew = brandNew;
    }
}
