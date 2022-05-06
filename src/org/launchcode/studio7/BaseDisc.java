package org.launchcode.studio7;

public abstract class BaseDisc<discType> {
    static Integer cdCapacity = 700;
    static Integer dvdCapacity = 4700;

    private String discName;
    private Integer minSpinRate;
    private Integer maxSpinRate;
    private Integer capacityUsed;

    //constructor
    public BaseDisc(String discName, Integer minSpinRate, Integer maxSpinRate, Integer capacityUsed) {
        this.discName = discName;
        this.minSpinRate = minSpinRate;
        this.maxSpinRate = maxSpinRate;
        this.capacityUsed = capacityUsed;
    }

    //getters & setters
    public String getDiscName() {
        return discName;
    }

    public void setDiscName(String discName) {
        this.discName = discName;
    }

    public Integer getMinSpinRate() {
        return minSpinRate;
    }

    public void setMinSpinRate(Integer minSpinRate) {
        this.minSpinRate = minSpinRate;
    }

    public Integer getMaxSpinRate() {
        return maxSpinRate;
    }

    public void setMaxSpinRate(Integer maxSpinRate) {
        this.maxSpinRate = maxSpinRate;
    }

    public Integer getCapacityUsed() {
        return capacityUsed;
    }

    public void setCapacityUsed(Integer capacityUsed) {
        this.capacityUsed = capacityUsed;
    }

    //methods
    public abstract Integer spaceLeft();

}
