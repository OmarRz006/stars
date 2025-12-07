package oop;

import java.util.Scanner;

public class PizzaOrderTest {
    public static void main(String[] args) {
        PizzaOrder arr[]=new PizzaOrder[3];
        FiilArray(arr);
        printAll(arr);
    }
    public static void FiilArray(PizzaOrder arr[]){
        Scanner s=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=new PizzaOrder();
            System.out.print("Enter the pizza type you want(Greek pizza , Detroit Pizza , California Pizza): ");
            arr[i].setPizzaType(s.next());
            System.out.print("How much quantity you want: ");
            arr[i].setQuantity(s.nextInt());
            System.out.print("Enter the size (L or S): ");
            arr[i].setSize(s.next().charAt(0));
        }
    }
    public static void printAll(PizzaOrder arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
