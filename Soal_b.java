
package latihan_5;
public class Soal_b {
    public static void main(String[] args) {
    // b. Mencari sebuah angka di dalam array tersebut di atas
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
int target = 56;
    boolean found = false;
for (int i = 0; i < array.length; i++) {
if (array[i] == target) {
found = true;
break;
}
}
if(found) {
    System.out.print(" Angka ditemukan");
}else {
    System.out.println("Angka tidak ditemukan");
}
    }  
}

   
