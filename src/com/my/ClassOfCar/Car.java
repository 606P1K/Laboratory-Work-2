package com.my.ClassOfCar;

/**
 * Клас для зберігання даних про Автомобіль
 * @author Volodymyr Stepaniuk
 */
public class Car {
    private final int id;
    private static int incrementId;
    private String model;
    private int yearOfManufacture;
    private double price;
    private int regNumber;
    /**
     * Конструктор cтворення нового об'єкту
     * @see Car#Car(String model, int yearOfManufacture, double price, int regNumber)
     */
    public Car(){id = ++incrementId;}

    /**
     * Конструктор cтворення нового об'єкту з певним заданим значенням
     * @param model модель автомобіля
     * @param yearOfManufacture рік випуску автомобіля
     * @param price ціна автомобіля
     * @param regNumber реєстраційний номер автомобіля
     * @see Car#Car()
     */
    public Car(String model, int yearOfManufacture, double price, int regNumber) {
        id = ++incrementId;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.price = price;
        this.regNumber = regNumber;
    }

    /**
     * Геттер для поля id
     * @return id автомобіля
     */
    public int getId() {
        return id;
    }

    /**
     * Геттер для поля model
     * @return model автомобіля
     */
    public String getModel() {
        return model;
    }

    /**
     * Сеттер для поля model
     * @param model автомобіля
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Геттер для поля yearOfManufacture
     * @return yearOfManufacture автомобіля
     */
    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    /**
     * Сеттер для поля yearOfManufacture
     * @param yearOfManufacture автомобіля
     */
    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }
    /**
     * Геттер для поля regNumber
     * @return regNumber автомобіля
     */
    public int getRegNumber() {
        return regNumber;
    }

    /**
     * Сеттер для поля regNumber
     */
    public void setRegNumber() {
        this.regNumber = hashCode();
    }
    /**
     * Геттер для поля price
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Сеттер для поля price
     * @param price автомобіля
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Перевантажений метод toString
     * @return представлення об'єкта у String форматі
     */
    @Override
    public String toString() {
        return "Car{" +
                "id = " + id +
                ", model = '" + model + '\'' +
                ", yearOfManufacture = " + yearOfManufacture +
                ", price = " + price +
                ", regNumber = " + regNumber +
                '}';
    }

    /**
     * Перевантажений метод hashCode
     * @return 32-бітове число типу int
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
