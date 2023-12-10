import java.util.Scanner;

public class UcapanTerimaKasih_22 {

    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void UcapanTerimakasih(){
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+" for being the best teacher in the world.");
        System.out.println(UcapanTambahan("You inspires in me a love for learning and made me feel like I could ask you anything."));
    }
    public static String UcapanTambahan(String pesan){
        return pesan;

    }
    public static void main(String[] args) {
        UcapanTerimakasih();
        
    }
}
