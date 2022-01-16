class nilai{
    int nt, na, uts, uas, semester;
    float nak;
    String nama, nim, jurusan;
    void data(){
        System.out.println("NIM : "+nim);
        System.out.println("Nama Mahasiswa : "+nama);
        System.out.println("Jurusan Mahasiswa : "+jurusan);
        System.out.println("Semester Mahasiswa : "+semester);
        
    }
    void nilai(int nt1, int nt2, int nt3){
        nt = (nt1 + nt2 + nt3)/3;
        System.out.println("Nilai tugas : "+nt);
    }
    void nilai(int NA){
        na = NA;
        System.out.println("Nilai absen : "+na);
    }
    void nilai(int UTS, int UAS){
        uts = UTS;
        uas = UAS;
        System.out.println("Nilai UTS : "+uts);
        System.out.println("Nilai UAS : "+uas);
    }
    float NAK(){
        float nak = (float) ((na * 0.15) + (nt * 0.15) + (uts * 0.30) + (uas * 0.40));
        return nak;
    }

}




public class App {
    public static void main(String[] args) throws Exception {
        nilai mahasiswa= new nilai();
        mahasiswa.nim = "200401060";
        mahasiswa.nama= "Yudi Hendrawan";
        mahasiswa.jurusan="Teknik Informatika";
        mahasiswa.semester =3;
        mahasiswa.data();
        mahasiswa.nilai(80,85,90);
        mahasiswa.nilai(100);
        mahasiswa.nilai(80,90);
        System.out.println("Nilai akhir mahasiswa : "+mahasiswa.NAK());
    }
}
