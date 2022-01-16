

public class PBO060 {
    // public static void main(String[] args) throws Exception {
        public static void main(String[] args){
            DataMahasiswa060 mahasiswa1= new DataMahasiswa060();
            mahasiswa1.nim = "200401060";
            mahasiswa1.nama = "Yudi Hendrawan";
            mahasiswa1.jurusan = "Teknik Informatika";
            mahasiswa1.semester =3;


            DataMahasiswa060 mahasiswa2= new DataMahasiswa060();
            mahasiswa2.nim = "200401061";
            mahasiswa2.nama = "Yudi Hermawan";
            mahasiswa2.jurusan = "Teknik Informatika";
            mahasiswa2.semester =3;

            mahasiswa1.cetakData();
            mahasiswa2.cetakData();
    }
}
