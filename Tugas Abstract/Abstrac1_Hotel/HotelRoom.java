public abstract class HotelRoom implements Reservable {
    private int roomNumber;
    private double hargapermalam;

    public HotelRoom(int roomNumber, double hargapermalam) {
        this.roomNumber = roomNumber;
        this.hargapermalam = hargapermalam;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double gethargapermalam() {
        return hargapermalam;
    }

    @Override
    public void reserveRoom() {
        System.out.println("Room " + roomNumber + " telah dipesan");
    }

    public abstract String getRoomType();
}
