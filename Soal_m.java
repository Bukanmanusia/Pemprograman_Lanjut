package latihan_5;

public class Soal_m {
    public static void main(String[] args) {
    //m. Menghitung jumlah angka-angka selisih yang ditampilkan pada poin I diatas
    System.out.println("m. Menghitung jumlah angka-angka selisih yang ditampilkan pada poin (i):");
 int totalSelisih = 0;
 for (int i = 0; i < - 1; i++) {
 int selisih = (i + 1) - i;
 System.out.print(selisih + " ");
 totalSelisih += selisih;
 }
 System.out.println();
 System.out.println("Total jumlah angka-angka selisih: " + totalSelisih);
    }
}


