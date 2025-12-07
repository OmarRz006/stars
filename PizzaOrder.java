package oop;

import java.util.Objects;

public class PizzaOrder {
String pizzaType;
int quantity;
char size;

    public PizzaOrder() {
        pizzaType="GreekPizza";
        quantity=2;
        size='s';
    }

    public PizzaOrder(String pizzaType, int quantity, char size) {
        this.pizzaType = pizzaType;
        this.quantity = quantity;
        this.size = size;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "PizzaOrder{" + "pizzaType=" + pizzaType + ", quantity=" + quantity + ", size=" + size + '}';
    }


    
    public double gettypecost(){
        double Pcost=0;
        switch(pizzaType){
            case "greek Pizza":Pcost=6.0;break;
            case "Detroit Pizza":Pcost=4.0;break;
            case "California Pizza":Pcost=3.5;break;
        }
    return Pcost;
    }
    public double getSizeCost(){
        double Scost=0;
        switch(size){
            case 'S':Scost=0.75;break;
            case 'L':Scost=1.25;break;
        }
        return Scost;
    }
    public double  CalculatePizzaCost(){
        double PizzaCost=0;
        PizzaCost=(getSizeCost()+gettypecost())*quantity;
        return PizzaCost;
    }
 

}
