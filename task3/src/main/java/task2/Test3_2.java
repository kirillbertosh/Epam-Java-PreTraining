package task2;

import task2.dragon.Dragon;

public class Test3_2 {

    public static void main(String[] args) {
        int dragonAge = 35;
        System.out.println("Dragon age is " + dragonAge);
        System.out.println("Dragon have " + Dragon.getHeadsCount(dragonAge) + " heads");
    }

}
