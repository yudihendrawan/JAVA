//Class abstract 
abstract class Nilai{
    //Method abstract 
    abstract void View_Data();
    abstract void Nilai_Akhir();
}

class Data_Mahasiswa extends Nilai{
    String nama, nim, jurusan;
 
    void view_data(){
        System.out.println("Nim: "+nim);
        System.out.println("Nama : "+nama);
        System.out.println("Jurusan : "+jurusan);
        System.out.println("===================");
    }
    int nab, nt, nuts, nuas, na;
    void Nilai_Akhir(){
        System.out.println("Nilai Absen: "+nab);
        System.out.println("Nilai Tugas: "+nt);
        System.out.println("Nilai UTS: "+nuts);
        System.out.println("Nilai UAS: "+nuas);
        na = (int) ((nab*0.1) + (nt * 0.20) + (nuts * 0.30) + (nuas * 0.40));
    }
  
    void View_Data() {
        // TODO Auto-generated method stub
        System.out.println("Nim: "+nim);
        System.out.println("Nama : "+nama);
        System.out.println("Jurusan : "+jurusan);
        System.out.println("===================");
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        Data_Mahasiswa data = new Data_Mahasiswa();
        data.nim = "1111";
        data.nama = "Yudi";
        data.jurusan = "TI";
        data.nab = 1;
        data.nt = 2;
        data.nuts = 3;
        data.nuas = 4;
        data.View_Data();
        data.Nilai_Akhir();        
    }
}
