package latihan_5;
public class Soal_n {
    public static void main(String[] args) {
    //n.Menampilkan jumlah angka-angka di dalam array tersebut di atas dengan seluruh angka-angka sebelumnya.
        int[] Array = {82,12,41,38,19,26,9,48,20,55,8,32,3};
                int nilai;
    
  System.out.println("n. Menampilkan jumlah angka-angka di dalam array dengan seluruh angka-angka sebelumnya:");
    int[] kumulatif = new int[Array.length];
 kumulatif[0] = Array[0];
 System.out.print(kumulatif[0] + " ");
 for (int i = 1; i < Array.length; i++) {
 kumulatif[i] = kumulatif[i - 1] + Array[i];
 System.out.print(kumulatif[i] + " ");
 }
 System.out.println();
}
}
