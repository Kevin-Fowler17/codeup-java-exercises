package Util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }
    public String getString(String prompt) {
        System.out.print(prompt);
        return getString();
    }

    public boolean yesNo() {
        String response = getString();
        if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
            return true;
        }
        return false;
    }
    public boolean yesNo(String prompt) {
        System.out.print(prompt);
        return yesNo();
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public int getInt(int min, int max) {
        System.out.printf("Enter a number between %f and %f%n", min, max);
        int anInt = getInt();
        if(anInt < min || anInt > max) {
            return getInt(min, max);
        }
        return anInt;
    }

    public double getDouble() {
        return scanner.nextDouble();
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter a number between %f and %f%n", min, max);
        double aDouble = getDouble();
        if(aDouble < min || aDouble > max) {
            return getDouble(min, max);
        }
        return aDouble;
    }




}
