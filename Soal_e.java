package latihan_5;
public class Soal_e {
public static void main(String[] args) {
        //e. Menampilkan angka-angka yang memiliki angka 2 di dalam array tersebut di atas.
        int[] numbers = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};  
        System.out.print("Angka-angka yang memiliki angka 2: "); 
        for(int number : numbers) { 
        String numberString = Integer.toString(number); 
        if(numberString.contains("2")) { System.out.print(number + " "); 
        }
        }
    }
}
