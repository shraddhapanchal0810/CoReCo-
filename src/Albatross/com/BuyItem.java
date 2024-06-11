package Albatross.com;

public class BuyItem {
    public static void main(String[] args) {
        int[] notes = {2, 3, 1, 0}; 
        int price = 450; 
        
        if (canPurchase(notes, price)) {
            System.out.println("I can purchase");
        } else {
            System.out.println("I need more money");
        }
    }
    
    public static boolean canPurchase(int[] notes, int price) {
        int totalMoney = notes[0] * 10 + notes[1] * 50 + notes[2] * 100 + notes[3] * 200;
        
        if (totalMoney >= price) {
            return true;
        } else {
            return false;
        }
    }
}