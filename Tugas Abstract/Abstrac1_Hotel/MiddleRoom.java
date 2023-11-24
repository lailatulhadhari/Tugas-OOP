public class MiddleRoom extends HotelRoom {
    public MiddleRoom(int roomNumber) {
        super(roomNumber, 150000);
    }

    @Override
    public String getRoomType() {
        return "Middle Room";
    }
}
