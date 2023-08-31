package com.java.DollarToRupees;
import java.util.Scanner;

public class DollarToRupees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter USD: ");
        float usd = sc.nextFloat();

        float exhngRate = 82.64f;
        float inr = usd * exhngRate;

        System.out.println("The INR amount of " + usd + "$ is: " + "Rs " + inr);
    }
}
