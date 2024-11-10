package com.sheoanna;

import java.util.ArrayList;
import java.util.List;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
       ArmstrongNumber number = new ArmstrongNumber(371);
       System.out.println(number.checkIsArmstrongNumber());

       ArmstrongNumber number2 = new ArmstrongNumber(1634);
       System.out.println(number2.checkIsArmstrongNumber());

       ArmstrongNumber number3 = new ArmstrongNumber(351);
       System.out.println(number3.checkIsArmstrongNumber());

       ArmstrongNumber number4 = new ArmstrongNumber(2015);
       System.out.println(number4.checkIsArmstrongNumber());

    }
}
