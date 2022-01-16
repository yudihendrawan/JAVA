
class Datakaryawan {
    String nip, nama, divisi;
    int gapok, umakan, utransport, jumgaji;
    
       Datakaryawan(int Gapok, int Umakan, int Utransport){
       gapok = Gapok;
       umakan = Umakan;
       utransport = Utransport;
       jumgaji = (gapok + (umakan*24) + (utransport*24));
       System.out.println("Jumlah Gaji adalah : "+jumgaji);
       } 
       
       
       Datakaryawan(){
        System.out.println("Ini adalah data karyawan");
    }
        
    Datakaryawan(String Nip, String Nama, String Divisi) {
    nip = Nip;
    nama = Nama;
    divisi = Divisi;
   
    System.out.println("Nip : "+nip);
    System.out.println("Nama karyawan : "+nama);
    System.out.println("Divisi : "+divisi);
    
    }
}

public class constructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Datakaryawan datakaryawan1 = new Datakaryawan();
       Datakaryawan datakaryawan2 = new Datakaryawan("2121212","Okky Ariatna Valeri", "Staff");
       Datakaryawan datakaryawan3 = new Datakaryawan(3000000, 15000, 25000);
    }
    
}