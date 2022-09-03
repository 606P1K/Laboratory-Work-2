package com.my.MainCar;

import com.my.ClassOfCar.Car;

import java.util.Scanner;

/**
 * Клас для демонстрації функціональності класу Car.
 * <p>
 * Додатковий функціонал: читання даних з консолі,виведення на екран масиву автомобілів певної моделі,
 виведення на екран масиву автомобілів певної моделі та певного року випуску,
 виведення на екран масиву автомобілів певного року і з певною ціною
 (більшою від тої,що ви вкажете в аргументах методу)
 * </p>
 *
 * @author Volodymyr Stepaniuk
 */
public class MainCar {
    /**
     * Демонстрація методів.
     * @param args масив параметрів командного рядка
     */

    public static void main(String[] args) {
        var cars = setArray();
        displayModel(cars,"Tesla Model X");
        displayModelNYears(cars,"Dodge Charger",40);
        displayYearsAndPriceMore(cars,2017,10000);
    }

    /**
     * Метод для створення та заповнення масиву даними
     * @return масив об'єктів типу Car
     */
    public static Car[] setArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        var cars = new Car[scanner.nextInt()];
        for (int i = 0; i < cars.length; i++)
        {
            Car car = setCar(i);
            cars[i] = car;
            System.out.println(" ");
        }

        return cars;
    }

    /**
     * Метод для створення об'єкту типу Car та встановлення полів для цього об'єкту
     * @param id айді автомобіля
     * @return об'єкт типу Car
     */
    public static Car setCar(int id){
        Scanner scanner = new Scanner(System.in);

        Car car = new Car();

        car.setId(id);
        System.out.print("Enter the car model: ");
        car.setModel(scanner.nextLine());

        System.out.print("Enter the year of car assembly: ");
        car.setYearOfManufacture(scanner.nextInt());

        System.out.print("Enter the price of the car ($): ");
        car.setPrice(scanner.nextInt());

        car.setRegNumber();

        return car;
    }

    /**
     * Метод для виведення масиву об'єктів типу Car які підходять під умову:
     збіг моделі автомобіля
     * @param cars масив об'єктів типу Car
     * @param model модель шуканого автомобіля
     */
    public static void displayModel(Car[] cars,String model){
        System.out.println("Cars with the following parameters will be displayed:"+"\nModel: "+model+"\n");
        for (Car car : cars) {
            if (car.getModel().equals(model)) {
                System.out.print(car+"\n");
            }
        }
    }

    /**
     * Метод для виведення масиву об'єктів типу Car які підходять під умови:
     збіг моделі та часу експлуатації автомобіля
     * @param cars масив об'єктів типу Car
     * @param model модель шуканого автомобіля
     * @param yearsOfOperation рік експлуатації шуканого автомобіля
     */
    public static void displayModelNYears(Car[] cars,String model,int yearsOfOperation){
        System.out.println("\nCars with the following parameters will be displayed:");
        System.out.println("Model: "+model+"\nYears of Operation: "+yearsOfOperation+"\n");

        for (Car car : cars) {
            if (car.getModel().equals(model) && (2022 - car.getYearOfManufacture()) > yearsOfOperation) {
                System.out.print(car+"\n");
            }
        }
    }

    /**
     *  Метод для виведення масиву об'єктів типу Car які підходять під умови:
     збіг року випуску автомобіля та ціна більша ніж поле price
     * @param cars масив об'єктів типу Car
     * @param yearOfManufacture рік випуску шуканого автомобіля
     * @param price ціна шуканого автомобіля має бути більша ніж це поле
     */
    public static void displayYearsAndPriceMore(Car[] cars,int yearOfManufacture,int price){
        System.out.println("\nCars with the following parameters will be displayed:");
        System.out.println("Year of manufacture: "+yearOfManufacture+"\nThe price is higher than: "+price+"$\n");

        for (Car car : cars) {
            if (car.getYearOfManufacture() == yearOfManufacture && car.getPrice() > price) {
                System.out.print(car+"\n");
            }
        }
    }
}
