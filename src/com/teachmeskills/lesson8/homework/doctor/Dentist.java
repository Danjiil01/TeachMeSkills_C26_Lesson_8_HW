package com.teachmeskills.lesson8.homework.doctor;

// Класс Дантист, наследующийся от класса Доктор
public class Dentist extends Doctor{
    // Переопределение метода лечения для Дантиста
    @Override
    public void treat() {
        // Лечение дантистом
        System.out.println("The dentist performs dental treatment");
    }
}
