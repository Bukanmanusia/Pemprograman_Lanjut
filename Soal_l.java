package latihan_5;

public class Soal_l {
public static void main(String[] args) {
//l.Menampilkan jumlah angka dengan angka setelahnya yang hasil penjumlahannya bernilai genap  di dalam array
  
           int[] Array = {82,12,41,38,19,26,9,48,20,55,8,32,3};
int totalgenap = 0;

for (int i = 0; i < Array.length - 1; i++) {
    int hasiltotal = Array[i] + Array[i+1];
if (hasiltotal % 2 == 0) {
    totalgenap += hasiltotal;
}
}
System.out.println("Jumlah angka dengan angka setelahnya yang hasil penjumlahannya genap didalam array adalah: " + totalgenap);
    }
}
    

