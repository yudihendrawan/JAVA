//Class abstract 
abstract class Pegawai060{
    //Method abstract 
    abstract void lihatData060();
    abstract void gajiAkhir060();
}

class DataKaryawan060 extends Pegawai060{
    String nama, noPegawai, divisi;
    @Override
    void lihatData060(){
        System.out.println("Nomor Pegawai: "+noPegawai);
        System.out.println("Nama : "+nama);
        System.out.println("Divisi : "+divisi);
        System.out.println("===================");
    }
    int gajiPokok, uangMakan, uangTransport, jamLembur, total;
    @Override
    void gajiAkhir060(){
        System.out.println("Gaji Pokok: "+gajiPokok);
        System.out.println("Uang Makan: "+uangMakan);
        System.out.println("Uang Transport: "+uangTransport);
        System.out.println("Jam lembur: "+jamLembur);
        System.out.println("=========================");
        System.out.println("Total uang makan: "+uangMakan*24);
        System.out.println("Total uang Transport: "+uangTransport*24);
        System.out.println("Total Uang lembur: "+jamLembur *20000);

        total = (int) ((gajiPokok) + (uangMakan * 24) + (uangTransport * 24) + (jamLembur * 20000));
        System.out.println("Total Gaji = "+total);
    }
}


public class abstract060 {
    public static void main(String[] args) throws Exception {
        DataKaryawan060 data = new DataKaryawan060();
        data.noPegawai = "1111";
        data.nama = "Yudi Hendrawan";
        data.divisi = "Programmer";
        data.gajiPokok = 3000000;
        data.uangMakan = 24000;
        data.uangTransport = 30000;
        data.jamLembur = 10;
        data.lihatData060();
        data.gajiAkhir060();        
    }
}
