package com.sheoanna;

import java.util.ArrayList;
import java.util.List;

public class IsArmstrongNumber {
    private Integer classNumber;

    public IsArmstrongNumber(Integer number){
       this.classNumber = number;
    }

    public List<Integer> isArmstrongNumber() {
        String stringNumber = String.valueOf(classNumber);
        List<Integer> result = new ArrayList();


        for (char i : stringNumber.toCharArray()) {
            int element = i;
            System.out.println(element);
           
        }
        return result;
    }

    public Integer getNumber() {
        return classNumber;
    }
}
