package com.company.objects;

class TriangleOne {
    private double height;
    private double base;
    private double bokA;
    private double bokB;

    public TriangleOne(double height, double base, double bokA, double bokB) {
        this.height = height;
        this.base = base;
        this.bokA = bokA;
        this.bokB = bokB;
    }

    public TriangleOne(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBokA() {
        return bokA;
    }

    public void setBokA(double bokA) {
        this.bokA = bokA;
    }

    public double getBokB() {
        return bokB;
    }

    public void setBokB(double bokB) {
        this.bokB = bokB;
    }

    public void calculateField(double base, double height){
        System.out.println(base * height / 2);
    }

    public void areSidesEqual(double base, double bokA, double bokB){
        if (bokA == bokB && bokA == base){
            System.out.println("trójkąt jest równoboczny");
        }else if(bokA == bokB){
            System.out.println("Trójkąt jest równoramienny");
        }else{
            System.out.println("Zwykły trójkąt, nic specjalnego");
        }
    }
}
