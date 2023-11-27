package com.teachmeskills.lesson8.homework.maintask;

import com.teachmeskills.lesson8.homework.maintask.patient.Patient;

import java.util.Scanner;

public class ClinicSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Patient patient = new Patient();

        // Ввод кода лечения для назначения плана лечения
        System.out.print("Enter the treatment plan (1 - surgeon, 2 - dentist, any other - therapist):");
        int treatmentPlan = scanner.nextInt();
        patient.setTreatmentPlan(treatmentPlan);

        patient.assignDoctor(); // Назначение доктора и проведение лечения
    }
}
