public class Hostel extends Building {
    private boolean isMessavailable;
    private int Roomsavailable;

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
    public void printDetails() {
        super.printDetails();
        System.out.println("Hostel Building Details:");
        System.out.println("Mess Available: " + isMessavailable);
        System.out.println("Rooms Available: " + Roomsavailable);
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
