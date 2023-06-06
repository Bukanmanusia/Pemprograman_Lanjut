package latihan_5;
public class Soal_h {
    //h. Menghitung jumlah angka didalam array 
    public static void main(String[] args) {
    int[] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int total = 0;
   for (int i = 0; i < nilai.length; i++) {
    total += nilai[i];
}
    System.out.println("Jumlah angka dalam array: " + total);
}
}

