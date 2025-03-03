import java.util.Scanner;

/* contoh membaca integer menggunakan Class Scanner*/
public class BacaData {

     public static void main(String[] args) {

       int a;

	Scanner masukan;
	/* Program */

	System.out.print ("Contoh membaca dan menulis, ketik nilai integer\n");
	masukan = new Scanner(System.in);
	a = masukan.nextInt(); 
	/* coba ketik : masukan.nextInt(); ; Apa akibatnya ?*/
	System.out.print ("Nilai yang dibaca : "+ a);
     }
}
