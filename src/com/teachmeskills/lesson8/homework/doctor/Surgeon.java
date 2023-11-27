package com.teachmeskills.lesson8.homework.doctor;

// Класс Хирург, наследующийся от класса Доктор
public class Surgeon extends Doctor {
    // Переопределение метода лечения для Хирурга
    @Override
    public void treat() {
        // Лечение хирургом
        System.out.println("The surgeon performs a surgery");
    }
}
