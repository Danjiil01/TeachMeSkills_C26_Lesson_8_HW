package com.teachmeskills.lesson8.homework.maintask.patient;

import com.teachmeskills.lesson8.homework.maintask.doctor.Dentist;
import com.teachmeskills.lesson8.homework.maintask.doctor.Doctor;
import com.teachmeskills.lesson8.homework.maintask.doctor.Surgeon;
import com.teachmeskills.lesson8.homework.maintask.doctor.Therapist;

// Класс Пациент
public class Patient {
    private int treatmentPlan;
    private Doctor doctor;

    // Установка плана лечения
    public void setTreatmentPlan(int plan) {
        this.treatmentPlan = plan;
    }

    // Назначение доктора и проведение лечения
    public void assignDoctor() {
        if (treatmentPlan == 1) {
            doctor = new Surgeon();
        } else if (treatmentPlan == 2) {
            doctor = new Dentist();
        } else {
            doctor = new Therapist();
        }

        doctor.treat(); // Вызов метода лечения соответствующего доктора
    }
}
