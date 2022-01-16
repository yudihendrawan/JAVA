


public class nilai {

    String nama; 
    int nilai1,nilai2,nilai3,nilai4;
    
    void IsiData(String Nama, int Nilai1, int Nilai2, int Nilai3, int Nilai4){
        nama = Nama;
        nilai1 = Nilai1;
        nilai2 = Nilai2;
        nilai3 = Nilai3;
        nilai4 = Nilai4;

    }

    void cetakData(){
        
        System.out.println("Nama Mahasiswa : "+nama);
        System.out.println("Nilai 1 : "+nilai1);
        System.out.println("Nilai 2 : "+nilai2);
        System.out.println("Nilai 3 : "+nilai3);
        System.out.println("Nilai 4 : "+nilai4);
    }
    int hitungnilai(){
        int hasil = (nilai1+nilai2+nilai3+nilai4)/4;
        return hasil;
    }
}