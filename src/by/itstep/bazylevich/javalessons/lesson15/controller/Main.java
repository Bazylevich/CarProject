package by.itstep.bazylevich.javalessons.lesson15.controller;

import by.itstep.bazylevich.javalessons.lesson15.model.data.Car;
import by.itstep.bazylevich.javalessons.lesson15.model.logic.CarManager;
import by.itstep.bazylevich.javalessons.lesson15.view.ConsolePrinter;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.name = "Ford";
        car1.price = 3000;

        Car car2 = new Car();
        car2.name = "Opel";
        car2.price = 4500;

        Car car3 = new Car();
        car3.name = "BMW";
        car3.price = 7000;

        Car car4 = new Car();
        car4.name = "Fiat";
        car4.price = 5450;

        int maxPrice = CarManager.findExpensiveCar(car1, car2, car3, car4);
        int total = CarManager.calcTotalPrice(car1, car2, car3, car4);

        String msg = String.format("Max car price = $%d", maxPrice);
        msg += String.format("\nTotal = $%d", total);

        ConsolePrinter printer = new ConsolePrinter();
        printer.print(msg);
        
    }
}
