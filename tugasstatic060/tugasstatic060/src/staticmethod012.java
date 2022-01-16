class datakaryawan{
    // Attribute non static
    String nip012, nama012, divisi012;
    int gapok012, gatot012;
    // Attribute static
    static int jumlahHari012 = 24, uangMakan012 = 25000 , uangTransport012 = 30000;

    
    //Method static
    static void gajiTambahan(){
        // System.out.println(java.time.LocalDate.now());
        System.out.println("Uang makan karyawan sebulan = " + (uangMakan012 * jumlahHari012));
        System.out.println("Uang transportasi karyawan sebulan = " + (uangTransport012 * jumlahHari012));
        

    }
    // Method non static    
    void gajipokok(int Gapok012){
        gapok012 = Gapok012;
        System.out.println("Gaji pokok : " + gapok012);
        
        int gatot060 = (gapok012 + (uangMakan012 * jumlahHari012) + (uangTransport012 * jumlahHari012));
        System.out.println("Gaji total karyawan : " + gatot060 );
    }
    
    //Method non static
    void karyawan(String Nip012, String Nama012, String Divisi012){
        nip012 = Nip012;
        nama012 = Nama012;
        divisi012 = Divisi012;
        System.out.println("NIP karyawan : " + nip012);
        System.out.println("nama karyawan : " + nama012);
        System.out.println("divisi karyawan : " + divisi012);

    }
}

public class staticmethod012 {
    public static void main(String[] args) throws Exception {
        
        //Memanggil method non static
        datakaryawan karyawan1 = new datakaryawan();    
        karyawan1.karyawan("200401012", "Fahira Najua","Marketing");
        
        //Memanggil method static
        System.out.println("Uang makan = " + datakaryawan.uangMakan012);
        System.out.println("Uang transport = " + datakaryawan.uangTransport012);
        datakaryawan.gajiTambahan();
        karyawan1.gajipokok(4500000);

    }
}
