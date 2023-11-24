public class TopRoom extends HotelRoom {
    public TopRoom(int roomNumber) {
        super(roomNumber, 200000);
    }

    @Override
    public String getRoomType() {
        return "Top Room";
    }
}
