package com.vetias.java.workshop.tempdata.beans;

import java.time.LocalDateTime;

public class Hostel extends Building {
    private boolean isMessavailable;
    private int Roomsavailable;
    public Hostel(String name, double area, int floors, LocalDateTime openHours, LocalDateTime closeHours, boolean isMessavailable, int Roomsavailable) {
        super(name, area, floors, openHours, closeHours);
        this.isMessavailable = isMessavailable;
        this.Roomsavailable = Roomsavailable;
    }
    public void setMessavailable(boolean aisMessavailable) {
        isMessavailable = aisMessavailable;
    }
    public boolean getMessavailable(){
        return isMessavailable;
    }
    public int getIsRoomsavailable() {
        return Roomsavailable;
    }
    public void setIsRoomsavailable(int isRoomsavailable) {
        this.Roomsavailable = isRoomsavailable;
    }
    
    @Override
    public String toString() {
        return "Hostel{" +
                "isMessavailable=" + isMessavailable +
                ", Roomsavailable=" + Roomsavailable +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hostel)) return false;
        if (!super.equals(o)) return false;
        Hostel hostel = (Hostel) o;
        return isMessavailable == hostel.isMessavailable &&
                Roomsavailable == hostel.Roomsavailable;
    }


}
