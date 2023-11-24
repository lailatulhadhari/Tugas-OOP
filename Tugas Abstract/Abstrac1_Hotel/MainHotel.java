public class MainHotel {
    public static void main(String[] args) {
        MiddleRoom MiddleRoom = new MiddleRoom(101);
        MiddleRoom.reserveRoom();
        System.out.println(MiddleRoom.getRoomType() + " - Room Number: " + MiddleRoom.getRoomNumber() +
                ", Harga per malam: Rp" + MiddleRoom.gethargapermalam());

        StandardRoom standardRoom = new StandardRoom(201);
        standardRoom.reserveRoom();
        System.out.println(standardRoom.getRoomType() + " - Room Number: " + standardRoom.getRoomNumber() +
                ", Harga per malam: Rp" + standardRoom.gethargapermalam());

        TopRoom TopRoom = new TopRoom(301);
        TopRoom.reserveRoom();
        System.out.println(TopRoom.getRoomType() + " - Room Number: " + TopRoom.getRoomNumber() +
                ", Harga per malam: Rp" + TopRoom.gethargapermalam());
    }
}
