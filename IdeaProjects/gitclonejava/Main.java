package com.codewithmoshjava;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        final byte MONTHLY_IN_YEAR =12;
        final byte PERCENT   = 100;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate:");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHLY_IN_YEAR;

        System.out.print("Period (Year):");
        byte years = scanner.nextByte();
        int numbersOfPayment = years*MONTHLY_IN_YEAR;
        double mortgage = principal*
                (monthlyInterest* Math.pow(1 + monthlyInterest,numbersOfPayment))/
                        (Math.pow(1+monthlyInterest, numbersOfPayment)- 1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage:" + mortgageFormatted);


    }
}