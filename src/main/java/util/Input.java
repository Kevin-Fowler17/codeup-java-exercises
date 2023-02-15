package util;

import java.util.Scanner;

public class Input {

//    private Scanner scanner;
//
//    public Input() {
//
//        scanner = new Scanner(System.in);
//    }
//
//    public String getString() {
//        return scanner.nextLine();
//    }
//    public String getString(String prompt) {
//        System.out.print(prompt);
//        return getString();
//    }
//
//    public boolean yesNo() {
//        String response = getString();
//        if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
//            return true;
//        }
//        return false;
//    }
//    public boolean yesNo(String prompt) {
//        System.out.print(prompt);
//        return yesNo();
//    }
//
//    public int getInt() {
//        return scanner.nextInt();
//    }
//
//    public int getInt(int min, int max) {
//        System.out.printf("Enter a number between %f and %f%n", min, max);
//        int anInt = getInt();
//        if(anInt < min || anInt > max) {
//            return getInt(min, max);
//        }
//        return anInt;
//    }
//
//    public double getDouble() {
//        return scanner.nextDouble();
//    }
//
//    public double getDouble(double min, double max) {
//        System.out.printf("Enter a number between %f and %f%n", min, max);
//        double aDouble = getDouble();
//        if(aDouble < min || aDouble > max) {
//            return getDouble(min, max);
//        }
//        return aDouble;
//    }


    private Scanner sc;

    public Input(){
        this.sc = new Scanner(System.in);
    }

    public String getString(){
        return this.sc.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return getString();
    }

    public boolean yesNo(){
        return yesNo("Enter yes or no.");
    }

    public boolean yesNo(String prompt){
        System.out.print(prompt);
        String response = this.sc.next();
        if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
            return true;
        };
        return false;
    }


    public int getInt(){
        System.out.print("Enter an integer: ");
        return this.sc.nextInt();
    }

    public int getInt(int min, int max){
        return getInt(min, max,"Enter an integer between " + min + " and " + max + ": ");
    }

    public int getInt(int min, int max, String prompt){
        int anInt;
        do{
            System.out.print(prompt);
            anInt = this.sc.nextInt();
        } while(anInt < min || anInt > max);

        return anInt;
    }

    public double getDouble(){
        System.out.print("Enter a double: ");
        return this.sc.nextDouble();
    }

    public double getDouble(double min, double max){
        return getDouble(min,max,"Enter a number between " + min + " and " + max + ": ");

    }

    public double getDouble(double min, double max, String prompt){
        double aDouble;
        do{
            System.out.print(prompt);
            aDouble = this.sc.nextDouble();
        }while(aDouble < min || aDouble > max);

        return aDouble;
    }

}
