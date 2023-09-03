package org.example;

import java.util.Date;

public class Main {


    public static void main(String[] args) {

//        Person person = new Person("Ant", 45, 171.5,78, 150);
//        Person person1 = new Person("Den", 75, 171.5,66, 200);
//        Person person2 = new Person("Max", 35, 171.5,120, 350);

        Pensioner pensioner = new Pensioner("Ant", 45, 171.5, 78, 150, 300);
        Pensioner pensioner1 = new Pensioner("Den", 75, 171.5, 66, 200, 250);

        Worker worker = new Worker("Max", 35, 171.5, 120, 350, 50, 450);
        Worker worker1 = new Worker("Wasja", 35,171.5, 80,700);
        Worker worker2 = new Worker("Fedja", 66,200.5, 120,600,350);
        PensionniFond pensionniFond = new PensionniFond("Госстрах", true, new Date(01 - 01 - 1999), 750456);

        worker.die();
        pensioner1.die();
        pensioner1.die(15);
        worker.die(37);
        //person.goToWork();
        worker.printInfo();
        pensionniFond.info();

    }

}