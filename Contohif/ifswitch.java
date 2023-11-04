// catatan 4
public class ifswitch {

    public static void main (String[] args) {
        int a = 3;
        int b = 5;
        int c = 10;
        
        if (a == 5 && (b == 3 || c == 10)) {
            System.out.println("Blok A");
        } else {
            System.out.println("Blok B");
        }
        //-----------------------------
        switch(a) {
            case 0: {
                break;
            }
            case 1: {
                break;
            }
            default: {
                break;
            }
        }
        //-----------------------------
        int input = 5;
        char ch = 'A';

        for(int i = 0; i < input; i++) {  // Loop baris
            for(int j = 0; j < 4; j++) {   // Loop untuk mencetak bintang
        System.out.print("*");
            }
        System.out.println(ch);  // Cetak karakter alfabet dan pindah ke baris berikutnya
        ch++;  // Pindah ke karakter berikutnya
}

        
    }
}
