public class Hostelbuilding extends Building {
    private boolean isMessavailable;
    private int Roomsavailable;
    public Hostelbuilding(boolean isMessavailable,int Roomsavailable) {
        this.isMessavailable = isMessavailable;
        this.Roomsavailable = Roomsavailable;
    }
    public boolean isMessavailable() {
        return isMessavailable;
    }
    public void setMessavailable(boolean isMessavailable) {
        this.isMessavailable = isMessavailable;
    }
    public int getIsRoomsavailable() {
        return Roomsavailable;
    }
    public void setIsRoomsavailable(int isRoomsavailable) {
        this.Roomsavailable = isRoomsavailable;
    }
    @Override
    public void printdetails() {
        super.printDetails();
        System.out.println("Hostel Building Details:");
        System.out.println("Mess Available: " + isMessavailable);
        System.out.println("Rooms Available: " + Roomsavailable);
    }



}
