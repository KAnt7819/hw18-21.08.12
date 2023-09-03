package org.example;

public abstract class Person {

    private String name;
    private int age;
    private double high;
    private int weight;
    private int money;

    //private int age, weight, money;

    public Person(String name, int age, double high, int weight, int money) {
        this.name = name;
        this.age = age;
        this.high = high;
        this.weight = weight;
        this.money = money;

    }

    public void printInfo() {
        System.out.println("Имя :" + name);
        System.out.println("Возраст :" + age);
        System.out.println("Рост :" + high);
        System.out.println("Вес :" + weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void goToWork() {
        if (age < 18 || age >= 70) {
            System.out.println("Гоняю балду или сижу с газеткой у камина");
        } else System.out.println("Вынужден пахать аки бобик на бляго Дойчеланд");
    }

    public void die() {
        System.out.println("Человек погиб");
    }

    public abstract void die(int years);
}

