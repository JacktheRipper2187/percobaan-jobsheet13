public class Kubus22 {
static double hitungVolume(double sisi) {
return sisi * sisi * sisi;

}

static double hitungLuasPermukaan(double sisi) {
return 6 * sisi * sisi;
}
        
public static void main(String[] args) {
double sisi = 5.0; 
        
double volume = hitungVolume(sisi);
double luasPermukaan = hitungLuasPermukaan(sisi);
        
System.out.println("Volume Kubus: " + volume);
System.out.println("Luas Permukaan Kubus: " + luasPermukaan);


}

}
        
    

