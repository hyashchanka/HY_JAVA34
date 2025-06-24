package org.tms.printname;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Murka");

        Dog dog = new Dog();
        dog.setName("Tuzik");

        Print print = new Print();
        String CatsName =  print.printName(cat);
        String DogsName =  print.printName(dog);
        System.out.println(CatsName);
        System.out.println(DogsName);




    }
}
