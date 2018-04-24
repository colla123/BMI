package com.example.android.bmipractice;

public class myClass {


    public static void main(String[] args) {

        double bmiValue = bmiCalculator(56, 1.6);

        if (bmiValue > 25){
            System.out.println("You are overweight");
        }else if (bmiValue >= 18.5 && bmiValue <= 25){
            System.out.println("Your weight is normal");
        }else {
            System.out.println("You are underweight");
        }
    }

    public static double bmiCalculator(double personWeight, double personHeight){

        double bmiStatus = personWeight / (personHeight * 2);

        return bmiStatus;
    }
}
