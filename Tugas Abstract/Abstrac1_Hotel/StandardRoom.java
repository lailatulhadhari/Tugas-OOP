public class StandardRoom extends HotelRoom {
    public StandardRoom(int roomNumber) {
        super(roomNumber, 100000);
    }

    @Override
    public String getRoomType() {
        return "Standard Room";
    }
}
