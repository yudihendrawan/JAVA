class gaji{
    int gapok, uangmakan, uangtransport;
    int total;
    String nama, divisi, nip;
    void data(){
        System.out.println("NIP : "+nip);
        System.out.println("Nama Mahasiswa : "+nama);
        System.out.println("Divisi Karyawan : "+divisi);
        
    }
    void gaji(int GP){
        gapok = GP;
        System.out.println("Gaji pokok : "+gapok);
    }
    void gaji(int UT, int UM){
        uangmakan = UM;
        uangtransport = UT;
        total = ((uangmakan *24) + (uangtransport*24));
        System.out.println("total uang makan dan transport : "+total);
    }
    int gatot(){
        int gatot = total +  gapok;
        return gatot;
    }

}




public class methodoverload060 {
    public static void main(String[] args) throws Exception {
        gaji karyawan = new gaji();

        karyawan.nip ="200401060";
        karyawan.nama="Yudi Hendrawan";
        karyawan.divisi = "Manajemen";
        karyawan.gaji(3000000);
        karyawan.gaji(10000, 15000);

        System.out.println("gaji akhir : "+karyawan.gatot());
    }
}
