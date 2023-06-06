package latihan_5;
public class Soal_k {
   public static void main(String[] args) {
       //k.Menampilkan angka angka yang setelahnya bernilai lebih besar
  
    int[] Array = {82,12,41,38,19,26,9,48,20,55,8,32,3};
for(int i = 0; i < Array.length - 1; i++) {
    if(Array[i] < Array[i+1]) {
        System.out.print(Array[i] + " ");
}
}
        System.out.println();
}   
}
 
