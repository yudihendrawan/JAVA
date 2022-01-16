
class Dosen{
    String nama, nik, jurusan;
    void Dosen (String namaX, String nikX, String jurX){
        nama = namaX;
        nik = nikX;
        jurusan = jurX;
        
             
    }
// Konsep Override/Overriding di gunakan pada method view ()
// Method ini ditulis ulang
// pada setiap subclass yaitu rektor, dekan, dan kalab.    

    void view(){
        System.out.println("Nama = "+nama);
        System.out.println("NIK = "+nik);
        System.out.println("Jurusan = "+jurusan);
       
    }
   
}

class Rektor extends Dosen{
    int th_mulai, jabatan_ke;
    Rektor(String namaX, String nikX, String jurX, int thX, int keX ){
        nama = namaX;
        nik = nikX;
        jurusan = jurX;
        th_mulai = thX;
        jabatan_ke = keX;
        
    }
    
   
    void view(){
        System.out.println("Nama = "+nama);
        System.out.println("NIK = "+nik);
        System.out.println("Jurusan = "+jurusan);
        System.out.println("Tahun Mulai jabatan = "+th_mulai);
        System.out.println("Jabatan Rektor Ke - = "+jabatan_ke);
        
    }
}

class Dekan extends Dosen{
    int th_mulai, jabatan_ke;
    String fakultas;
    Dekan(String namaX, String nikX, String jurX, String fakX){
        nama = namaX;
        nik = nikX;
        jurusan = jurX;
        fakultas = fakX;
    }
   
    void view(){
        System.out.println("Nama = "+nama);
        System.out.println("NIK = "+nik);
        System.out.println("Jurusan = "+jurusan);
        System.out.println("Fakultas = "+fakultas);
    }
}
class Kalab extends Dosen{
    int th_mulai, jabatan_ke;
    String fakultas;
    Kalab(String namaX, String nikX, String jurX, String fakX){
        nama = namaX;
        nik = nikX;
        jurusan = jurX;
        fakultas = fakX;
    }
    
    void view(){
        System.out.println("Nama = "+nama);
        System.out.println("NIK = "+nik);
        System.out.println("Jurusan = "+jurusan);
        System.out.println("Fakultas = "+fakultas);
    }
}

public class Bagus{
    public static void main(String[]  args){
        Rektor rek = new Rektor("Darman", "00000", "TI", 2022, 2);
        Dekan dek = new Dekan("Januar", "1111", "TI", "Ilmu Komputer");
        Kalab lab = new Kalab("Ridho", "22222", "TI", "RA49");
        rek.view();
        System.out.println("======================");
        dek.view();
         System.out.println("======================");
         lab.view();
        
    }
}

