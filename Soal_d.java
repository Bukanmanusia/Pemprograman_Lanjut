package latihan_5;
public class Soal_d {
    public static void main(String[] args) {
        //d. Menampilkan angka-angka kelipatan 3 didalam array
         int[]Arr = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        
    System.out.println("d. Menampilkan angka-angka kelipatan 3 di dalam array:");
 for (int Nilai : Arr) {
 if (Nilai % 3 == 0) {
 System.out.print(Nilai + " ");
 }
 }
 }
}

