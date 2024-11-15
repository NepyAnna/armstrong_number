package com.sheoanna;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumber {
    private int classNumber;

    public ArmstrongNumber(int number){
       this.classNumber = number;
    }

    public List<Integer> getsymbolsFromNumber(int number) {
        List<Integer> symbols = new ArrayList<>();

        String stringNumber = String.valueOf(this.classNumber);

        for (char i : stringNumber.toCharArray()) {
            int numberToInt = Integer.parseInt(String.valueOf(i));
            symbols.add(numberToInt);
        }
        return symbols;
    }
   
    public int getSumOfNemberPows(List<Integer> symbols){
        int sumOfPows = 0;
        
        for(int item :symbols) {
            sumOfPows += Math.pow(item, symbols.size());
        }
        return sumOfPows;
    }

    public boolean checkIsArmstrongNumber() {
        List<Integer> numbers = getsymbolsFromNumber(classNumber);
        int sumOfPows = getSumOfNemberPows( numbers);

        if (sumOfPows == classNumber){
            return true;
        } else {
            return false;
        }  
    }

    public Integer getNumber() {
        return classNumber;
    }
}
