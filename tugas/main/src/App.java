
public class App {
    public static void main(String[] args) {

        nilai nilai1 = new nilai();
        
        nilai1.IsiData ("Yudi Hendrawan",80,79,78,77);
       
        nilai1.cetakData();
        System.out.println("Nilai akhir : " + nilai1.hitungnilai());

        System.out.println("==================");
        
        nilai nilai2 = new nilai();

        nilai2.IsiData ("Bayu Aryandi",90,89,88,87);

        nilai2.cetakData();

        System.out.println("Nilai akhir : " + nilai2.hitungnilai());

    }
}
