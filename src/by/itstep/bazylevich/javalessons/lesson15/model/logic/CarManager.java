package by.itstep.bazylevich.javalessons.lesson15.model.logic;

import by.itstep.bazylevich.javalessons.lesson15.model.data.Car;

public class CarManager {
    public static int findExpensiveCar(Car car1, Car car2, Car car3, Car car4) {
        int maxPrice = car1.price;

        if(car2.price > car1.price
             && car2.price > car3.price
             && car2.price > car4.price){
            maxPrice = car2.price;
        } else if (car3.price > car1.price
                 && car3.price > car4.price){
            maxPrice = car3.price;
        }else if (car4.price > car1.price){
            maxPrice = car4.price;
        }
        return maxPrice;
    }

    public static int calcTotalPrice(Car car1, Car car2, Car car3, Car car4) {
        return car1.price + car2.price + car3.price + car4.price;
    }
}
