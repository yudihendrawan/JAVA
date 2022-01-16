class Dosen{
    String nama, nik, jurusan;
    void Dosen (String namaX, String nikX, String juruX){
        nama = namaX;
        nik = nikX;
        jurusan = juruX;
    }
    void view(){
        System.out.println("Nama: " +nama);
        System.out.println("NIK : " +nik);
        System.out.println("Jurusan: " +jurusan);
    }
}

class Rektor extends Dosen{
    int th_mulai, jabatan_ke;
    Rektor(String namaX, String nikX, String jurX, int thX, int keX){
        nama = namaX;
        nik = nikX;
        jurusan = jurX;
        jabatan_ke = keX;
    }
    @Override
    void view(){
        System.out.println("Nama: "+nama);
        System.out.println("NIK : "+nik);
        System.out.println("Jurusan : "+ jurusan);
    }
}

class Dekan extends Dosen{
    String fakultas;
    Dekan(String namaX, String nikX, String jurX, String fakX){
        nama = namaX;
        nik = nikX;
        jurusan = jurX;
        fakultas = fakX;
    }
    @Override
    void view(){
        System.out.println("Nama : "+ nama);
        System.out.println("Nik : "+nik);
        System.out.println("Jurusan : "+jurusan);
        System.out.println("Fakultas :"+fakultas);
    }
}

class Kalab extends Dosen{
    String laboraturium;
    Kalab(String namaX, String nikX, String jurX, String labX){
        nama = namaX;
        nik = nikX;
        jurusan = jurX;
        laboraturium = labX;
    }
    @Override
    void view(){
        System.out.println("Nama : "+ nama);
        System.out.println("Nik : "+nik);
        System.out.println("Jurusan : "+jurusan);
        System.out.println("Laboraturium :"+laboraturium);
    }
}

public class override {
    public static void main(String[] args) throws Exception {
        Rektor rek = new Rektor("Yudi Hendrawan", "200401060", "TI", 2022,2);
        Dekan dek =new Dekan("Bagus Pratama", "20040101", "TI", "Ilmu Komputer");
        Kalab lab = new Kalab("Rio Zaky", "20040100", "TI", "RA48");
        rek.view();
        System.out.println("====================");
        dek.view();
        System.out.println("====================");
        lab.view();
        

    }
}
