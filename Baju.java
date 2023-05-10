package demobaju;

public class Baju {
    String merk, warna, harga;
    int total;
    
    Baju(){
    }
    Baju (int total){
    }
    
    Baju (String merk, String warna, String harga){
    }
    
    void setInfoBaju (String merk, String warna, int total){
        System.out.println("Merk \t = " + merk + 
                "\nWarna \t = " + warna +
                "\nTotal \t = " + total);
        
    }
    
    String Produksi(){
        String x = "Baju Uniqlo ini terkenal dengan merk nya yang mendunia";
        System.out.println(x);
        return x;
        
    }
    
    void setHarga(String harga){
        System.out.println("Harga Baju = " + "Rp." + harga);
    }
}

//6. Jelaskan program yang sudah anda buat dengan Bahasa anda sendiri!
//Jawaban:
//Untuk membuat sebuah program, terlebih dahulu perlu dibuat yang Namanya class.
//Didalam class tersebut, saya membuat nama class nya adalah “Baju”, kemudian saya tambahkan variable didalamnya yaitu String dan int, lalu kemudian membuat 2 buah konduktor.
//Method yang dibuat terdiri dari method void dan method non-void
//Terakhir, melakukan instansiasi objek dari class tersebut dengan memanggil kembali konstruktor yang sudah di deklarasikan sebelumnya.

