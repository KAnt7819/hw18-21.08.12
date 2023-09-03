package org.example;

public class Worker extends Person implements AbleToCalculatePension {

    private int minSalary;
    private int maxSalary;

    public Worker(String name, int age, double high, int weight, int money, int minSalary, int maxSalary) {
        super(name, age, high, weight, money);
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    public Worker(String name, int age, double high, int weight, int money) {
        super(name, age, high, weight, money);

    }

    public Worker(String name, int age, double high, int weight, int money, int minSalary) {
        super(name, age, high, weight, money);
        this.minSalary = minSalary;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }
    @Override
    public void die () {

        System.out.println("Этот человек не дожил до пенсии.");
    }
    @Override
    public void die (int years) {
        System.out.println("Этот человек не доживет до пенсии и умрет через " + years + "лет");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Worker worker = (Worker) o;

        if (minSalary != worker.minSalary) return false;
        return maxSalary == worker.maxSalary;
    }

    @Override
    public int hashCode() {
        int result = minSalary;
        result = 31 * result + maxSalary;
        return result;
    }

    @Override
    public double calculatePension() {
        return CalculatorUtils.calculateAverage((int) minSalary,(int) maxSalary) * 0.25;

//        double averageSalary = CalculatorUtils.calculateAverage(maxSalary, minSalary);
//        double pension = 0.25 * averageSalary;
//        return pension;
    }
}
