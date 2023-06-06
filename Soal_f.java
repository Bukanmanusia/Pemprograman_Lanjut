package latihan_5;
public class Soal_f {
    public static void main(String[] args) {
        // Menampilkan angka-angka ganjil yang diapit oleh angka genap dalam array
      
        int[] Arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
for (int i = 1; i < Arr.length - 1; i++) {
if (Arr[i] % 2 == 1 && Arr[i - 1] % 2 == 0 && Arr[i + 1] % 2 == 0) {
System.out.println(Arr[i]);
}
}
}
}

