class Mahasiswa060{
    String nim060;

    public void namaMahasiswa(String Nama060){
        System.out.println("\nData Mahasiswa ");
        System.out.println("Nama mahasiswa    : " + Nama060 + " dengan NIM " + nim060);
    }
}
class mataKuliah060 extends Mahasiswa060{
    
    public void namaMataKuliah(String matkul060){

        System.out.println("Nama jurusannya adalah " + matkul060);
    }
}

class dataNilai060 extends Mahasiswa060{
    private double total060;
    public void Nilai(double absen, double tugas, double uts, double uas){
        total060 = ((absen * 0.10) + (tugas * 0.20) + (uts * 0.30) + (uas * 0.40));
        System.out.println("nilai absen (10%) : "+absen);
        System.out.println("nilai tugas (20%) : "+tugas);
        System.out.println("nilai uts   (30%) : "+uts);
        System.out.println("nilai uas   (40%) : "+uas);

        System.out.println("Nilai total keseluruhannya ialah: "+total060 + "\n");
    }

}

public class inheritance060 {
    public static void main(String[] args) throws Exception {
        
        dataNilai060 mahasiswa = new dataNilai060();
        mahasiswa.nim060 = "200401060";
        mahasiswa.namaMahasiswa("Yudi Hendrawan");
        mahasiswa.Nilai(80, 71, 91, 81); 

        mataKuliah060 mahasiswa1 = new mataKuliah060();
        mahasiswa1.nim060 = "200401061";
        mahasiswa1.namaMahasiswa("Yudi Aja");
        mahasiswa1.namaMataKuliah("Teknik Informatika");

    }
}
