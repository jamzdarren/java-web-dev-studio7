package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD newCD = new CD("Bill Joel", 200, 500, 300);
        DVD newDVD = new DVD("Anchorman", 570, 1600, 1400);

        // TODO: Call each CD and DVD method to verify that they work as expected.
        newCD.spinDisc();
        newCD.discCapacity();
        System.out.println(newCD.getDiscName() + " used " + newCD.getCapacityUsed() + " MB and has " + newCD.spaceLeft() + " MB available space.");

        newDVD.spinDisc();
        newDVD.discCapacity();
        System.out.println(newDVD.getDiscName() + " used " + newDVD.getCapacityUsed() + " MB and has " + newDVD.spaceLeft() + " MB available space.");

    }
}
