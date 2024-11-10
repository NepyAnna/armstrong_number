package com.sheoanna;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        int number  = 371;
        List<Integer> numbers = new ArrayList<>();
        int sumOfPows = 0;

        String stringNumber = String.valueOf(number);

        for (char i : stringNumber.toCharArray()) {
            Integer numberToInt = Integer.parseInt(String.valueOf(i));//Integer numberToInt = Integer.valueOf(i);
            numbers.add(numberToInt);
        }

        for(int item :numbers) {
            sumOfPows += Math.pow(item, numbers.size());
            System.out.println(sumOfPows);
        }


        
       //IsArmstrongNumber number = new IsArmstrongNumber(371);
       //System.out.println(number.isArmstrongNumber());
    }


}
