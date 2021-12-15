package com.company;

public class Main {

    public static void main(String[] args) {
        Shepherd shepherd = new Shepherd("Reks",10,3.9,"Average");
                Dog dog = new Dog("Maks",3,2.5);
                Bulldog bulldog = new Bulldog("Robert",5,4.2,"English Bulldog");
                System.out.println(dog);
                dog.Gav();
                System.out.println(bulldog);
                bulldog.Gav();
                System.out.println(shepherd);
                shepherd.Gav();
    }
}
