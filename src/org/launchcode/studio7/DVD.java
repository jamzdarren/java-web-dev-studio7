package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {

    // TODO: Implement your custom interface.
    public DVD(String discName, Integer minSpinRate, Integer maxSpinRate, Integer capacityUsed) {
        super(discName, minSpinRate, maxSpinRate, capacityUsed);
    }


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    @Override
    public void spinDisc() {
        System.out.println("The " + getDiscName() + " DVD spins at a rate of " + getMinSpinRate() + " - " + getMaxSpinRate() + " rpm.");
    }

    @Override
    public void discCapacity() {
        System.out.println("The " + getDiscName() + " DVD has a capacity of " + dvdCapacity + " MB.");
    }

    @Override
    public Integer spaceLeft() {
        return dvdCapacity - getCapacityUsed();
    }

}
