
package tayoo;

public class Tayoo {

    void firstMethod (String Merek_Mobil, String Warna_Mobil, int jumlah_roda, int numberPlateCode, String letterPlateCode){
        System.out.println("Merek Mobil     : " + Merek_Mobil);
        System.out.println("Jumlah Roda     : " + jumlah_roda);
        System.out.println("Warna Mobil     : " + Warna_Mobil);
        System.out.println("Plat Nomor      : " +  "BM " + numberPlateCode + "-" + letterPlateCode);
    }

    
        
    int secondMethod (int kecepatan, int waktu){
        System.out.println("Kecepatan Mobil/jam = " + kecepatan + " KM");
        System.out.println("Waktu               = " + waktu + " Jam");
        int totalRange = kecepatan  * waktu;
        return totalRange;
    }

}
