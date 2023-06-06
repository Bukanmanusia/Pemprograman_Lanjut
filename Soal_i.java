package latihan_5;
public class Soal_i {
    //i.Menampilkan selisih angka-angka dengan angka setelahnya didalam array
    public static void main(String[] args) {
    int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
      int jumlah = 0;
   for (int i = 0; i < angka.length; i++) {
       jumlah += angka[i];
}
    System.out.println("Jumlah angka pada array: " + jumlah);
}
}

