package thom9521.Coffee;

import java.util.Scanner;

public class Coffee {

    private Type type;
    private int price = 0;
    private boolean empty;

    Coffee() {
        System.out.println("You got your cup, now enter if your cup is empty by 'true' or 'false'.");
        Scanner input = new Scanner(System.in);
        empty = input.nextBoolean();
        if (empty == true) {
            System.out.println("Now enter the coffeetype you want:");

            //Under construction

        }
        else {
            System.out.println("Your coffee is full, come back when you need more coffee :)");
        }
    }



}
