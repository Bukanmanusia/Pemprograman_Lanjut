package latihan_5;
public class Soal_j {
    //j. Menampilkan selisih angka-angka genap denagn angka setelahnya yang genap didalam array
        public static void main(String[] args) {
    int[] Array = {82,12,41,38,19,26,9,48,20,55,8,32,3};
    
for (int i = 0; i < Array.length - 1; i++) {
if (Array[i] % 2 == 0 && Array[i+1] % 2 == 0) {
    int selisih = Array [i+1] - Array[i];
        System.out.print(selisih + "; ");
}
}
}       
}

