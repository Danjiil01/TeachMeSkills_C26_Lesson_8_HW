package com.teachmeskills.lesson8.homework.maintask.doctor;

// Класс Терапевт, наследующийся от класса Доктор
public class Therapist extends Doctor{
    // Переопределение метода лечения для Терапевта
    @Override
    public void treat() {
        // Лечение терапевтом
        System.out.println("The therapist prescribes medication and provides consultation");
    }
}
