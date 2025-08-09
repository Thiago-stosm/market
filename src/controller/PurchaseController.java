package controller;

import model.Purchase;

import java.util.Map;
import java.util.Scanner;

public class PurchaseController {
    private Purchase purchase;
    public static void addProduct(){
        String answer = "";
        do{
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the product ID: ");
            int productID = sc.nextInt();

            System.out.print("Enter the product quantity: ");
            int productQtd = sc.nextInt();

            System.out.print("Wish to register more any product? Y/N ");
            answer = sc.next();
            sc.nextLine();

        }while(!answer.equals("N"));
    }
}
