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
    @Override
    public void die (int years) {
        System.out.println("Этот пенсионер умрет через" + years + "лет");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pensioner pensioner = (Pensioner) o;

        return Double.compare(pensioner.pension, pension) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(pension);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Pensioner{" +
                "pension=" + pension +
                '}';
    }
}
