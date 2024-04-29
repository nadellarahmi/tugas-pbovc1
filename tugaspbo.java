import java.util.Scanner;

public class tugaspbo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan umur Anda: ");
        int umur = input.nextInt();
        
        // Menggunakan if-else
        if (umur < 0) {
            System.out.println("Umur tidak valid");
        } else if (umur < 21) {
            System.out.println("Anda adalah seorang anak");
        } else if (umur < 60) {
            System.out.println("Anda adalah seorang dewasa");
        } else {
            System.out.println("Anda adalah seorang lansia");
        }
        
        // Menggunakan switch
        System.out.print("Masukkan pilihan (1-3): ");
        int pilihan = input.nextInt();
        
        switch (pilihan) {
            case 1:
                System.out.println("anak-anak");
                break;
            case 2:
                System.out.println("dewasa");
                break;
            case 3:
                System.out.println("lansia");
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
        
        input.close();
    }
}