package latihan_5;
public class Soal_g {
    //g. Menampilkan angka-angka kelipatan 5 yang sebelumnya juga angka kelipatan 5 didalam array tersebut di atas.
    public static void main(String[] args) {
    int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

    for (int i = 1; i < array.length; i++){
    if (array[i] % 5 == 0 && array[i-1] % 5 == 0) {
    System.out.println(array[i]);
}
}
}
}
