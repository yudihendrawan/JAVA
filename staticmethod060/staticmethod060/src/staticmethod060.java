class datamobil{
    // Attribute non static
    String warna;
    // Attribute static
    static int kecepatanmaksimal = 150;
    //Method static
    static void tanggalmobil(){
        System.out.println(java.time.LocalDate.now());
        System.out.println("kecepatan maksimal" + kecepatanmaksimal);

    }
    //Method non static
    void maju(int tambahSpeed){
        System.out.println("warna mobil : " + warna);
        if (tambahSpeed > kecepatanmaksimal){
            System.out.println(tambahSpeed);
            System.out.println("Melebihi batas kecepatan");
            tanggalmobil();
        }else {
            System.out.println(tambahSpeed);
            System.out.println("Dibawah batas kecepatan maksimal");
            tanggalmobil();
        }
    }
}



public class staticmethod060 {
    public static void main(String[] args) throws Exception {
        //Memanggil method static
        datamobil.tanggalmobil();
        //Memanggil method non static
        System.out.println(datamobil.kecepatanmaksimal);
        datamobil car1 = new datamobil();
        car1.maju(20);
        
        
    }
}
