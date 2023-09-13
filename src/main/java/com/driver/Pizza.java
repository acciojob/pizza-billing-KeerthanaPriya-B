package com.driver;
import java.util.Scanner;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;
    private int total;
    private int ExtraCheese = 0, ExtraToppings = 0, paperBag = 0;
    Scanner sc = new Scanner(System.in);
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        //your code goes here --------------------------------
        if(isVeg) {this.price = 300;}
        else {this.price = 400;}
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here --------------------------------
        System.out.print("Want Extra Cheese [YES/NO]: ");
        String ans = sc.nextLine();
        if(ans.equals("YES") || ans.equals("yes")) {
            ExtraCheese += 80;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        System.out.print("Want Extra Toppings [YES/NO]: ");
        String ans = sc.nextLine();
        if(ans.equals("YES") || ans.equals("yes")) {
            if(isVeg) ExtraToppings += 70;
            else ExtraToppings += 120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        System.out.print("Want Paper Bag to Takeaway [YES/ NO]:");
        String ans = sc.nextLine();
        if(ans.equals("YES") || ans.equals("yes")) {
            paperBag = 20;
        }
    }

    public String getBill(){
        // your code goes here
        bill = "Base Price Of The Pizza: " + price;
        if(ExtraCheese != 0) {
            bill += "/nExtra Cheese Added: " + ExtraCheese;
        }
        if(ExtraToppings != 0) {
            bill += "/nExtra Toppings Added: " + ExtraToppings;
        }
        if(paperBag != 0) {
            bill += "/nPaperbag Added: " + paperBag;
        }
        total += price+ExtraCheese+ExtraToppings+paperBag;
        bill += "/nTotal Price: " + total;
        return this.bill;
    }
}
