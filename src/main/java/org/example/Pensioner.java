package org.example;

public class Pensioner extends Person{
    private double pension;

    public Pensioner(String name, int age, double high, int weight, int money, double pension) {
        super(name, age, high, weight, money);
        this.pension = pension;
    }

    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }
    @Override
    public void die () {
        System.out.println("Этот пенсионер умер, он заработал: " + (getAge() - 50) * pension);
    }

}
