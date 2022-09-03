package com.my.ClassOfCar;

/**
 * Клас для зберігання даних про Автомобіль
 * @author Volodymyr Stepaniuk
 */
public class Car {
    private int id;
    private String model;
    private int yearOfManufacture;
    private int price;
    private int regNumber;
    /**
     * Конструктор cтворення нового об'єкту
     * @see Car#Car(int id,String model, int yearOfManufacture, int price, int regNumber)
     */
    public Car(){}

    /**
     * Конструктор cтворення нового об'єкту з певним заданим значенням
     * @param id айді автомобіля
     * @param model модель автомобіля
     * @param yearOfManufacture рік випуску автомобіля
     * @param price ціна автомобіля
     * @param regNumber реєстраційний номер автомобіля
     * @see Car#Car()
     */
    public Car(int id,String model, int yearOfManufacture, int price, int regNumber) {
        this.id = id;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.price = price;
        this.regNumber = regNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRegNumber() {
        this.regNumber = hashCode();
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
