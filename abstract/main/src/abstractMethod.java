//Class abstract 
abstract class Pegawai060{
    //Method abstract 
    abstract void lihatData060();
    abstract void gajiAkhir060();
}

class DataKaryawan extends Pegawai060{
    String nama, noPegawai, divisi;
    @Override
    void lihatData060(){
        System.out.println("Nim: "+noPegawai);
        System.out.println("Nama : "+nama);
        System.out.println("Jurusan : "+divisi);
        System.out.println("===================");
    }
    int gajiPokok, uangMakan, uangTransport, uangLembur, total;
    void gajiAkhir060(){
        System.out.println("Gaji Pokok: "+gajiPokok);
        System.out.println("Uang Makan: "+uangMakan);
        System.out.println("Uang Trasnport: "+uangTransport);
        System.out.println("Uang Lembur: "+uangLembur);
        total = (int) ((gajiPokok*0.1) + (uangMakan * 0.20) + (uangTrasnport * 0.30) + (uangLembur * 0.40));
        System.out.println("Total Gaji = "+total);
    }
    @Override
    void lihatData060() {
        // TODO Auto-generated method stub
        
    }
    @Override
    void gajiAkhir060() {
        // TODO Auto-generated method stub
        
    }
}


public class abstractMethod {
    public static void main(String[] args) throws Exception {
        DataKAryawan data = new DataKaryawan();
        data.noPegawai = "1111";
        data.nama = "Yudi";
        data.gajiPokok = 1;
        data.uangMakan = 2;
        data.uangTransport = 3;
        data.uangLembur = 4;
        data.View_Data();
        data.Nilai_Akhir();        
    }
}
