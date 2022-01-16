
public class GajiKaryawan{
    String nama;
    float gaji, lembur;
    
    float hitungGaji(){
        float total = (gaji + lembur);
        return total;
    }
}