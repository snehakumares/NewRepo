package mylearningphase1;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        System.out.println("Hello");
        System.out.print("Enter a number : ");
        inputentry();
    }
    public static void inputentry() {
        Scanner scanner = new Scanner(System.in);
        int x;
        try{
            x = scanner.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Not a number");
        }
        finally {
            System.out.println("Inside finally");
        }
    }
}
