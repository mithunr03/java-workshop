package com.vetias.java.workshop.tempdata.beans;

import java.time.LocalDateTime;

public class AcedemicBuilding {
    private boolean islibiraryavailable;
    private boolean isauditoriumavailable;

    public AcedemicBuilding(String name, double area, int floors, LocalDateTime openHours, LocalDateTime closeHours,boolean islibiraryavailable, boolean isauditoriumavailable) {
        this.islibiraryavailable = islibiraryavailable;
        this.isauditoriumavailable = isauditoriumavailable;
    }
    public boolean isLibiraryAvailable() {
        return islibiraryavailable;
    }
    public void setLibiraryAvailable(boolean islibiraryavailable) {
        this.islibiraryavailable = islibiraryavailable;
    }
    public boolean isAuditoriumAvailable() {
        return isauditoriumavailable;
    }
    public void setAuditoriumAvailable(boolean isauditoriumavailable) {
        this.isauditoriumavailable = isauditoriumavailable;
    }
    public void printDetails() {
        System.out.println("Academic Building Details:");
        System.out.println("Library Available: " + islibiraryavailable);
        System.out.println("Auditorium Available: " + isauditoriumavailable);
    }

    @Override
    public String toString() {
        return "AcedemicBuilding{" +
                "islibiraryavailable=" + islibiraryavailable +
                ", isauditoriumavailable=" + isauditoriumavailable +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcedemicBuilding that = (AcedemicBuilding) o;

        if (islibiraryavailable != that.islibiraryavailable) return false;
        return isauditoriumavailable == that.isauditoriumavailable;
    }
    
}
