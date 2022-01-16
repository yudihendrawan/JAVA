class Karyawan {
    String nip, nama, divisi;
    int gapok, uangMakan, uangTransport, total;


    Karyawan(int Gapok, int UangMakan , int UangTransport){
        gapok = Gapok;
        uangMakan = UangMakan;
        uangTransport = UangTransport;
        total = (gapok + (uangMakan*24) + (uangTransport*24));
        System.out.println("Gaji totalnya adalah : " + total);
    }

    //constructor default/ tanpa parameter
    Karyawan(){
        System.out.println("ini adalah constructor default");
    }

    //constructor dengan parameter
    Karyawan(String Nama, String Nip, String Divisi){
        nama = Nama;
        nip = Nip;
        divisi = Divisi;
        System.out.println("NIM : "+nip);
        System.out.println("Nama : "+nama);
        System.out.println("Jurusan : "+divisi);


    }
}

public class constructor060 {
    public static void main(String[] args) throws Exception {
        Karyawan Karyawan1 = new Karyawan();
        Karyawan Karyawan2 = new Karyawan("200401060", "Yudi Hendrawan", "IT Support");
        Karyawan Karyawan3 = new Karyawan(3000000, 10000, 15000);
    }
}
