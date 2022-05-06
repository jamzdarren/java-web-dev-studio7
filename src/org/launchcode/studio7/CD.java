package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    //constructor
    public CD(String discName, Integer minSpinRate, Integer maxSpinRate, Integer capacityUsed) {
        super(discName, minSpinRate, maxSpinRate, capacityUsed);
    }

    //methods
    @Override
    public void spinDisc() {
        System.out.println("A " + getDiscName() + " CD spins at a rate of " + getMinSpinRate() + " - " + getMaxSpinRate() + " rpm.");
    }

    @Override
    public void discCapacity() {
        System.out.println("A " + getDiscName() + " CD has a capacity of " + cdCapacity + " MB.");
    }

    @Override
    public Integer spaceLeft() {
        return cdCapacity - getCapacityUsed();
    }
}
